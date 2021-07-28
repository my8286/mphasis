package package10;

public class Luxury extends Car{
	String ac;
	String sterio;
	String safty;
	public Luxury(int regno, String cname, int price, String type, String ac, String sterio, String safty) {
		super(regno, cname, price, type);
		this.ac = ac;
		this.sterio = sterio;
		this.safty = safty;
	}
	@Override
	public String toString() {
		return "Luxury [ac=" + ac + ", sterio=" + sterio + ", safty=" + safty + ", regno=" + regno + ", cname=" + cname
				+ ", price=" + price + ", type=" + type + "]";
	}
	
	public static void main(String[] args) {
		Luxury obj1=new Luxury(111,"BMW",1000000,"petrol","yes","yes","yes");
		Luxury obj2=new Luxury(451,"Maruti",600000,"petrol","yes","yes","no");
		Luxury obj3=new Luxury(671,"Honda",500000,"petrol","yes","no","no");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
	}
	

}
