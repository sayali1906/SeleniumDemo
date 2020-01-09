import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListDemo.class)
public class Demo2Testing {

	@Test()
	public void Demo()
	{
		System.out.println("Hi");
	}
@Test()
public void Demo1()
{
	System.out.println("Hii");
}

}
