package ba.bitcamp.hajrudin.orm.exercise;

public class Player {
	private Integer id;
	private String name;
	private String grade;

	public Player(Integer id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
