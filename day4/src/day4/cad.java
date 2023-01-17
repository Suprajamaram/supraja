package day4;


public class cad {
	public void checkmarks(int marks) throws Exception{
		if(marks<30){
			throw new Exception("marks invalid");
			
		}
	}

    public static void main(String[] args) {
    	//TODO Auto-generated method stub
    	try{
    		cad obj=new cad();
    		obj.checkmarks(10);
    	}
    	catch(Exception e){
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    }
}

