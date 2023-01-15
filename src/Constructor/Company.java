package Constructor;

public class Company {

	private String staffname;
	private String benifits;
	public String role;
	
	
	public Company(String staffname, String benifits, String role) {
		
		this.staffname = staffname;
		this.benifits = benifits;
		this.role = role;
	}

	public String getStaffname() {
		return staffname;
	}



	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}



	public String getBenifits() {
		return benifits;
	}



	public void setBenifits(String benifits) {
		this.benifits = benifits;
	}



	public String getUserInfo() {

		
		return staffname + " " + benifits + " " + role;
	}

}
