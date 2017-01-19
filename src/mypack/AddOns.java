package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addons")
public class AddOns
{
	private int addonsid;
	private String addonstype;
	private int addonscost;
	@Id
	@Column
	public int getAddonsid() {
		return addonsid;
	}
	public void setAddonsid(int addonsid) {
		this.addonsid = addonsid;
	}
	@Column
	public String getAddonstype() {
		return addonstype;
	}
	public void setAddonstype(String addonstype) {
		this.addonstype = addonstype;
	}
	@Column
	public int getAddonscost() {
		return addonscost;
	}
	public void setAddonscost(int addonscost) {
		this.addonscost = addonscost;
	}	
}
