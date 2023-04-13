
package encapsulation;

public class Reviews {
	private int id;
	private String description;
	private int rating;
	public Reviews(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	public String toString()
	{
		return String.format("id-[%d] description-[%s] rating-[%d]", id,description,rating);
		
	}


}
