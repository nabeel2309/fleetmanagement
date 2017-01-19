package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class RegisterController
{
	@Autowired
	RegisterDAO rdao;
	@RequestMapping(method=RequestMethod.GET)
	public String before(HttpServletRequest request, ModelMap model)
	{
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		model.addAttribute("mybooking", b);
		model.addAttribute("myregister", new Register());
		return "register.definition";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String afterSubmit(@ModelAttribute("myregister")Register register, BindingResult result, HttpServletRequest request)
	{
		request.getSession().setAttribute("registersession", register);
		rdao.addRegistered(register);
		return "redirect:/login.do";		
	}
}