package Task_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.UUID;

public class EndToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        try {
	            // Step 1: Open the site
	            driver.get("https://opensource-demo.orangehrmlive.com/");
	            driver.manage().window().maximize();

	            // Step 2: Log in
	            driver.findElement(By.name("username")).sendKeys("Admin");
	            driver.findElement(By.name("password")).sendKeys("admin123");
	            driver.findElement(By.cssSelector("button[type='submit']")).click();

	            // Step 3: Navigate to PIM
	            driver.findElement(By.xpath("//span[text()='PIM']")).click();

	            // Step 4: Click 'Add Employee'
	            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();

	            // Unique name for testing
	            String firstName = "chaithanya";
	            String lastName = "kattasavugari" + UUID.randomUUID().toString().substring(0, 4); // unique last name
	            String fullName = firstName + " " + lastName;

	            // Step 5: Fill in employee details
	            driver.findElement(By.name("firstName")).sendKeys(firstName);
	            driver.findElement(By.name("lastName")).sendKeys(lastName);

	            // Step 6: Upload photo
//	            WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
//	            fileInput.sendKeys("C:\\Path\\To\\Photo.jpg"); // 🔁 Replace with valid path on your system

	            // Step 7: Save
	            driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

	            // Wait a moment for save
	            Thread.sleep(3000);

	            // Step 8: Go back to Employee List
	            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();

	            // Step 9: Search by name
	            WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
	            searchBox.sendKeys(fullName);

	            // Click Search
	            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();

	            // Step 10: Verify employee is listed
	            Thread.sleep(2000);
	            WebElement result = driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div" + firstName + "'] and .//div[text()='" + lastName + "']]"));
	            if (result.isDisplayed()) {
	                System.out.println("Employee '" + firstName + "' was successfully added and found in the list.");
	            } else {
	                System.out.println("Employee not found.");
	            }
	         

	            // Step 11: Log out
	            driver.findElement(By.cssSelector("i[class=\"oxd-icon bi-x oxd-sidepanel-header-close\"]")).click();
	            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();

	            System.out.println("Successfully logged out.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }

	}

}
