

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo 
{

	@Test
	public void assertDemo()
	{
		String a="ABC";
		String b="Abc";
		Assert.assertEquals(a, b);
		System.out.println("valid");
		
	}
	}

