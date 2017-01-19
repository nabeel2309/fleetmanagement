package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hub")
public class Hub
{
	private int hubid;
	private String hubname;
	private String hubaddress;
	private String cityname;
	private String statename;
	private int hubphone;
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public int getHubid() {
		return hubid;
	}
	public void setHubid(int hubid) {
		this.hubid = hubid;
	}
	@Column
	public String getHubname() {
		return hubname;
	}
	public void setHubname(String hubname) {
		this.hubname = hubname;
	}
	@Column
	public String getHubaddress() {
		return hubaddress;
	}
	public void setHubaddress(String hubaddress) {
		this.hubaddress = hubaddress;
	}
	@Column
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	@Column
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	@Column
	public int getHubphone() {
		return hubphone;
	}
	public void setHubphone(int hubphone) {
		this.hubphone = hubphone;
	}	
}
