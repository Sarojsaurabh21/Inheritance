package Inhetritance;

public class Programmer1 extends Employee
{
	
	int pf;
	String address;
	public Programmer1()
	{
		
	}
	public Programmer1(int eID,String eName,float salary,int pf,String address)
	{
		
	/*	setID(eID);
		seteName(eName);
		setSalary(salary);*/
		this.pf=pf;
		this.address=address;
		
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Programmer1 [pf=" + pf + ", address=" + address  + "]";
	}
	
	

}
