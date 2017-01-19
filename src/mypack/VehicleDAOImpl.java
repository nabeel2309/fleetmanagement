package mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class VehicleDAOImpl implements VehicleDAO 
{
	List<VehicleCategory> list;
	@Autowired
	HibernateTemplate template;
	@Override
	public List<VehicleCategory> getVehicles()
	{
		list=new ArrayList<VehicleCategory>();
		String query="select k from VehicleCategory k";		
		list=template.find(query);
		return list;		
	}
}
