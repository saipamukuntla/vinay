package kiran.sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test;

public class mavan {
	
	  @Test
	
	public void repo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte206_saikiraN\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@id=\"txtuId\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPword\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

}
}
