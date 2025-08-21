package task2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginButtonClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        try {
	            // Open the website
	            driver.get("https://opensource-demo.orangehrmlive.com/");

	            // Enter credentials
	            driver.findElement(By.name("username")).sendKeys("Admin");
	            driver.findElement(By.name("password")).sendKeys("admin123");

	            // Click login button
	            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	            loginButton.click();

	            // Wait for the page title to be "OrangeHRM"
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.titleIs("OrangeHRM"));

	            // Validate page title
	            String actualTitle = driver.getTitle();
	            if (actualTitle.equals("OrangeHRM")) {
	                System.out.println("Login validation PASSED - Title: " + actualTitle);
	            } else {
	                System.out.println("Login validation FAILED - Expected: OrangeHRM, Actual: " + actualTitle);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Quit the driver
	            driver.quit();
	        }
	}

}
