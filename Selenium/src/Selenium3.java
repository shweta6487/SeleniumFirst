import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Selenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromebrowser\\Chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/loan-calculator.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("cloanamount")).clear();
		
		driver.findElement(By.id("cloanamount")).sendKeys("500");
		
		Select Compound = new Select(driver.findElement(By.id("ccompound")));
		
		Compound.selectByVisibleText("Weekly");
		
		driver.navigate().to("https://www.calculator.net/bmi-calculator.html");
		
		driver.findElement(By.id("csex2")).click();
		
		System.out.println("Female Radio Button selected");
		
		driver.findElement(By.linkText("Metric Units")).click();
		
		//driver.switchTo().frame(0);
		
		//driver.findElementByLinkText("Calorie").click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript ("window.scrollBy(0,500)");
		
		
		
		

		
		

	
		
	}

}
