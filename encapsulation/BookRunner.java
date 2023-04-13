package encapsulation;

public class BookRunner {

	public static void main(String[] args) {
		Book book=new Book(123, "famous five", "neel");
		book.addReviews(new Reviews(123, "nice book", 5));
		System.out.println(book);

	}

}
