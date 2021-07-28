package package7;
import java.util.*;
class Book{
	int id;
	String name;
	String author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity ;
	}
	
	
}

public class JavaMap {
	public static void main(String[] args) {
		Map<Integer,Book> map=new HashMap<>();
		map.put(1,new Book(111,"CPP","abc","xyz",5));
		map.put(2,new Book(222,"Java","abc","xyz",10));
		map.put(3,new Book(654,"Python","abc","xyz",15));
		map.put(4,new Book(343,"Machine Learning","abc","xyz",10));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Srno to view book details :");
		int srno=sc.nextInt();
		for(Map.Entry<Integer,Book> set:map.entrySet())
		{
			if(srno==set.getKey())	
			{
				System.out.println(set.getValue());
			}
		}	
	}
}
