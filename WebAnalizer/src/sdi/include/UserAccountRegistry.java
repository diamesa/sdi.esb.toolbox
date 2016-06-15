package sdi.include;

public class UserAccountRegistry {
	
	public UserAccountRegistry(String[] args){
		if (args.length < 5) { System.out.println("Parameters missing");} 
		else {
					
					this.FName= args[0];
					this.LName= args[1];
					this.LogInID= args[2];
					this.eMail= args[3];
					this.BusinessAccountName= args[4];
					this.BusinessAccountNumber= args[5];
			 }
	}

	
	//Class Members
		
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
		public String getFName() {
			return FName;
		}
		public void setFName(String fName) {
			FName = fName;
		}
		public String getLName() {
			return LName;
		}
		public void setLName(String lName) {
			LName = lName;
		}
		public String getLogInID() {
			return LogInID;
		}
		public void setLogInID(String logInID) {
			LogInID = logInID;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}

		private String BusinessAccountName= null;
		private String BusinessAccountNumber= null;
		private String FName= null;
		private String LName= null;
		private String LogInID= null;
		private String eMail= null;
		
		
		
}
