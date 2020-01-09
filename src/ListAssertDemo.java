import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ListAssertDemo {

	@Test
	public void Demo()
	{
		List st1=new ArrayList<>();
		st1.add("Sayali");
		st1.add(4);
		st1.add(true);
		
		List st2=new ArrayList<>();
		st2.add("Sayali");
		st2.add(4);
		st2.add(true);
		SoftAssert sa=new 	SoftAssert();
		sa.assertEquals(st1, st2);
		
		
		Assert.assertEquals(st1, st2);
		System.out.println("Hello");
		sa.assertAll();
	}
}
