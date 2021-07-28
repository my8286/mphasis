package package6;
import java.util.*;
abstract class Parent{
	public abstract String getFare();
}
class Children extends Parent{
	static int count=0;
	public String name;
	public String type;
	Children(String name)
	{
		this.name=name;
		this.type="Children";
	}
	public static void incChild()
	{
		count++;
	}
	public String getFare()
	{
		return "fees is 250";
	}
	@Override
	public String toString() {
		return "Children [name=" + name + ", type=" + type + "]";
	}
}
class Adult extends Parent{
	static int count=0;
	public String name;
	public String type;
	Adult(String name)
	{
		this.name=name;
		this.type="Adult";
	}
	public static void incAdult()
	{
		count++;
	}
	public String getFare()
	{
		return "fees is 500";
	}
	@Override
	public String toString() {
		return "Adult [name=" + name + ", type=" + type + "]";
	}
}
class Crew extends Parent{
	static int count=0;
	public String name;
	public String type;
	Crew(String name)
	{
		this.name=name;
		this.type="Crew";
	}

	public static void incCrew()
	{
		count++;
	}
	public String getFare()
	{
		return "No fees";
	}

	@Override
	public String toString() {
		return "Crew [name=" + name + ", type=" + type + "]";
	}
	
}
public class Assignment {
	public static void main(String[] args) {
		List<Object> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int type=1;
		System.out.println(" Select type of ticket");
		System.out.println(" 1. Crew \n 2. Adult (above 10) \n 3. Children (below 10) \n 4. Exit");
		while(type!=4)
		{
			
			type=sc.nextInt();
			switch(type)
			{
				case 1: 
					
					Crew.incCrew();
					System.out.println("Enter your name: ");
					String name=sc.next();
					Crew c=new Crew(name);
					System.out.println(c.getFare());
					System.out.println("Your ticket booked successfully !");
					list.add(c);
					break;
					
				case 2: 
					
					System.out.println("Enter your name: ");
					name=sc.next();
					Adult adult=new Adult(name);
					Adult.incAdult();
					System.out.println(adult.getFare());
					System.out.println("Your ticket booked successfully !");
					list.add(adult);
					break;
					
					
				case 3: // for Children
					System.out.println("Enter your name: ");
					name=sc.next();
					Children ch=new Children(name);
					Children.incChild();
					System.out.println(ch.getFare());
					System.out.println("Your ticket booked successfully !");
					list.add(ch);
					break;
				

			}
		}
		
		System.out.println(" Total passanger:"+list.size());
		System.out.println(" Total Crew :"+Crew.count);
		System.out.println(" Total Adult :"+Adult.count);
		System.out.println(" Total Children :"+Children.count);
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
	}

}
