package mypack;

public interface BookingDAO
{
	public void addBooking(Booking b);
	public void addHub(Booking b);
	public void addVehicleCategory(Booking b);
	public void addAddOns(Booking b);
	public void updateCustomerid(Booking b);
	public Booking getBooking(int bookingid);
}