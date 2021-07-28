package package4;

public class Final {
	public static void main(String[] args) {
		School obj1=new School();
		Student obj2=new Student();
		obj2.setId(1);
		obj2.setName("manish");
		obj2.setStd(10);
		
		obj1.setName("SDBV");
		obj1.setBoard("MHSSC");
		obj1.setCity("mumbai");
		obj1.setStudend(obj2);
		
		System.out.println("School name: "+obj1.getName()+" board: "+obj1.getBoard()+" city: "+obj1.getCity());
		System.out.println(" Roll no:"+obj2.getId()+" name: "+obj2.getName()+" std :"+obj2.getStd());
		
	}

}
