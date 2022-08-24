package Inhetritance;

public class Student {
	private int Id;
	private String name;
	private  String address;
	
	public Student()
	{
		
	}
	public Student(int Id,String name,String address)
	{
		this.Id=Id;
		this.name=name;
		this.address=address;
	}
	public int getsId() {
		return Id;
	}
	public void setsId(int sId) {
		this.Id = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sId=" + Id + ", name=" + name + ", address=" + address + "]";
	}
	

}
