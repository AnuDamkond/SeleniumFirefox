package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement firstname = driver.findElement(By.xpath("//input[@id='u_0_m']"));
		firstname.sendKeys("Anuja");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("anuja@gmail.com");
		
		//driver.findElement(By.xpath("//input[@name='sex']")).click();
		
	 WebElement female = driver.findElement(By.xpath("//input[@class='_8esa']"));
//	 female.click();
	 
	 boolean value = female.isSelected();
	 System.out.println(value);
	 
	 boolean value1 = female.isEnabled();
	 System.out.println(value1);
	
	 
	 
		
		
		
//		driver.close();
	}

}
