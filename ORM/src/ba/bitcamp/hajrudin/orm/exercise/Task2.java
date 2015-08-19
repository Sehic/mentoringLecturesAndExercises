package ba.bitcamp.hajrudin.orm.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		Connection conn = null;
		ArrayList<Team> list = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
			Statement statement = conn.createStatement();
			list = readFromBase();
			System.out.println(list);
			sortByScorePlus();
			sortByPoints();
			System.out.println(getKnokOut());
			System.out.println(getWorstTeamByPoints());
			System.out.println(getList(28));
			System.out.println(getWorstTeam());
			System.out.println(isSame("A"));
			System.out.println(isSame("B"));
			System.out.println(isSame("C"));
			System.out.println(isSame("D"));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<Team> readFromBase() throws SQLException {
		ArrayList<Team> team = new ArrayList<Team>();
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery("select * from team");

		while (result.next()) {
			int id = result.getInt(1);
			String name = result.getString(2);
			int winns = result.getInt(3);
			int loses = result.getInt(4);
			int points = result.getInt(5);
			int scorePlus = result.getInt(6);
			int scoreMinus = result.getInt(7);
			String fromGroup = result.getString(8);
			Team t = new Team(id, name, winns, loses, points, scorePlus,
					scoreMinus, fromGroup);
			team.add(t);
		}
		return team;
	}

	public static void sortByScorePlus() throws SQLException {
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
		Statement statement = conn.createStatement();
		String sort = "select * from team order by scoredplus DESC";
		ResultSet result = statement.executeQuery(sort);
		ArrayList<Team> team = new ArrayList<Team>();
		while (result.next()) {
			int id = result.getInt(1);
			String name = result.getString(2);
			int winns = result.getInt(3);
			int loses = result.getInt(4);
			int points = result.getInt(5);
			int scorePlus = result.getInt(6);
			int scoreMinus = result.getInt(7);
			String fromGroup = result.getString(8);
			Team t = new Team(id, name, winns, loses, points, scorePlus,
					scoreMinus, fromGroup);
			team.add(t);
		}
		System.out.println(team);
	}

	public static void sortByPoints() throws SQLException {
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
		Statement statement = conn.createStatement();
		String sort = "select * from team order by fromgroup,points";
		ResultSet result = statement.executeQuery(sort);
		ArrayList<Team> team = new ArrayList<Team>();
		while (result.next()) {
			int id = result.getInt(1);
			String name = result.getString(2);
			int winns = result.getInt(3);
			int loses = result.getInt(4);
			int points = result.getInt(5);
			int scorePlus = result.getInt(6);
			int scoreMinus = result.getInt(7);
			String fromGroup = result.getString(8);
			Team t = new Team(id, name, winns, loses, points, scorePlus,
					scoreMinus, fromGroup);
			team.add(t);
		}
		System.out.println(team);
	}

	public static ArrayList<Team> getKnokOut() throws SQLException {
		ArrayList<Team> team = new ArrayList<Team>();
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
		Statement statement = conn.createStatement();
		String sort = "select * from team order by fromgroup,points";
		ResultSet result = statement.executeQuery(sort);
		while (result.next()) {
			if (result.getInt(5) > 4) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int winns = result.getInt(3);
				int loses = result.getInt(4);
				int points = result.getInt(5);
				int scorePlus = result.getInt(6);
				int scoreMinus = result.getInt(7);
				String fromGroup = result.getString(8);
				Team t = new Team(id, name, winns, loses, points, scorePlus,
						scoreMinus, fromGroup);
				team.add(t);
			}
		}
		return team;
	}

	public static Team getWorstTeamByPoints() throws SQLException {
		ArrayList<Team> team = new ArrayList<Team>();
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
		Statement statement = conn.createStatement();
		String sort = "select * from team order by fromgroup,points";
		ResultSet result = statement.executeQuery(sort);
		while (result.next()) {
			if (result.getInt(5) == 3 && !result.getString(2).equals("Russia")) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int winns = result.getInt(3);
				int loses = result.getInt(4);
				int points = result.getInt(5);
				int scorePlus = result.getInt(6);
				int scoreMinus = result.getInt(7);
				String fromGroup = result.getString(8);
				Team t = new Team(id, name, winns, loses, points, scorePlus,
						scoreMinus, fromGroup);
				team.add(t);
			}
		}
		Team t = team.get(0);
		for (Team t1 : team) {
			if (t.getScorePlus() > t1.getScorePlus())
				t = t1;
		}
		return t;

	}

	public static ArrayList<Team> getList(int a) throws SQLException {
		ArrayList<Team> team = new ArrayList<Team>();
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
		Statement statement = conn.createStatement();
		String sort = "select * from team order by fromgroup,points";
		ResultSet result = statement.executeQuery(sort);
		while (result.next()) {
			if (a > result.getInt(6) - result.getInt(7)) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int winns = result.getInt(3);
				int loses = result.getInt(4);
				int points = result.getInt(5);
				int scorePlus = result.getInt(6);
				int scoreMinus = result.getInt(7);
				String fromGroup = result.getString(8);
				Team t = new Team(id, name, winns, loses, points, scorePlus,
						scoreMinus, fromGroup);
				team.add(t);
			}

		}
		return team;
	}
	
	public static Team getWorstTeam() throws SQLException {
		ArrayList<Team> team = new ArrayList<Team>();
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
		Statement statement = conn.createStatement();
		String sort = "select * from team order by fromgroup,points";
		ResultSet result = statement.executeQuery(sort);
		while (result.next()) {
			if (result.getInt(5) == 3) {
				int id = result.getInt(1);
				String name = result.getString(2);
				int winns = result.getInt(3);
				int loses = result.getInt(4);
				int points = result.getInt(5);
				int scorePlus = result.getInt(6);
				int scoreMinus = result.getInt(7);
				String fromGroup = result.getString(8);
				Team t = new Team(id, name, winns, loses, points, scorePlus,
						scoreMinus, fromGroup);
				team.add(t);
			}
		}
		Team t = team.get(0);
		for (Team t1 : team) {
			int a = t.getScorePlus() - t.getScoreMinus();
			if (a > t1.getScorePlus() - t1.getScoreMinus())
				t = t1;
		}
		return t;

	}
	
	public static boolean isSame(String group) throws SQLException{
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:/Users/hajrudin.sehic/Desktop/standings.db");
		Statement statement = conn.createStatement();
		String sort = "select * from team where fromgroup = '"+group+"'";
		ResultSet result = statement.executeQuery(sort);
		int max = 0;
		int min = 0;
		while (result.next()) {
				max += result.getInt(6);
				min += result.getInt(7);
			}
		if(max == min)
			return true;
		return false;
	}

}
