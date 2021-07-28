package package2;

public class Address {
	String city;
	String state;
	String town;
	Address(String town,String city,String state)
	{
		this.town=town;
		this.state=state;
		this.city=city;
	}
	public String toString()
	{
		return "town:"+town+" city:"+city+" state:"+state;
	}
	

}
