import java.io.*;
public class FileBufferReader {
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("file.txt");
		BufferedReader br=new BufferedReader(fr);
		String val;
		while((val=br.readLine())!=null)
		{
			System.out.println(val);
		}
		br.close();
		fr.close();
	}

}
