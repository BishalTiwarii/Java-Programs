package encapsulation;
import java.util.ArrayList;

public class Book {
	private int id;
	private String bookName;
	private String author;
	private ArrayList<Reviews> reviews=new ArrayList<>();
	
	
	public Book(int id, String bookName, String author) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		
	}
	
	public void addReviews(Reviews reviews)
	{
		this.reviews.add(reviews);
	}
	public String toString()
	{
		return String.format("id-[%d] bookName-[%s] author-[%s] reviews-[%s]",id,bookName,author,reviews);
		
	}
}
