package kiran.sai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {
	private WebDriver driver;
	String baseURL = "http://www.facebook.com/";

	@Parameters({ "browser" })
	@BeforeTest
	public void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\arte118_rajesh\\Desktop\\chromelatest\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\arte118_rajesh\\Desktop\\chromelatest\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\arte118_rajesh\\Desktop\\chromelatest\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}


@Test
public void login_TestCase() {
	driver.navigate().to(baseURL);
	

	
            //do something
}

@Test
public void search_TestCase() {
	driver.navigate().to(baseURL);
         //do something
}

@AfterTest
public void closeBrowser() {
	driver.quit();
}
}
