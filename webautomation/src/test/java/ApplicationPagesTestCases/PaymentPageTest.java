package ApplicationPagesTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ApplicationPages.PaymentPage;

public class PaymentPageTest {

	WebDriver driver;
	PaymentPage obj;
	
	//@Parameters({"browser"})
	@BeforeMethod
	
	public void selectBrowser()
	{
		
			//System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe");
		//vE:/java/chromedriver_2.35/chromedriver.exe
	//	System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_2.35\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver =new ChromeDriver();
			driver.get("https://demo.midtrans.com/");
			driver.manage().window().maximize();
		obj=	PageFactory.initElements(driver, PaymentPage.class);
		
	}
	
	@Test
	public void validateSuccessfulpayment()
	{
		
		Assert.assertTrue(obj.clickOnBuyButton());
		Assert.assertTrue(obj.clickOnCheckout());
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Assert.assertTrue(obj.clickOnContinue());
		Assert.assertTrue(obj.clickOnCreditCard());
		Assert.assertTrue(obj.sendDataToCardNumber());
		
	}
	
	@AfterMethod
	public void quit()
	{
		driver.close();
	}
	
	
}
