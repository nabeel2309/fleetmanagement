package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/stafflogin")
public class StaffLoginController
{
	@Autowired
	LoginDAO ldao;
	@RequestMapping(method=RequestMethod.GET)
	public String before(HttpServletRequest request, ModelMap model)
	{
		model.addAttribute("mystaff", new Staff());
		return "stafflogin.definition";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String afterSubmit(@ModelAttribute("mystaff")Staff s, HttpServletRequest request)
	{
		String staffuname=request.getParameter("uname");
		String staffpasswd=request.getParameter("passwd");
		boolean status=ldao.checkStaff(staffuname, staffpasswd);
		if(status==true)
		{
			return "redirect:/staff.do";
		}
		else
			return "redirect:/stafflogin.do";
	}
}
