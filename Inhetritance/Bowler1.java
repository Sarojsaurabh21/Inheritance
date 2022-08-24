package Inhetritance;

public class Bowler1 extends Player1
{
	private int wicketstaken;
	private int noofballsbowled;
	private int economyrate;
	private int fivewickethaul;
	

	public  Bowler1()
	{
		
	}
	public  Bowler1(int jarsyno,String playername,String location,int wicketstaken,int noofballsbowled,int economyrate,int fivewickethaul)
	{
		super(jarsyno,playername, location);
		this.wicketstaken=wicketstaken;
		this.noofballsbowled=noofballsbowled;
		this.economyrate=economyrate;
		this.fivewickethaul=fivewickethaul;
		
	}
	public int getWicketstaken() {
		return wicketstaken;
	}
	public void setWicketstaken(int wicketstaken) {
		this.wicketstaken = wicketstaken;
	}
	public int getNoofballsbowled() {
		return noofballsbowled;
	}
	public void setNoofballsbowled(int noofballsbowled) {
		this.noofballsbowled = noofballsbowled;
	}
	public int getEconomyrate() {
		return economyrate;
	}
	public void setEconomyrate(int economyrate) {
		this.economyrate = economyrate;
	}
	public int getFivewickethaul() {
		return fivewickethaul;
	}
	public void setFivewickethaul(int fivewickethaul) {
		this.fivewickethaul = fivewickethaul;
	}
	@Override
	public String toString() {
		return super.toString()+ "Bowler1 [wicketstaken=" + wicketstaken + ", noofballsbowled=" + noofballsbowled + ", economyrate="
				+ economyrate + ", fivewickethaul=" + fivewickethaul + "]";
	}
	
}
