package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehiclecategory")
public class VehicleCategory
{
	private int vehiclecategoryid;
	private String vehiclecategorydesc;
	private String imagepattern;
	private int dailyrate;
	private int weeklyrate;
	private int monthlyrate;
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public int getVehiclecategoryid() {
		return vehiclecategoryid;
	}
	public void setVehiclecategoryid(int vehiclecategoryid) {
		this.vehiclecategoryid = vehiclecategoryid;
	}
	@Column
	public String getVehiclecategorydesc() {
		return vehiclecategorydesc;
	}
	public void setVehiclecategorydesc(String vehiclecategorydesc) {
		this.vehiclecategorydesc = vehiclecategorydesc;
	}
	@Column
	public String getImagepattern() {
		return imagepattern;
	}
	public void setImagepattern(String imagepattern) {
		this.imagepattern = imagepattern;
	}
	@Column
	public int getDailyrate() {
		return dailyrate;
	}
	public void setDailyrate(int dailyrate) {
		this.dailyrate = dailyrate;
	}
	@Column
	public int getWeeklyrate() {
		return weeklyrate;
	}
	public void setWeeklyrate(int weeklyrate) {
		this.weeklyrate = weeklyrate;
	}
	@Column
	public int getMonthlyrate() {
		return monthlyrate;
	}
	public void setMonthlyrate(int monthlyrate) {
		this.monthlyrate = monthlyrate;
	}	
}
