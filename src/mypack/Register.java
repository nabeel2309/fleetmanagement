package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="register")
public class Register
{
	private int registerid;
	private String customerfname;
	private String customerlname;
	private String customeraddress;
	private String customeremailId;
	private String customercity;
	private String customerphoneno;
	private String customerzipcode;
	private String customercreditCardType;
	private String customercreditCardNumber;
	private String customerdrivingLicenseNumber;
	private String customerdrivingLicenseDate;
	private String customerdateofBirth;
	private String customerpassportNumber;
	private String username;
	private String password;
	private String confirmpassword;
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int getRegisterid() {
		return registerid;
	}
	public void setRegisterid(int registerid) {
		this.registerid = registerid;
	}
	@Column
	@NotEmpty(message="First Name can not be empty")
	//@Pattern(regexp = "^[a-zA-Z]+$", message = "Firstname must contain characters")
	public String getCustomerfname() {
		return customerfname;
	}
	public void setCustomerfname(String customerfname) {
		this.customerfname = customerfname;
	}
	@Column
	@NotEmpty(message="Last Name can not be empty")
	//@Pattern(regexp = "^[a-zA-Z]+$", message = "Last Name must contain characters")
	public String getCustomerlname() {
		return customerlname;
	}
	public void setCustomerlname(String customerlname) {
		this.customerlname = customerlname;
	}
	@Column
	@NotEmpty(message="Address can not be empty")
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	@Column
	@NotEmpty(message="Email can not be empty")
	@Email(message="Invalid EmailId")
	public String getCustomeremailId() {
		return customeremailId;
	}
	public void setCustomeremailId(String customeremailId) {
		this.customeremailId = customeremailId;
	}
	@Column
	@NotEmpty(message="City can not be empty")
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	@Column
	@NotEmpty(message="Customer_Phone no. compulsory")
	//@Pattern(regexp = "^[0-9]{10}+$", message = "Customer Phone no. must contain 10 digits")
	public String getCustomerphoneno() {
		return customerphoneno;
	}
	public void setCustomerphoneno(String customerphoneno) {
		this.customerphoneno = customerphoneno;
	}
	@Column
	@NotEmpty(message="ZipCode compulsory")
	//@Pattern(regexp = "^[0-9]{6}+$", message = "ZipCode must contain 6 digits")
	public String getCustomerzipcode() {
		return customerzipcode;
	}
	public void setCustomerzipcode(String customerzipcode) {
		this.customerzipcode = customerzipcode;
	}
	@Column
	@NotEmpty(message="CreditCardType can not be empty")
	public String getCustomercreditCardType() {
		return customercreditCardType;
	}
	public void setCustomercreditCardType(String customercreditCardType) {
		this.customercreditCardType = customercreditCardType;
	}
	@Column
	@NotEmpty(message="Customer CreditCardNumber can not be empty")
	//@Pattern(regexp = "^[0-9]{16}+$", message = "CreditCardNumber must contain 16 digits")
	public String getCustomercreditCardNumber() {
		return customercreditCardNumber;
	}
	public void setCustomercreditCardNumber(String customercreditCardNumber) {
		this.customercreditCardNumber = customercreditCardNumber;
	}
	@Column	
	@NotEmpty(message="DrivingLicenseNumber can not be empty")
	public String getCustomerdrivingLicenseNumber() {
		return customerdrivingLicenseNumber;
	}
	public void setCustomerdrivingLicenseNumber(String customerdrivingLicenseNumber) {
		this.customerdrivingLicenseNumber = customerdrivingLicenseNumber;
	}
	@Column	
	public String getCustomerdrivingLicenseDate() {
		return customerdrivingLicenseDate;
	}
	public void setCustomerdrivingLicenseDate(String customerdrivingLicenseDate) {
		this.customerdrivingLicenseDate = customerdrivingLicenseDate;
	}
	@Column
	public String getCustomerdateofBirth() {
		return customerdateofBirth;
	}
	public void setCustomerdateofBirth(String customerdateofBirth) {
		this.customerdateofBirth = customerdateofBirth;
	}
	@Column
	@NotEmpty(message="PassportNumber can not be empty")
	public String getCustomerpassportNumber() {
		return customerpassportNumber;
	}
	public void setCustomerpassportNumber(String customerpassportNumber) {
		this.customerpassportNumber = customerpassportNumber;
	}
	@Column
	@NotEmpty(message="user name can not be empty")
	//@Length(min=4,max=20,message="user name must be between ${min} and ${max} characters")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column
	//@NotEmpty(message="Password cannot be blank")
	//@Size(min=4,max=8,message="Password should be minimum of ${min} and maximum of ${max}")
	//@Pattern(regexp = "^[A-Za-z]+[0-9]+$", message = "password must contain characters as well as digits")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column
	//@Transient
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}		
}
