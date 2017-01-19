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
@RequestMapping("/location")
public class HubController
{
	List<Hub> list;
	List<Hub> rlist;
	@Autowired
	HubDAO hdao;
	@Autowired
	BookingDAO bdao;
	@RequestMapping(method=RequestMethod.GET)
	public String before(HttpServletRequest request, ModelMap model)
	{
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		list=new ArrayList<Hub>();
		list=hdao.getHubs(b);
		rlist=hdao.getRHubs(b);
		model.addAttribute("hublist",list);
		model.addAttribute("mybooking", b);
		model.addAttribute("rhublist",rlist);
		return "location.definition";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String afterSubmit(@ModelAttribute("mybooking")Booking b1,BindingResult result,HttpServletRequest request)
	{
		String hubid=request.getParameter("rd1");
		String rhubid=request.getParameter("rd2");
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		b.setHubid(Integer.parseInt(hubid));
		if(rhubid!=null)
		{		
			b.setRhubid(Integer.parseInt(rhubid));	
		}
		bdao.addHub(b);
		return "redirect:/vehiclecat.do";
	}
}
