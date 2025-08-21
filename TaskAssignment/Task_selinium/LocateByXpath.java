package Task_selinium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LocateByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        try {
	            driver.get("https://opensource-demo.orangehrmlive.com/");
	            driver.findElement(By.name("username")).sendKeys("Admin");
	            driver.findElement(By.name("password")).sendKeys("admin123");
	            driver.findElement(By.xpath("//button[@type='submit']")).click();
	            
	            Thread.sleep(3000);
	            WebElement adminMenu = driver.findElement(By.xpath("//span[text()='Admin']"));
	            adminMenu.click();
	            
	            System.out.println("Successfully clicked Admin menu using XPath");
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }

	}

}
