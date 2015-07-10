package ba.bitcamp.hajrudin.searching.and.sorting.exercise;

import java.util.ArrayList;

/**
 * class Company contains name of company and list of employees from class Employee
 * @author hajrudin.sehic
 *
 */
public class Company {
	private String nameOfCompany;
	private ArrayList<Employee> employees = new ArrayList<>();

	public Company(String name) {
		this.nameOfCompany = name;
	}
	
	/**
	 * This method add new employee to company
	 * @param e new employee
	 * @return true if employee is added to company false if employee is already in company
	 */
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
	
	/**
	 * This method remove employee from company 
	 * @param e employee which will be removed
	 * @return true if employee is removed false if employee doesn't exist in company
	 */
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
	
	/**
	 * This method searching specified employee in company
	 * @param e employee for search
	 * @return true if employee is in company false if employee is not in company
	 */
	public boolean isWorkingHere(Employee e) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getID() == e.getID()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method search for female employee in company
	 * @return true if in this company have even one female employee
	 */
	public boolean hasFemaleEmployees() {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getGender().equalsIgnoreCase("female")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method sort employees in company by ID from lowest to highest
	 */
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
	
	/**
	 * This method sort employees by age from youngest to older
	 */
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
	
	/**
	 * This method sort employees by salary from lowest to highest
	 */
	public void sortBySalary(){
		for(int i = 1; i<employees.size(); i++){
			Employee e = employees.get(i);
			int j;
			for(j = i-1; j>=0; j--){
				if(employees.get(j).getSalary()<e.getSalary()){
					break;
				} 
					employees.set(j+1, employees.get(j));
			}
			employees.set(j+1, e);
		}
	}
	
	/**
	 * This method sort employees by gender. First female than male
	 */
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
	
	/**
	 * This method check are employees sorted by ID
	 * @return true if yes false if no
	 */
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

	/**
	 * This method search employee in company by ID using binary search
	 * @param ID ID of employee
	 * @return employee
	 */
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
	
	/**
	 * This method return all of employees in company
	 * @return list of employees
	 */
	public ArrayList<Employee> getEmployeeList(){
		return this.employees;
	}
	
	/**
	 * This method add employees in company
	 * @param e array of employees
	 */
	public void addEmployees(Employee...e){
		for(int i = 0; i<e.length; i++){
			this.hireEmployee(e[i]);
		}
	}
	
	/**
	 * This method add employees in company
	 * @param e list of employees
	 */
	public void addEmployees(ArrayList<Employee> e){
		this.employees.addAll(e);
	}
	
	/**
	 * This method find index of employee
	 * @param e employee
	 * @return index
	 */
	public Integer indexOf(Employee e){
		for(int i = 0; i<employees.size(); i++){
			if(e.getID()==employees.get(i).getID()){
				return i;
			}
		}
		return null;
	}
	
	/**
	 * This method remove employee by ID
	 * @param ID ID of employee
	 */
	public void removeEmployee(Integer ID){
		for(int i = 0; i<employees.size(); i++){
			if(ID==employees.get(i).getID()){
				employees.remove(i);
				break;
			}
		}
	}
	
	/**
	 * This method remove employee on specific index
	 * @param index index of employee which will be removed
	 */
	public void removeEmployee(int index){
		employees.remove(index);
	}
	
	/**
	 * This method sort employees by name
	 */
	public void sortByName(){
		for (int i = 0; i < employees.size() - 1; i++) {
			for (int j = employees.size() - 2; j >= 0; j--) {
				if (employees.get(j).getName().compareToIgnoreCase(employees.get(j+1).getName())>0) {
					Employee temp = employees.get(j);
					employees.set(j, employees.get(j+1));
					employees.set(j+1, temp);
				}
			}
		}
	}
	
	/**
	 * This method convert list employees to array
	 * @return array of employees
	 */
	public Employee[] getArray(){
		return (Employee[]) employees.toArray();
	}
	
	/**
	 * This method take names of all employees and save them to new list
	 * @return list of names 
	 */
	public ArrayList<String> getListNames(){
		ArrayList<String> names = new ArrayList<String>();
		for(int i = 0; i<employees.size(); i++){
			names.set(i, employees.get(i).getName());
		}
		return names;
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
