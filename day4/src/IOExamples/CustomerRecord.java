package IOExamples;
import java.io.*;

public class CustomerRecord {
	

	public void saveToFile(Customer obj){
		
	}
        try{
        	FileOutputStream fout = new FileOutputStream("c://Users//ASAWASE//Downloads//object.txt");
        	ObjectOutputStream objout = new ObjectOutputStream(fout);
        	objout.writeObject(obj);
        	Objout.flush();
        ]catch (IOException e){
        	System.out.println(e);        }
        }
    }
	
	public void readFromFile(){
		try{
			FileInputStream fin = new fileoutputStream("C://User//ASAMASE//Downloads//objSeri.txt");
			ObjectInputStream objin = new objectInputStream(fin);
			
			Customer cust = (Customer)objin.readObject();
			cust.showDetails();
		try{
			FileInputStream fin = new FileInputStream("Jacob","32 Baker Street");
			
		}
		}
	}
