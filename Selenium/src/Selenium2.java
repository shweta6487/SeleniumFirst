import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromebrowser\\Chromedriver.exe");
		

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		//driver.getPageSource().contains("http://www.google.com");
		//driver.navigate().refresh();
		
		WebElement drvrl= driver.findElement(By.name("q"));
		
		drvrl.sendKeys("Selenium");
		driver.navigate().forward();
		
		drvrl.submit();
		
		
		System.out.println("page title "+ driver.getTitle());
		
		//driver.quit();
		
		
		
		
		
	}

}
