package task2_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTextFeildEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.get("https://www.w3schools.com/html/html_forms.asp");
			
			WebElement firstName = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
			WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lname\"]"));
			
			firstName.clear();
			firstName.sendKeys("chaitu");
			lastName.clear();
			lastName.sendKeys("katta");
			
			WebElement subbmitButton =driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/form/input[3]"));
			subbmitButton.click();
			
			Thread.sleep(2000);
			
			String pageSource =driver.getPageSource();
			if(pageSource.contains("chaitu")&&pageSource.contains("katta")) {
				System.out.println("Validation Passed");
			}else {
				System.out.println("validation not passed");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
	}

}
