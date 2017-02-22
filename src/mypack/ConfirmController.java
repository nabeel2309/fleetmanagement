package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/confirm")
public class ConfirmController
{
	@Autowired
	RegisterDAO rdao;
	@Autowired
	BookingDAO bdao;
	@Autowired
	VehicleDAO vdao;
	@Autowired
	HubDAO hdao;	
	@RequestMapping(method= RequestMethod.GET)
	public String before(HttpServletRequest request, ModelMap model)
	{
		Customer c=(Customer) request.getSession().getAttribute("customersession");
		Booking b=bdao.getBooking(c.getBookingid());
		Register r=rdao.getRegister(c.getRegisterid());
		VehicleCategory v=vdao.getVehicleCategory(b.getVehiclecategoryid());
		Hub h=hdao.getHub(b.getHubid());
		model.addAttribute("mybooking", b);
		model.addAttribute("mycustomer",r);
		model.addAttribute("myvehicle",v);
		model.addAttribute("myhub",h);
		return "confirm.definition";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String afterSubmit(HttpServletRequest request)
	{
		request.getSession().removeAttribute("bookingsession");
		request.getSession().removeAttribute("customersession");
		request.getSession().removeAttribute("registersession");
		return "index";
	}
}
