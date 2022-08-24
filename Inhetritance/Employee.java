package Inhetritance;

public class Employee {
	private int eID;
	private String eName;
	private float salary;
	
	
	public Employee()
	{
		
	}

	public Employee(int eID,String eName,float salary)
	{
		this.eID=eID;
		this.eName=eName;
		this.salary=salary;
		
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float getSalary() {
		return salary;
	}

	

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", eName=" + eName + ", salary=" + salary + ", geteID()=" + geteID()
				+ ", geteName()=" + geteName() + ", getSalary()=" + getSalary() + "]";
	}
	
	
}
