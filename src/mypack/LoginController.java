package mypack;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController
{
	@Autowired
	BookingDAO bdao;
	@Autowired
	CustomerDAO cdao;
	List<Customer> list;
	@Autowired
	LoginDAO ldao;
	@RequestMapping(method=RequestMethod.GET)
	public String before(HttpServletRequest request,ModelMap model)
	{
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		model.addAttribute("mybooking", b);
		model.addAttribute("mycustomer", new Register());
		return "login.definition";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String afterSubmit(@ModelAttribute("myregister")Register register, BindingResult result, HttpServletRequest request)
	{		
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("passwd");		
		boolean flag=ldao.checkLogin(uname,passwd);
		if(flag==true)
		{
			list=new ArrayList<Customer>();
			list=cdao.getCustomer(uname, passwd);
			for(Customer c : list)
			{				
				request.getSession().setAttribute("customersession", c);
			}
			return "redirect:/confirm.do";
		}
		else
			return "login.definition";
	}	
}