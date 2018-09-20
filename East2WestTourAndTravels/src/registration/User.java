package registration;

import java.sql.Date;

public class User {

	private String userid;
	private String emailid;
	private String name;
	private String address;
	private Date dob;
	private String password;
	private String role;
	public User() {
		super();
	}
	public User(String userid, String emailid, String name, String address, Date dob, String password, String role) {
		super();
		this.userid = userid;
		this.emailid = emailid;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.password = password;
		this.role = role;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", emailid=" + emailid + ", name=" + name + ", address=" + address + ", dob="
				+ dob + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
