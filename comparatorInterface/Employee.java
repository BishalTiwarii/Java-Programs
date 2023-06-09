package comparatorInterface;

public class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.setName(name);
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}

    public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("id-[%d] name-[%s]",id,name);
		
	}
	
			
}
	
	