package lambdaEx;

public class CalculatorApp {
	
	public void getAmount(InterestCalculator ic){
		System.out.println("Sample Interst : "+ic.simpleInterest(13000, 3, 4));
	}
	
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		
		CalculatorApp ca = new CalculatorApp();
		
		ca.getAmount( (p, r, t)->
		p*r*t/100
		);
	}
}
