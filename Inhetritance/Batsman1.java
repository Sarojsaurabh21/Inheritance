package Inhetritance;

public class Batsman1  extends Player1
{
	private int centuries;
	private int halfcenturies;
	private int strikeRate;
	private int six;
	private int fours;
	
	
	public Batsman1()
	{
		
	}
	
	public Batsman1(int jarsyno,String playername,String location,int centuries,int halfcenturies,int strikeRate,int six,int fours )
	{
		super(jarsyno,playername, location);
		this.centuries=centuries;
		this.halfcenturies=halfcenturies;
		this.strikeRate=strikeRate;
		this.six=six;
		this.fours=fours;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfcenturies() {
		return halfcenturies;
	}

	public void setHalfcenturies(int halfcenturies) {
		this.halfcenturies = halfcenturies;
	}

	public int getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(int strikeRate) {
		this.strikeRate = strikeRate;
	}

	public int getSix() {
		return six;
	}

	public void setSix(int six) {
		this.six = six;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	@Override
	public String toString() {
		return super.toString()+ "Batsman1 [centuries=" + centuries + ", halfcenturies=" + halfcenturies + ", strikeRate=" + strikeRate
				+ ", six=" + six + ", fours=" + fours + "]";
	}
	
	

}
