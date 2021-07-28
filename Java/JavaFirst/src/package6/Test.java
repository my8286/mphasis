package package6;
import java.util.*;
public class Test 
{
	public static void main(String[] args) 
	{	
		String s1="apple";
		String s2="apple";
		String s3=new String("apple");
		String s4=new String("apple");
		if(s1==s2) //hashcode or memory blocks are same new memory block will not be created.
			System.out.println("true");
		else
			System.out.println("false");
		
		if(s2==s3)
			System.out.println("true");
		else
			System.out.println("false");
		
		if(s3.equals(s4))//compare the string
			System.out.println("true");
		else
			System.out.println("false");
		
	}}