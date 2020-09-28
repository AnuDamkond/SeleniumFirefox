package firefox;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe\\");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(300, 400);
		driver.manage().window().setSize(d);
		
		Point p=new Point(300, 500);
		driver.manage().window().setPosition(p);
		driver.navigate().to("https://www.google.com/search?client=firefox-b-d&q=amazon.in");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String original = driver.getTitle();
		String exp="Go to Facebook home";
		boolean result=exp.equalsIgnoreCase(original);
		System.out.println(result);
		String value = driver.getCurrentUrl();
		System.out.println(value);
//		driver.close();
		driver.quit();
		
		
	}

}
