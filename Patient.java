public class Patient{
	private int patID;
	private int patAge;
	protected String affliction;
	
//constructor
	public Patient(int pID,int pAge,String aAff) {
		this.patID = pID;
		this.patAge = pAge;
		this.affliction = aAff;	

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

