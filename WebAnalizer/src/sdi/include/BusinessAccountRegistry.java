package sdi.include;

public class BusinessAccountRegistry {
	
	
	public BusinessAccountRegistry(String[] args){
		if(args.length < 8){
			System.out.println("Usage: to create a  BAR instance yu must supply a Array containing 8 Strings");
		}
		else{
				this.BusinessAccountName= args[0];
				this.BusinessAccountNumber= args[1];
				this.CIM_id=                args[2];
				this.Address=args[3];
				this.City= args[4];
				this.State= args[5];
				this.Country= args[6];
				this.ZIP= args[7];
		}
	}
	
	
//Class Members
	
	/*@Override
	public String toString() {
		return "BusinessAccountRegistry [BusinessAccountName=" + BusinessAccountName + ", BusinessAccountNumber="
				+ BusinessAccountNumber + ", CIM_id=" + CIM_id + ", Address=" + Address + ", City=" + City + ", State="
				+ State + ", Country=" + Country + ", ZIP=" + ZIP + "]";
	}*/


	public String getBusinessAccountName() {
		return BusinessAccountName;
	}
	public void setBusinessAccountName(String businessAccountName) {
		BusinessAccountName = businessAccountName;
	}
	public String getBusinessAccountNumber() {
		return BusinessAccountNumber;
	}
	public void setBusinessAccountNumber(String businessAccountNumber) {
		BusinessAccountNumber = businessAccountNumber;
	}
	public String getCIM_id() {
		return CIM_id;
	}
	public void setCIM_id(String cIM_id) {
		CIM_id = cIM_id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getZIP() {
		return ZIP;
	}
	public void setZIP(String zIP) {
		ZIP = zIP;
	}
	
	private String BusinessAccountName= null;
	private String BusinessAccountNumber= null;
	private String CIM_id= null;
	private String Address= null;
	private String City= null;
	private String State= null;
	private String Country= null;
	private String ZIP= null;
	

}
