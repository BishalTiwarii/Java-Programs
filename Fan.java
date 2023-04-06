package bishal;

public class Fan {
private String make;
private double radius;
private int speed;
private boolean isOn;
public Fan(String make, double radius, int i, boolean b) {
	this.setMake(make);
	this.setRadius(radius);
	this.setSpeed(i);
	this.setIsOn(b);
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public boolean getIsOn() {
	return isOn;
}
public void setIsOn(boolean isOn) {
	this.isOn = isOn;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public void switchoff()
{
	this.speed=0;
	this.isOn=false;
}
public void switchOn()
{
	this.speed=1;
}
public String toString()
{
	return String.format("make- [%S] radius- [%s] speed- [%d] isOn-[%b]", make,radius,speed,isOn);
	
	}


}
