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
	@Override
	public VehicleCategory getVehicleCategory(int vehiclecategoryid)
	{
		VehicleCategory vc=new VehicleCategory();
		String query="select k from VehicleCategory k where vehiclecategoryid=?";
		Object[] queryParam={vehiclecategoryid};
		list=new ArrayList<VehicleCategory>();
		list=template.find(query, queryParam);
		for(VehicleCategory v : list)
		{
			vc=v;
		}
		return vc;
	}
}
