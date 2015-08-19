package ba.bitcamp.hajrudin.orm;

public abstract class Model {

	private String table_name;

	public String findByPk(Integer i) {
		return "Select * from " + this.table_name + " where id = " + i;
	}

	public String findByAttribute(String s1, String s2) {
		return "Select * from " + this.table_name + " where " + s1 + " = " + s2;
	}

}
