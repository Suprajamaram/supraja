package thr;

public class candidate {
	public void checkmarks(int marks) throws Exception{
		if(marks<30){
			throw new Exception("marks invalid");
			
		}
	}

    public static void main(String[] args) {
    	//TODO Auto-generated method stub
    	try{
    		candidate obj=new candidate();
    		obj.checkmarks(10);
    	}
    	catch(Exception e){
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    }
}
