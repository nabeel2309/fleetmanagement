package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class RegisterDAOImpl implements RegisterDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public void addRegistered(Register register)
	{
		template.save(register);
	}
}