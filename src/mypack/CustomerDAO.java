package mypack;

import java.util.List;

public interface CustomerDAO
{
	public void updateBookingId(Customer c);
	public List<Customer> getCustomer(String uname, String passwd);
}
