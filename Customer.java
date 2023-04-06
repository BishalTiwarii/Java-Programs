package bishal;

public class Customer {
	//state
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	
	//creating
	
	Customer(String name,Address homeAddress)
	{
		this.name=name;
		this.setHomeAddress(homeAddress);
	
	}
    
    //operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address worAddress) {
		this.workAddress = worAddress;
	}
	public String toString() 
	{
		return String.format("name- [%s] homeAddress-[%s] workAddress-[%S]", name,homeAddress,workAddress);
		
	}

}
