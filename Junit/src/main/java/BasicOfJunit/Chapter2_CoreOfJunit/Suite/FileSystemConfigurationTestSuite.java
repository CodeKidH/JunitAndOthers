package BasicOfJunit.Chapter2_CoreOfJunit.Suite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value=org.junit.runners.Suite.class) //Runner
@SuiteClasses(value = {FolderConfigurationTest.class,
						FileConfigurationTest.class})
public class FileSystemConfigurationTestSuite {

}

 class FolderConfigurationTest{
	
	@Test
	public void testAdd(){
		
	}
}

 class FileConfigurationTest{
	@Test
	public void testAdd(){
		
	}
}
