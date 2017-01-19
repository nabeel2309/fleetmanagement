package mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class AddOnsDAOImpl implements AddOnsDAO
{
	List<AddOns> list;
	@Autowired
	HibernateTemplate template;
	@Override
	public List<AddOns> getAddOns()
	{
		list=new ArrayList<AddOns>();
		String query="select a from AddOns a";
		list=template.find(query);
		return list;
	}

}
