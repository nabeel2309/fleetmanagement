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
@RequestMapping("/home")
public class BookingController
{	
	@Autowired
	BookingDAO bdao;
	private List<String> smap;
	
	@RequestMapping(method=RequestMethod.GET)
	public String before(HttpServletRequest request, ModelMap model)
	{
		Booking b=new Booking();
		smap=new ArrayList<String>();
		smap.add("Maharashtra");
		smap.add("Gujarat");
		smap.add("Delhi");
		smap.add("Rajasthan");
		smap.add("Punjab");
		model.addAttribute("mystate",smap);
		model.addAttribute("mybooking",b);
		return "home.definition";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String afterSubmit(@ModelAttribute("mybooking")Booking b,BindingResult result,HttpServletRequest request)
	{
		//System.out.println(b.getPickupdate());
		request.getSession().setAttribute("bookingsession", b);
		bdao.addBooking(b);
		return "redirect:/location.do";			
	}

	public List<String> getSmap()
	{		
		return smap;
	}
	public void setSmap(List<String> smap) {
		this.smap = smap;
	}
}
