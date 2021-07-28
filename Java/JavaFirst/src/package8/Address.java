package package8;

public class Address {
	String town,city,state;
	int pin;

	public Address(String town, String city, String state,int pin) {
		this.town = town;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "\n Address [town=" + town + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
	

}
