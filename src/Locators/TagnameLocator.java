package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagnameLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe\\");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement firstname = driver.findElement(By.tagName("input"));
		firstname.sendKeys("abc");
		
	}

}
