package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class RegisterDAOImpl implements RegisterDAO
{
	List<Register> list;
	@Autowired
	HibernateTemplate template;

	@Override
	public void addRegistered(Register register)
	{
		template.save(register);
	}

	@Override
	public Register getRegister(int registerid)
	{
		String query="select k from Register k where registerid=?";
		Object[] queryParam={registerid};
		list=template.find(query,queryParam);
		Register register=new Register();
		for(Register r : list)
		{
			register=r;
		}
		return register;
	}
}