package iostreams;

import java.io.*;

public class Example1 {

public static void main(String[] args) {
	//TODO Auto-generated method stub
	try{
		FileInputStream fin = new FileInputStream("c://users//D109//Documents//my file.txt");
		BufferedInputStream fi = new BufferedInputStream(fin);
		byte[] bt = new byte[fin.available()];
		fi.read(bt);
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

