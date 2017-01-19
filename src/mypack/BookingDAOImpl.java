package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookingDAOImpl implements BookingDAO 
{
	@Autowired
	HibernateTemplate template;
	@Override
	public void addBooking(Booking b)
	{
		template.save(b);
	}
	@Override
	public void addHub(Booking b) 
	{
		template.update(b);		
	}
	@Override
	public void addVehicleCategory(Booking b)
	{
		template.update(b);				
	}
	@Override
	public void addAddOns(Booking b)
	{
		template.update(b);	
	}
	@Override
	public void updateCustomerid(Booking b)
	{
		template.update(b);		
	}

}
