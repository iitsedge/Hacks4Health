
public class Location {
	public double x;
	public double y;
	public String city;
	public int pCount;
	
//data setters
	public Location(double x_, double y_, String city_) {
		this.x = x_;
		this.y = y_;
		this.city = city_;
		this.pCount = 0;
	}
	
	public void addCount() {
		pCount++;
	}
	public int getCount() {
		return pCount;
	}
}
