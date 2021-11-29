import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromebrowser\\Chromedriver.exe");
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement tagname = driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("Hello");
		
		WebElement name = driver.findElement(By.id("pass"));
		driver.findElement(By.id("pass")).sendKeys("shwetapingle");
		
		tagname.submit();
	}

}
