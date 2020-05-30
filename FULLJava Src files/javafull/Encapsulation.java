package javafull;

public class Encapsulation {
	/*
	 * Technically, the variables of a class are hidden from any other class and can
	 * be accessed only through any member function of own class. Variables are listed as private.
	 */
	private String empName;
	private int empId;
	
	void setEmpName(String name) {
	empName = name;
	}
	void setEmpId(int id) {
		empId = id;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
}
