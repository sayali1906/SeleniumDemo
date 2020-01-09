import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		System.out.println("launching Browser");
		driver.get("http://selenium.dev/");
		System.out.println("loading url");
		driver.close();
		System.out.println("closing browser");

	}

}
