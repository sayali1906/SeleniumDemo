import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
	@Test
	public void user()
	{
		String Et="sayali.fb.com";
		String At="sayali.fb.com";
		Assert.assertEquals(Et,At);
		System.out.println("Actual is matching with expected title");
		boolean Ex=true;
		boolean Ax=true;
		Assert.assertEquals(Ex,Ax);
		System.out.println("Actual is matching with expected title");
Set<String> s=new HashSet<>();
Collections.addAll(s,"abc","xy","st");
Set<String> s2=new HashSet<>();
Collections.addAll(s2,"abc","xy","st");
Assert.assertNotEquals(s,s2,"Working");
Assert.assertTrue(true);
SoftAssert sa=new SoftAssert();
sa.assertEquals(9, 19);
System.out.print("Failjasdfs");
sa.assertAll();

	}
	}


