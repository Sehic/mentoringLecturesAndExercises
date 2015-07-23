package ba.bitcamp.hajrudin.test;

public class Main {
	public static void main(String[] args) {
		Eksponat eks1 = new Eksponat("Puska", "Ovo je prvi eksponat");
		Eksponat eks2 = new Eksponat("Auto", "Ovo je drugi eksponat");
		Eksponat eks3 = new Eksponat("Skelet", "Ovo je treci eksponat");
		WorksOfArt w1 = new WorksOfArt("Eksponat art 1", "Eksponat art prvi", "Autor 1", 0);
		WorksOfArt w2 = new WorksOfArt("Eksponat art 2", "Eksponat art drugi", "Autor 2", 1);
		WorksOfArt w3 = new WorksOfArt("Eksponat art 3", "Eksponat art treci", "Autor 3", 3);
		HistoricalArtifact h1 = new HistoricalArtifact("Eksponat history 1", "History eksponat prvi", "Porijeklo 1", 0);
		HistoricalArtifact h2 = new HistoricalArtifact("Eksponat history 2", "History eksponat drugi", "Porijeklo 2", 1);
		HistoricalArtifact h3 = new HistoricalArtifact("Eksponat history 3", "History eksponat treci", "Porijeklo 3", 2);
		Employee e1 = new Employee("Mujo", 150);
		Employee e2 = new Employee("Haso", 200);
		Employee e3 = new Employee("Amir", 300);
		Museum m1 = new Museum();
		m1.addEksponat(eks1);
		m1.addEksponat(eks2);
		m1.addEksponat(eks3);
		m1.addHistoricalArtifact(h1);
		m1.addHistoricalArtifact(h2);
		m1.addHistoricalArtifact(h3);
		m1.addWorkOfArt(w1);
		m1.addWorkOfArt(w2);
		m1.addWorkOfArt(w3);
		m1.addEmployee(e1);
		m1.addEmployee(e2);
		m1.addEmployee(e3);
		
		System.out.println(m1);
		
		System.out.println(m1.fiitsSearch("prvi"));
		
		System.out.println(m1.fiitsSearch("dfgdsf"));
		
		m1.sortEksponat();
		
		System.out.println(m1);
	}
}
