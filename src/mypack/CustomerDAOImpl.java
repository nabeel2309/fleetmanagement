package mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl implements CustomerDAO
{
	List<Customer> list;	
	@Autowired
	HibernateTemplate template;

	@Override
	public void updateBookingId(Customer c)
	{		
		template.update(c);
	}

	@Override
	public List<Customer> getCustomer(String uname, String passwd)
	{
		list=new ArrayList<Customer>();
		List<Register> rlist=new ArrayList<Register>();
		rlist=template.find("select x from Register x where username=? and password=?", new Object[]{uname, passwd});
		for(Register r : rlist)
		{
			String query="select k from Customer k where registerid=?";
			Object[] queryParam={r.getRegisterid()};
			list=template.find(query,queryParam);
		}
		return list;
	}

	@Override
	public void insertRegisterId(Customer c)
	{
		template.save(c);
	}

}
