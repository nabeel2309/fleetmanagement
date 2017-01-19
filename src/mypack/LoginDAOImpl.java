package mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class LoginDAOImpl implements LoginDAO
{
	List<Register> list;
	@Autowired
	HibernateTemplate template;

	@Override
	public boolean checkLogin(String uname, String passwd)
	{
		String query="select k from Register k where username=? and password=?";
		Object[] queryParam={uname, passwd};
		List l=template.find(query,queryParam);
		if(l.size()==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public List<Register> getRegister(String uname, String passwd)
	{
		list=new ArrayList<Register>();
		String query="select k from Register k where username=? and password=?";
		Object[] queryParam={uname, passwd};
		list=template.find(query,queryParam);
		return list;
	}

}