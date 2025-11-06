package locatorspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicUsernameUtil {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/user/Desktop/Automation/chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = userName(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Tushar");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
//		driver.findElement(By.cssSelector("button[type*='submit']")).click();
		//here we using cssSelectore tagname#id 
				driver.findElement(By.cssSelector("input#chkboxOne")).click();
				
				//here we using attribute type of CssSelectore  
				driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
				
				Thread.sleep(1000);
				
				// here we used class locator
				driver.findElement(By.className("signInBtn")).click();


				Thread.sleep(5000);
		
		driver.quit();
		
		
		//driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		
		
		
	}
	
	public static String userName(WebDriver driver) throws InterruptedException {
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(2000); // wait for modal
	    driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

	    String pass = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
	    System.out.println("Message received: " + pass);

	    String[] passArray = pass.split("'"); // split on single quote
	    String password = passArray[1];       // first index is the password
	    System.out.println("Extracted password: " + password);

	    return password;
	}

	

}
