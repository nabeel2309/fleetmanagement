package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff
{
	private int staffid;
	private String staffname;
	private String staffuname;
	private String staffpasswd;
	@Id
	@Column
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	@Column
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	@Column
	public String getStaffuname() {
		return staffuname;
	}
	public void setStaffuname(String staffuname) {
		this.staffuname = staffuname;
	}
	@Column
	public String getStaffpasswd() {
		return staffpasswd;
	}
	public void setStaffpasswd(String staffpasswd) {
		this.staffpasswd = staffpasswd;
	}	
}
