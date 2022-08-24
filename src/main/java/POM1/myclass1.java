package POM1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class myclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ROHIT\\Desktop\\Study\\Selenium_Syallabus\\Selenium_soft\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm..");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Uber Application Verification 001");
		System.out.println("Uber Application Verification 002");
		System.out.println("Uber Application Verification 003");
		System.out.println("Uber Application Verification 004");
		System.out.println("Uber Application Verification 005");
		System.out.println("Uber Application Verification 006");
	}

}
