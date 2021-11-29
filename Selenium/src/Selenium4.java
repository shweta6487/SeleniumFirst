import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromebrowser\\Chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert1")).click();
		
		//driver.findElement(By.id("radio2")).isSelected();
		
		Alert simple = driver.switchTo().alert();
		
		System.out.println(simple.getText());
		simple.accept();
		
		

	}

}
