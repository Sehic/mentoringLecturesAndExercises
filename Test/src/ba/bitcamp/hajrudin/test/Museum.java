package ba.bitcamp.hajrudin.test;

import java.util.ArrayList;
import java.util.Arrays;

interface searchable {
	boolean fiitsSearch(String s);
}

public class Museum implements searchable{
	private ArrayList<Eksponat> eksponati;
	private ArrayList<WorksOfArt> arts;
	private ArrayList<HistoricalArtifact> artifacts;
	private ArrayList<Employee> employees;

	public Museum() {
		this.eksponati = new ArrayList<Eksponat>();
		this.arts = new ArrayList<WorksOfArt>();
		this.artifacts = new ArrayList<HistoricalArtifact>();
		this.employees = new ArrayList<Employee>();
	}

	public void addEksponat(Eksponat e) {
		eksponati.add(e);
	}

	public void addWorkOfArt(WorksOfArt a) {
		arts.add(a);
	}

	public void addHistoricalArtifact(HistoricalArtifact h) {
		artifacts.add(h);
	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	@Override
	public String toString() {
		return "Museum [eksponati=" + eksponati + ", arts=" + arts
				+ ", artifacts=" + artifacts + ", employees=" + employees + "\n";
	}
	
	public void sortEksponat(){
		eksponati.sort(null);
	}

	@Override
	public boolean fiitsSearch(String s) {
		for(int i = 0; i < eksponati.size(); i++){
			if(eksponati.get(i).fiitsSearch(s)){
				return true;
			}
		} 
		for(int i = 0; i < arts.size(); i++){
			if(arts.get(i).fiitsSearch(s)){
				return true;
			}
		}
		for(int i = 0; i < artifacts.size(); i++){
			if(artifacts.get(i).fiitsSearch(s)){
				return true;
			}
		}
		for(int i = 0; i < employees.size(); i++){
			if(employees.get(i).fiitsSearch(s)){
				return true;
			}
		}
		return false;
	}

}
