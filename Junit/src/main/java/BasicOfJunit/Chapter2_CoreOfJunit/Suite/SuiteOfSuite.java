package BasicOfJunit.Chapter2_CoreOfJunit.Suite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


class TestCaseA{
	
	@Test
	public void testAl(){
		
	}
	
}

class TestCaseB{
	
	@Test
	public void testB1(){
		
	}
}

@RunWith(value = Suite.class)
@SuiteClasses(value = {TestCaseA.class})
class TestSuiteA{
	
}

@RunWith(value=Suite.class)
@SuiteClasses(value={TestCaseB.class})
class TestSuiteB{
	
}

@RunWith(value= Suite.class)
@SuiteClasses(value = {TestSuiteA.class, TestSuiteB.class})
public class SuiteOfSuite {

}
