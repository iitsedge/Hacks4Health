
public class Doctor {
	int hospID;
	int drID;
	boolean writePermission;
		
//data setters
	public void setHospID(int ID) {
		hospID = ID;
	}
	public void setDrID(int ID) {
		drID = ID;
	}
	public void setWritePermission(boolean write) {
		writePermission = write;
	}
	
//data getters
	public int getHostID() {
		return hospID;
	}
	public int getDrID() {
		 return drID;
	}
	public boolean getWritePermission() {
		return writePermission;
	}
}

