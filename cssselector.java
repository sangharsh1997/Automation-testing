package edurekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangharsh\\eclipsepache\\Selenium\\src\\edurekha\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
	driver.findElement(By.cssSelector("#login-username")).sendKeys("sangharshpache11@gmail.com");
	driver.findElement(By.cssSelector("#login-signin")).click();
		// TODO Auto-generated method stub

	}

}
