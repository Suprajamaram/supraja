package iodemo;
import java.io.*;
public class inputstream {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		try{
			FileInputStream fin = new FileInputStream("c://users//D109//Documents//my file.txt");
			BufferedInputStream fi = new BufferedInputStream(fin);
			byte[] bt = new byte[fin.available()];
			fin.read(bt);
			for(byte b:bt)
			{
				System.out.print((char)b);
			}
		}
		catch (FileNotFoundException e)
		{
		    System.out.print(e);	
		}
		catch(IOException e1)
		{
			System.out.print(e1);
		}
  }
}
