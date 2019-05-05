package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase
{
	
	/*prop = new Properties();
	FileInputStream ip;
	try {
		ip = new FileInputStream("/home/rajansardana/AutomationPractice/seleniumautomation/src/main/java/org/selenium/qa/config/config.properties");
	
		prop.load(ip);*/
	protected static WebDriver driver;
	protected static Properties p;
	protected static ExtentReports reports ;
	protected static ExtentTest test;
	
	FileInputStream ip = null;
	public  TestBase()
	{
		
		 p=new Properties();
		
		//FileReader reader = null;
		
		try {
//			reader = new FileReader("C:\\Users\\rajan\\work\\webautomation\\src\\main\\java\\Config\\TestData.properties");
		
			ip = new FileInputStream("C:\\Users\\rajan\\work\\webautomation\\src\\main\\java\\Config\\TestData.properties");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 
		    try {
				p.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void setdriverInstance()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_2.35\\chromedriver.exe");
		driver =new ChromeDriver();
		//return driver;
	}
}