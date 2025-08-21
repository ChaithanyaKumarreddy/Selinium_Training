package Task_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LocateByCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        try {
	            // Step 1: Open URL and log in
	            driver.get("https://opensource-demo.orangehrmlive.com/");
	            driver.findElement(By.name("username")).sendKeys("Admin");
	            driver.findElement(By.name("password")).sendKeys("admin123");
	            driver.findElement(By.cssSelector("button[type='submit']")).click();

	            // Step 2: Click the Admin tab
	            WebElement adminMenu = driver.findElement(By.xpath("//span[text()='Admin']"));
	            adminMenu.click();

	            // Step 3: Locate the search box using CSS selector and type "Admin"
	            WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search']"));
	            searchBox.sendKeys("Admin");

	            System.out.println("Successfully typed 'Admin' into the search box using CSS Selector.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }

	}

}
