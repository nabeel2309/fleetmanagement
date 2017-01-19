package mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class HubDAOImpl implements HubDAO
{
	List<Hub> list;
	@Autowired
	HibernateTemplate template;

	@Override
	public List<Hub> getHubs(Booking b)
	{
		list=new ArrayList<Hub>();
		String query="select k from Hub k where k.cityname=? and k.statename=?";
		Object[] queryParam={b.getCityname(),b.getStatename()};
		list=template.find(query,queryParam);
		return list;
	}

	@Override
	public List<Hub> getRHubs(Booking b)
	{
		list=new ArrayList<Hub>();
		String query="select k from Hub k where k.cityname=? and k.statename=?";
		Object[] queryParam={b.getRcityname(),b.getRstatename()};
		list=template.find(query,queryParam);
		return list;
	}

}
