package DemoGradle;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JunitParametrizedTest {
	private Integer number;
	private boolean expectedResult;
	private EvenNumberChecker evenumber;
	
	
	@Before
	public void initialize() {
		evenumber=new EvenNumberChecker();
		
	}


	public JunitParametrizedTest(Integer number, boolean expectedResult) {
	
		this.number = number;
		this.expectedResult = expectedResult;
		
	}
	
	@Parameterized.Parameters
	public static Collection evennumber(){
		return Arrays.asList(new Object[][] {{2,true},{3,true}});
	}
	
	@Test
	public void evennumbercheck()
	{
		assertEquals(expectedResult, evenumber.evennumber(number));
	}
	
	
	

}
