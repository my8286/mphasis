package Package2;
import java.util.*;

public class Firstjava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rollno:");
		int rollno=sc.nextInt();
		System.out.print("Enter name:");	
		String name=sc.next();
		System.out.print("Class no:");
		String std=sc.next();
		
		System.out.print("Enter C++ marks:");
		int cpp=sc.nextInt();
		
		System.out.print("Enter Java marks:");
		int java=sc.nextInt();
		
		System.out.print("Enter Python marks:");
		int python=sc.nextInt();
		
		int avg=(cpp+java+python)/3;
		
		
		System.out.println("Name :"+name+" class: "+std+" rollno: "+	rollno);
		if(avg>60)
			System.out.println("First class");
		else if(avg>50)
			System.out.println("Second class");
		else
			System.out.println("Third class");
		
	}
}
	