import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;
public class SeriesofMultipleActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromebrowser\\Chromedriver.exe");
		

	ChromeDriver driver =new ChromeDriver(); 
	
	driver.get("http://www.facebook.com");
	Thread.sleep(2000);
	WebElement txtUserName=driver.findElement(By.id("email"));
	txtUserName.sendKeys("");
	Actions builder = new Actions(driver);
	org.openqa.selenium.interactions.Action seriesofActions=builder.moveToElement(txtUserName).click().keyDown(txtUserName,Keys.SHIFT).sendKeys(txtUserName,"hello").keyUp(txtUserName,Keys.SHIFT).doubleClick(txtUserName).contextClick().build();
	seriesofActions.perform(); 
	}
}



