package TestNG_day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceDemoTask {
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	void setup(String br) {
		if(br.equals("chrome")) {
		driver=new ChromeDriver();
		}else
			driver=new EdgeDriver();
	}
	@Test(priority=1)
	@Parameters("url")
	void launch(String appurl) {
		
		driver.get(appurl);
		driver.manage().window().maximize();
	}
	
	    
	}


