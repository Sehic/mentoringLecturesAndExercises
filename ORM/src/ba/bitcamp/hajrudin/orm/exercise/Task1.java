package ba.bitcamp.hajrudin.orm.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		Connection conn = null;
		ArrayList<Player> list = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/test.db");
			Statement statement = conn.createStatement();
			String createTable = "create table player( id integer primary key, full_name varchar(50),grade varchar(1))";
			statement.executeUpdate(createTable);
			statement
					.executeUpdate("insert into player values (null, 'Njegos S.', 'B')");
			statement
					.executeUpdate("insert into player values (null, 'Dzanan M.', 'A')");
			statement
					.executeUpdate("insert into player values (null, 'Sani C.', 'B')");
			statement
					.executeUpdate("insert into player values (null, 'Timur O.', 'C')");

			ResultSet result = statement.executeQuery("select * from player");

			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				String grade = result.getString(3);

				Player p = new Player(id, name, grade);
				list.add(p);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		System.out.println(list);
		Player p1 = null;
		for (Player p : list) {
			if (p.getGrade().equals("A")) {
				p1 = p;
			}
		}

		System.out.println("Player with best grade: " + p1.toString());

		for (Player p : list) {
			String name = p.getName();
			String[] arr = name.split(" ");
			if (arr[0].length() <= 5) {
				System.out.println(arr[0]);
			}
		}

	}
}
