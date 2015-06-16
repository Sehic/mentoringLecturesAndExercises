package ba.bitcamp.hajrudin.programming.with.objects;

public class Main {

	public static void main(String[] args) {
		System.out.println("User count: "+User.getUserCount());
		User u = new User("John", "Doe");
		System.out.println("User count: "+User.getUserCount());
		User u1 = new User("John", "Doe");
		System.out.println("User count: "+User.getUserCount());
		System.out.println(u.equals(u1));
		User u2 = new User(u1);
		System.out.println(u2.equals(u1));
	}

}
