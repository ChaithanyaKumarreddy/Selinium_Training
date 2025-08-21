package Task_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class TitleValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        try {
	            driver.get("https://opensource-demo.orangehrmlive.com/");
	            
	            WebElement username = driver.findElement(By.name("username"));
	            WebElement password = driver.findElement(By.name("password"));
	            WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	            
	            username.sendKeys("Admin");
	            password.sendKeys("admin123");
	            loginBtn.click();
	            
	            Thread.sleep(3000);
	            String actualTitle = driver.getTitle();
	            String expectedTitle = "OrangeHRM";
	            
	            if (actualTitle.equals(expectedTitle)) {
	                System.out.println("Title validation PASSED. Title: " + actualTitle);
	            } else {
	                System.out.println("Title validation FAILED. Expected: " + expectedTitle + 
	                                 ", Actual: " + actualTitle);
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }

	}

}
