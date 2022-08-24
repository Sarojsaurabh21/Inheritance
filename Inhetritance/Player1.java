package Inhetritance;

public class Player1 {
	private int jarsyno;
	private String playername;
	private String location;
	
	public Player1()
	{
		
	}
	public Player1(int jarsyno,String playername,String location)
	{
		this.jarsyno=jarsyno;
		this.playername=playername;
		this.location =location;
	}
	public int getJarsyno() {
		return jarsyno;
	}
	public void setJarsyno(int jarsyno) {
		this.jarsyno = jarsyno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Player1 [jarsyno=" + jarsyno + ", playername=" + playername + ", location=" + location + "]";
	}
	
	

}
