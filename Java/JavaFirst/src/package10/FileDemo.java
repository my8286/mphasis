package package10;
import java.io.*;
public class FileDemo {
	public static void main(String arg[])
	{
		
		File f=new File("file.txt");
		System.out.println("file name:"+f.getName());
		System.out.println("file path:"+f.getPath());
		System.out.println("file absolutepath:"+f.getAbsolutePath());
		System.out.println("file exists:"+f.exists());
		if(f.exists())
		{
			System.out.println("file canwrite:"+f.canWrite());
			System.out.println("file canread:"+f.canRead());
			System.out.println("file isdirectory:"+f.isDirectory());
			System.out.println("file length:"+f.length());
		}
	}
} 


