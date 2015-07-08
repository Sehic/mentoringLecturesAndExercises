package ba.bitcamp.hajrudin.array.list.exercise;

public class Book {
	private String name;
	private String author;
	private int number;
	

	public Book(String name) {
		super();
		this.name = name;
	}

	public Book(String name, String author, int number) {
		super();
		this.name = name;
		this.author = author;
		this.number = number;
	}
	
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", number="
				+ number + "]";
	}
	
	
	
	
}
