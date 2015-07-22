package ba.bitcamp.hajrudin.streams.readers.and.writers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 4652301123736271204L;

	private String name;
	private int year;

	public User(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", year=" + year + "]";
	}
	
	public static void main(String[] args){
		User u = new User("User", 1999);
		OutputStream os = null;
		try {
			os = new FileOutputStream("Data.txt", true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream is = null;
		
		try {
			ObjectOutputStream osw = new ObjectOutputStream(os);
			osw.writeObject(u);
			
			ObjectInputStream ois = new ObjectInputStream(is);
			User fromFile = (User) ois.readObject();
			
			System.out.println(fromFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
