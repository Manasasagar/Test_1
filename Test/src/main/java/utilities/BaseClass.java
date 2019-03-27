package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	 public static WebDriver driver;
	 
	 public WebDriver BaseClassMethod(String Browsername, String URL)
	 {
		 if(driver==null)
		 {
			 switch (Browsername.toLowerCase())
			 {
			 case "firefox": 
				 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe/");
				 driver=new FirefoxDriver();
				 break;
				 
			 case "chrome":
				 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
					driver= new ChromeDriver();
					break;
			 case "ie":
				 System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
					driver=new InternetExplorerDriver();

			 }
		 }
		 driver.get(URL);
		 driver.manage().window().maximize();
		return driver;
	 }
	 
	public static void main(String[]args) throws IOException
	 {
		 BaseClass base= new BaseClass();
		 base.BaseClassMethod("Chrome","Https://phlvdqapport08.nextgen.com/ppmain");
		 
	 }
}
