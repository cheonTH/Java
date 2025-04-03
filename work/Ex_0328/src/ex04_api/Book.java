package ex04_api;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.author = author;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "책 제목 : " + this.title+", 저자 : " + this.author;
	}
}
