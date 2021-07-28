import java.io.*;
public class JavaBufferReader {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter emp id:");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter emp name:");
		String name=br.readLine();
		
		System.out.println(" id:"+id+" name:"+name+" ");
		
	}

}
