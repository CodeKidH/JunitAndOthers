package BasicOfJunit.Chapter1_FirstStep;

import BasicOfJunit.Chapter1_FirstStep.Calculator;

public class CalculatorTest_Ver2 {
	
	private int nbErrors = 0;
	
	public void testAdd(){
		Calculator calculator = new Calculator();
		
		double result = calculator.add(11,50);
		if(result != 60){
			throw new IllegalStateException("Bad Result:"+result);
		}
	}
	
	public static void main(String[]args){
		
		CalculatorTest_Ver2 test = new CalculatorTest_Ver2();
		
		try{
			test.testAdd();
		}catch(Throwable e){
			test.nbErrors++;
			e.printStackTrace();
		}
		
		if(test.nbErrors > 0){
			throw new IllegalStateException("There were "+test.nbErrors+" error(s)");
		}
	}
}
