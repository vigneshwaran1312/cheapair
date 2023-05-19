package org.stepdef;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {
	public static WebDriver driver;
	
	@Before
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void scroll(WebElement element) {
		JavascriptExecutor locate =(JavascriptExecutor)driver;
		locate.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void window(int num) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			Object[] handle2=windowHandles.toArray();
			String window = handle2[num].toString();
			driver.switchTo().window(window);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("window does not switch");
		}
	}
	
	public static void dropdown(WebElement element,String toSelect) {
		Select select = new Select(element);
		select.selectByVisibleText(toSelect);
	}
	
}
