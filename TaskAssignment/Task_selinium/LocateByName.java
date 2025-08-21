package Task_selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        
	        WebElement username = driver.findElement(By.name("username"));
	        WebElement password = driver.findElement(By.name("password"));
	        
	        username.sendKeys("Admin");
	        password.sendKeys("admin123");
	        
	        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        loginBtn.click();
	        
	        driver.quit();

	}

}
