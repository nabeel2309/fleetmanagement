package mypack;

import java.util.List;

public interface HubDAO
{
	public List<Hub> getHubs(Booking b);
	public List<Hub> getRHubs(Booking b);
}
