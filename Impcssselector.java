package edurekha;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impcssselector {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangharsh\\eclipsepache\\Selenium\\src\\edurekha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		/*driver.manage().window().minimize();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("oneplus6T");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#gh-btn")).click();
		js.executeScript("window.scrollBy(0,3000)" );
		
		

	}

}
