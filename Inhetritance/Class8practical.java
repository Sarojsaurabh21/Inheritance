package Inhetritance;

public class Class8practical extends Class8
{
	int science,math;
	public Class8practical ()
	{
		
	}
	public Class8practical (int id,String name,String address,int m1,int m2,int m3,int m4,int m5, int science,int math)
	{
		super(id ,name,address,m1,m2,m3,m4,m5);
		
		this.science=science;
		this.math=math;
		
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return super.toString()+"Class8practical [science=" + science + ", math=" + math  + "]";
	}
	
	

}
