public class Book {
	private String title;
	private  String author;
	private  double price;
	
	private String setBookDetails(String t, String a, double p) {
		String Booktitle=title;
		author=author;
		price=price;
	}
	public void getBookDetails() {
	 return "Booktitle: " + title + " author: " + author + " price: " + price;
	
	}
	
}


