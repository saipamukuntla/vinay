package kiran.sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class roles {
	
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte206_saikiraN\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@id=\'txtuId\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\'txtPword\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\'login\']")).click();
		driver.close();
	}
	
	public void roles() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte206_saikiraN\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@id=\'txtuId\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\'txtPword\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\'login\']")).click();
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\'btnRoles\']")).click();
	
		driver.findElement(By.xpath("//*[@id=\'txtRname\']")).sendKeys("saikumareee");
		driver.findElement(By.xpath("//*[@id=\'txtRDesc\']")).sendKeys("kizzzz");
		Select obj=new Select(driver.findElement(By.xpath("//*[@id=\'lstRtypeN\']")));
		obj.selectByVisibleText("C");
		driver.findElement(By.xpath("//*[@id=\"btninsert\"]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr/td[3]/a/img")).click();
		
		//driver.switchTo().alert().accept();
		
		driver.close();
		
		

	}
}

