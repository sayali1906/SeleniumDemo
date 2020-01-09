import org.testng.annotations.Test;

public class Testdatap {
	@Test(dataProviderClass=Readdataxmldatap.class,dataProvider="CreateUser")
	public void test(String user,String pass) {
		System.out.println("user");
		System.out.println("pass");
	}

}
