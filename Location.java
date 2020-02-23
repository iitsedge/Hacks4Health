
public class Location {
	public double x;
	public double y;
	public String city;
	public String diseases[];
	public int pCount;
	
//data setters
	public Location(double x_, double y_, String city_) {
		this.x = x_;
		this.y = y_;
		this.city = city_;
		this.pCount = 1;
		this.diseases = new String[4];
	}
	 
	public void addCount() {
		pCount++;
	}
	public int getCount() {
		return pCount;
	}
	//setter
	public void setDisease(String name) {
		int i = 0;
		while (diseases[i] != null) {
			i++;
		}
		diseases[i] = name;
	}
}
