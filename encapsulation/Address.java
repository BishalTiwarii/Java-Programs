package encapsulation;

public class Address {
	private String line1;
	private String city;
	private String zipCode;
	public Address(String line1, String city, String zipCode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zipCode = zipCode;
	}
	
	public String toString()
	{
		return String.format("line1-[%s] city-[%s] zipCode-[%s]",line1,city,zipCode);
		
	}
	

}
