package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.ArrayList;

public class BookStore {
	ArrayList<Book> books = new ArrayList<Book>();

	public BookStore(ArrayList<Book> books) {
		super();
		this.books = books;
	}

	public void addBook(Book b6) {
		if(this.books.contains(b6)){
			int a = this.books.indexOf(b6);
			this.books.get(a).setNumber(this.books.get(a).getNumber()+b6.getNumber());
		} else {
			this.books.add(b6);
		}
	} 

	
	
	
}
