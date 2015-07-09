package ba.bitcamp.hajrudin.searching.and.sorting.exercise;

import java.util.ArrayList;

public class Company {
	private String nameOfCompany;
	private ArrayList<Employee> employees = new ArrayList<>();

	public Company(String name) {
		this.nameOfCompany = name;
	}

	public boolean hireEmployee(Employee e) {
		if (employees.size() == 0) {
			employees.add(e);
		} else {
			for (int i = 0; i < employees.size(); i++) {
				if (employees.get(i).getID() == e.getID()) {
					System.out.println("ERROR");
					return false;
				}
			}
			employees.add(e);
		}
		return true;
	}

	public boolean fireEmployee(Employee e) {
		if (employees.size() == 0) {
			return false;
		} else {
			for (int i = 0; i < employees.size(); i++) {
				if (employees.get(i).getID() == e.getID()) {
					employees.remove(i);
					return true;
				}
			}
			return false;
		}
	}

	public boolean isWorkingHere(Employee e) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getID() == e.getID()) {
				return true;
			}
		}
		return false;
	}

	public boolean hasFemaleEmployees() {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getGender().equalsIgnoreCase("female")) {
				return true;
			}
		}
		return false;
	}

	public void sortByID() {
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = i;
			for (int j = i; j < employees.size(); j++) {
				if (employees.get(j).getID() < employees.get(minIndex).getID()) {
					minIndex = j;
				}
			}
			Employee e = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, e);
		}
	}
	
	public void sortByAge(){
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = i;
			for (int j = i; j < employees.size(); j++) {
				if (employees.get(j).getDate().getYear() > employees.get(minIndex).getDate().getYear()) {
					minIndex = j;
				}
			}
			Employee e = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, e);
		}
	}
	
	public void sortBySallary(){
		for(int i = 1; i<employees.size(); i++){
			Employee e = employees.get(i);
			int j;
			for(j = i-1; j>=0; j--){
				if(employees.get(j).getSallary()<e.getSallary()){
					break;
				} 
					employees.set(j+1, employees.get(j));
			}
			employees.set(j+1, e);
		}
	}
	
	public void sortByGender(){
		for(int i = 1; i<employees.size(); i++){
			Employee e = employees.get(i);
			int j;
			for(j = i-1; j>=0; j--){
				if(employees.get(j).getGender().compareTo(e.getGender())<0){
					break;
				} 
					employees.set(j+1, employees.get(j));
			}
			employees.set(j+1, e);
		}
	}
	
	public boolean areEmployeesSorteByID(){
		for(int i = 0; i<employees.size(); i++){
		Employee e = employees.get(i);
		for(int j = i+1; j<employees.size(); j++){
			if(e.getID()>employees.get(j).getID()){
				return false;
			}
		}
		}
		return true;
	}
	
	public Employee getEmployee(int ID){
		this.sortByID();
		int first  = 0;
	    int last   = employees.size() - 1;
	    int middle = (first + last)/2;
	 
	    while( first <= last ){
	      if ( employees.get(middle).getID() < ID )
	        first = middle + 1;    
	      else if ( employees.get(middle).getID() == ID ) {
	        return employees.get(middle);
	      }
	      else{
	         last = middle - 1;
	      }
	      middle = (first + last)/2;
	   }
	     return null; 
	}

	@Override
	public String toString() {
		String s = "";
		s = "Company name: "+this.nameOfCompany+"\n";
		for(int i = 0; i<employees.size(); i++){
			s+=employees.get(i).toString();
		}
		return s;
	}
	
	

}
