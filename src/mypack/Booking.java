package mypack;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Booking
{
	private int bookingid;
	private Date bookingdate;
	private Date pickupdate;
	private Date returndate;
	private String airportcode;
	private String rairportcode;
	private String statename;
	private String cityname;
	private String rstatename;
	private String rcityname;
	private int hubid;
	private int rhubid;
	private int vehiclecategoryid;
	private int addoncost;
	private int customerid;
	
	@Column(name="bookingid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	@Column
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	@Column
	public Date getPickupdate() {
		return pickupdate;
	}
	public void setPickupdate(Date pickupdate) {
		this.pickupdate = pickupdate;
	}
	@Column
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	@Column
	public String getAirportcode() {
		return airportcode;
	}
	public void setAirportcode(String airportcode) {
		this.airportcode = airportcode;
	}
	@Column
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	@Column
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	@Column
	public String getRstatename() {
		return rstatename;
	}
	public void setRstatename(String rstatename) {
		this.rstatename = rstatename;
	}
	@Column
	public String getRcityname() {
		return rcityname;
	}
	public void setRcityname(String rcityname) {
		this.rcityname = rcityname;
	}
	@Column
	public int getHubid() {
		return hubid;
	}
	public void setHubid(int hubid) {
		this.hubid = hubid;
	}
	@Column
	public int getRhubid() {
		return rhubid;
	}
	public void setRhubid(int rhubid) {
		this.rhubid = rhubid;
	}
	@Column
	public int getVehiclecategoryid() {
		return vehiclecategoryid;
	}
	public void setVehiclecategoryid(int vehiclecategoryid) {
		this.vehiclecategoryid = vehiclecategoryid;
	}
	@Column
	public int getAddoncost() {
		return addoncost;
	}
	public void setAddoncost(int addoncost) {
		this.addoncost = addoncost;
	}
	@Column
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	@Column
	public String getRairportcode() {
		return rairportcode;
	}
	public void setRairportcode(String rairportcode) {
		this.rairportcode = rairportcode;
	}	
	
}
