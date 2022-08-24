package Inhetritance;

public class Indianbank extends Bank 
{
	private int amount;
	public Indianbank()
	{
		
	}
	public Indianbank(int accno,String name,int amount)
	{
		super (accno,name);
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	double deposite;
	double deposite()
	{
		deposite=amount+10000;
		return deposite;
	}
	@Override
	public String toString() {
		return "Indianbank [amount=" + amount + ", deposite=" + deposite + ", deposite()=" + deposite() + "]";
	}
	
	
}
