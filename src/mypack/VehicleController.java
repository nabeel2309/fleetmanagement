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
@RequestMapping("/vehiclecat")
public class VehicleController
{
	@Autowired
	BookingDAO bdao;
	@Autowired
	VehicleDAO vdao;
	List<VehicleCategory> list;
	@RequestMapping(method=RequestMethod.GET)
	public String before(HttpServletRequest request, ModelMap model)
	{
		list=new ArrayList<VehicleCategory>();
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		list=vdao.getVehicles();
		model.addAttribute("myvehicles",list);
		model.addAttribute("mybooking", b);
		return "vehiclecat.definition";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String afterSubmit(@ModelAttribute("mybooking")Booking b1,BindingResult result, HttpServletRequest request)
	{
		String vehiclecategoryid=request.getParameter("rdv1");
		Booking b=(Booking) request.getSession().getAttribute("bookingsession");
		b.setVehiclecategoryid(Integer.parseInt(vehiclecategoryid));
		bdao.addVehicleCategory(b);
		return "redirect:/addons.do";
	}
}
