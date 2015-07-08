package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("Knjiga 1","Autor 1", 1);
		Book b2 = new Book("Knjiga 2", "Autor 2", 2);
		Book b3 = new Book("Knjiga 3", "Autor 3", 3);
		Book b4 = new Book("Knjiga 4", "Autor 4", 4);
		Book b5 = new Book("Knjiga 5", "Autor 5", 5);
		Book[] books = {b1,b2,b3,b4,b5};
		
		for(Book bb:books){
			System.out.println(bb.toString());
		}
		System.out.println("Equals books: "+b1.equals(b2));
		
		ArrayList<Book> books1 = new ArrayList<Book>(Arrays.asList(b1,b2,b3,b4,b5));
		
		System.out.println(books1);
		System.out.println(books1.get(1).equals(books1.get(0)));
		
		BookStore bs = new BookStore(books1);
		
		Book b6 = new Book("Knjiga 6");
		Book b7 = new Book("Knjiga 1","Autor 1", 1);
		
		
		bs.addBook(b6);
		bs.addBook(b7);
		
		System.out.println(bs.books);
		
		
		
	}
}
