package BasicOfJunit.Chapter2_CoreOfJunit.Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/*
 *  Define a normal suite
 */


@RunWith(value=Suite.class)
@SuiteClasses(value={CalculatorTest.class})
public class NormalSuiteExplicit {
	
}

class CalculatorTest{
	
}
