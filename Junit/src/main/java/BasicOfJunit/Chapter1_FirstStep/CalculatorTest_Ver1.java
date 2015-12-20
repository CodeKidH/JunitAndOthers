package BasicOfJunit.Chapter1_FirstStep;

public class CalculatorTest_Ver1 {
	
	public static void main(String[]args){
		
		
		/*Simple Test of add Method*/
		
		Calculator calculator = new Calculator();
		double result = calculator.add(10,50);
		
		if(result != 60){
			System.out.println("Bad result:"+result);
		}
	}
}
