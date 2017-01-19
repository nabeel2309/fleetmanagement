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
@RequestMapping("/addons")
public class AddOnsController
{
	@Autowired
	BookingDAO bdao;
	List<AddOns> list;
	@Autowired
	AddOnsDAO adao;
	@RequestMapping(method=RequestMethod.GET)
	public String before(HttpServletRequest request,ModelMap model)
	{
		list=new ArrayList<AddOns>();
		list=adao.getAddOns();
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		model.addAttribute("addonslist", list);
		model.addAttribute("mybooking",b);
		return "addons.definition";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String afterSubmit(@ModelAttribute("mybooking")Booking b1,BindingResult result, HttpServletRequest request)
	{
		String addoncost=request.getParameter("total");
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		b.setAddoncost(Integer.parseInt(addoncost));
		bdao.addAddOns(b);
		return "redirect:/login.do";		
	}

}
