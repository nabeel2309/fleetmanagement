package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/staff")
public class StaffController
{
	@RequestMapping(method=RequestMethod.GET)
	public String before(HttpServletRequest request)
	{
		return "dashboard";
	}
}
