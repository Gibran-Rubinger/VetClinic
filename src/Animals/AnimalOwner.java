package Animals;


public class AnimalOwner extends AnimalsData {
	
	String ownerName = null;
	String ownerSurname = null;
	
	int phoneN1 = 0;
	int phoneN2 = 0;
	int phoneN3 = 0;
	
	

//	constructor to set the Attributes.
	public AnimalOwner(String ownerName, String ownerSurname, int phoneN1, int phoneN2, int phoneN3) {
		
		this.ownerName = ownerName;
		this.ownerSurname = ownerSurname;
		
		this.phoneN1 = phoneN1;
		this.phoneN2 = phoneN2;
		this.phoneN3 = phoneN3;
		

	}
//	this method will create a random email.
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerSurname() {
		return ownerSurname;
	}
	public void setOwnerSurname(String ownerSurname) {
		this.ownerSurname = ownerSurname;
	}
	public int getPhoneN1() {
		return phoneN1;
	}
	public void setPhoneN1(int phoneN1) {
		this.phoneN1 = phoneN1;
	}
	public int getPhoneN2() {
		return phoneN2;
	}
	public void setPhoneN2(int phoneN2) {
		this.phoneN2 = phoneN2;
	}
	public int getPhoneN3() {
		return phoneN3;
	}
	public void setPhoneN3(int phoneN3) {
		this.phoneN3 = phoneN3;
	}

	// creating the to String to override it.
	@Override
	public String toString() {
		return " Animal Owner: " +ownerName+" "+ownerSurname+"       Phone number: +353 "+phoneN1+"."+phoneN2+"."+phoneN3+"      E-mail:  "+ownerName.toLowerCase()+"."+ownerSurname.toLowerCase()+"@cct.ie";
	}
}
