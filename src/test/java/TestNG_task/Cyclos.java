package TestNG_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Cyclos {
	WebDriver driver;
	@BeforeMethod
	void launch() {
		driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="TD")
	void login(String uname,String pwd) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
	}
	@AfterMethod
	void close() {
		driver.quit();
	}
	@DataProvider(name="TD")
	String[][] loginData(){ // two dimensional array
		String data[][]= { // stored data in array
				{"demo","1234"},//valid
				{"vaishnavi","567"},//invalid
	};	
	return data;	
	}

}
