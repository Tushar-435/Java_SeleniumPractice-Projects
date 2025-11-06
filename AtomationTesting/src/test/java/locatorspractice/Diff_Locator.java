package locatorspractice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Diff_Locator {
	public static void main(String[] args) throws InterruptedException {
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C://Users/user/Desktop/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String name = "Tushar";
		
//		username();
		
		//implecet wait are using for giving time to selenium to wait for laoding complete page and it is a global  AND it always use after driver method
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Page Title: " + driver.getTitle());
		
		//here we user id locator
		driver.findElement(By.id("inputUsername")).sendKeys("username");
		
		//here we used name attribute locator
		driver.findElement(By.name("inputPassword")).sendKeys(name);
		
		//here we using cssSelectore tagname#id 
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		
		//here we using attribute type of CssSelectore  
		driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
		
		Thread.sleep(1000);
		
		// here we used class locator
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		//here we are using Xpath
		
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(name);
		
		driver.findElement(By.cssSelector("input[type='text'][placeholder='Email']")).sendKeys("tu@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder^='Phone']")).sendKeys("7410258963");
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		driver.findElement(By.className("go-to-login-btn")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//we used here quit for entire tab to closed
		
		System.out.println(driver.findElement(By.cssSelector("div.login-container h2")).getText());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div.login-container h2")).getText(), "Hello" +" "+name+",");
		
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		
		
		Thread.sleep(2000);
		
		driver.quit();
	}
//	public static String name() {
//		String name= "Tushar";
//		return name;
//	}	

}


	
	
