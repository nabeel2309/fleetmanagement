package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookingDAOImpl implements BookingDAO 
{
	List<Booking> list;
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
	@Override
	public Booking getBooking(int bookingid)
	{
		String query="select k from Booking k where k.bookingid=?";
		Object[] queryParam={bookingid};
		list=template.find(query,queryParam);
		Booking booking=new Booking();
		for(Booking b : list)
		{			
			booking=b;
		}
		return booking;
	}

}
