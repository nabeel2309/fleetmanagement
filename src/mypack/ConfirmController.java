package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/confirm")
public class ConfirmController
{
	@RequestMapping(method= RequestMethod.GET)
	public String before(HttpServletRequest request, ModelMap model)
	{
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		model.addAttribute("mybooking", b);
		return "confirm.definition";
	}
}
