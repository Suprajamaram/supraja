package threadsapp;

public class intThread extends Thread {
	int i;
	public void printNum(){
		for(i=1;i<11;i++){
			System.out.print(i);
		}
	}
	public void run(){
		printNum();
	}

}