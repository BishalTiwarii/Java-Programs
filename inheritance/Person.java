package inheritance;

public class Person {

	private String name;
	private String address;
	private String bloodGroup;
	private int mobNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getMobNo() {
		return mobNo ;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	
	public Person(String name, String address, String bloodGroup, int mobNo) 
	{
		this.name = name;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.mobNo = mobNo;
	}
	public String toString()
	{
		return String.format("name-[%s] address-[%s] bloodGroup-[%s] mobno-[%d]",name,address,bloodGroup,mobNo);
	
	
	}
   
	

}
