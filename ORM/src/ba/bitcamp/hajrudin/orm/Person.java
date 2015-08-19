package ba.bitcamp.hajrudin.orm;

public class Person extends Model {
	private Integer id;
	private String name;
	private String table_name;

	public Person(Integer id, String name, String table_name) {
		super();
		this.id = id;
		this.name = name;
		this.table_name = table_name;
	}

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
