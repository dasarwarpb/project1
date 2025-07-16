import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class1 {
	@Test
	public void test_method1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
