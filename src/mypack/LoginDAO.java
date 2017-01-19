package mypack;

import java.util.List;

public interface LoginDAO
{
	public boolean checkLogin(String uname, String passwd);
	public List<Register> getRegister(String uname, String passwd);
}
