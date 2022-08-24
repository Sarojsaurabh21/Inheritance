package Inhetritance;

public class Indianbankmumbai extends Indianbank 
{
	public Indianbankmumbai()
	{
		
	}
	public  Indianbankmumbai(int accno,String name,int amount)
	{
		super(accno,name,amount);
		
	}
	double WithDraw()
	{
		double withdraw=super.deposite-5000;
		return withdraw;
	}
	@Override
	public String toString() {
		return  super.toString()+"Indianbankmumbai [WithDraw()=" + WithDraw() + "]";
	}
	

}
