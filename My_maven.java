package first_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class My_maven {
	public void add_deposit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=login/");
		Thread.sleep(500);
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("password")).sendKeys("abc123");
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Add Deposit")).click();
		Thread.sleep(300);
		Select dropdown =new Select(driver.findElement(By.id("account")));
		dropdown.selectByIndex(2);
		Thread.sleep(300);
		driver.findElement(By.name("description")).sendKeys("for");
		Thread.sleep(300);
		driver.findElement(By.id("amount")).sendKeys("18700");
		Thread.sleep(400);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		//driver.
		//driver.close();
		//driver.quit();
	}
	
	
	
}
