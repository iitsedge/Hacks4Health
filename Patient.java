public class Patient{
	private int patID;
	private int patAge;
	protected String affliction;
	protected Location city;
	
//constructor
	public Patient(int pID,int pAge,String aAff, Location pCity) {
		this.patID = pID;
		this.patAge = pAge;
		this.affliction = aAff;	
		this.city = pCity;
	}
	

	
//data setters
	public void setPatID(int ID) {
		patID = ID;
	}
	public void setPatAge(int age) {
		patAge = age;
	}
	public void setAffliction(String aff) {
		affliction = aff;
	}
}

