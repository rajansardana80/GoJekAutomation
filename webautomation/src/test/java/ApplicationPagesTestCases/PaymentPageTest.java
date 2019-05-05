package ApplicationPagesTestCases;

import java.util.Properties;
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

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ReportAggregatesListener;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;






import com.relevantcodes.extentreports.LogStatus;

import ApplicationPages.PaymentPage;
import Base.TestBase;

public class PaymentPageTest extends TestBase {

	//WebDriver driver;
	PaymentPage obj;

	PaymentPageTest obj1;

	

	//WebDriver driv=	obj1.getdriverInstance();
	
	//@Parameters({"browser"})
	@BeforeMethod
	
	public void selectBrowser()
	{
		
			//System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe");
		//vE:/java/chromedriver_2.35/chromedriver.exe
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	setdriverInstance();
	driver.get("https://demo.midtrans.com/");
	driver.manage().window().maximize();
		obj=	PageFactory.initElements(driver, PaymentPage.class);
	
		
		
		
	}
	
	@Test
	public void validateSuccessfulpayment()
	{
		 
		Assert.assertTrue(obj.clickOnBuyButton());
		test.log(LogStatus.INFO, "Successfully clicked on Buy Button");
		Assert.assertTrue(obj.clickOnCheckout());
		test.log(LogStatus.INFO, "Successfully clicked on CheckOut Button");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Assert.assertTrue(obj.clickOnContinue());
		test.log(LogStatus.INFO, "Successfully clicked on Continue Button");
		Assert.assertTrue(obj.clickOnCreditCard());
		test.log(LogStatus.INFO, "Successfully clicked on Credit Card");
		//System.out.println(TestBase.p.getProperty("validcreditcardnumber"));
	//	test.log(LogStatus.INFO, "Successfully clicked on Credit Card");
		Assert.assertTrue(obj.sendDataToCardNumber(TestBase.p.getProperty("validcreditcardnumber")));
		test.log(LogStatus.INFO, "Successfully entered Credit Card");
		Assert.assertTrue(obj.sendDataToExpiryDate(TestBase.p.getProperty("expirydate")));
		test.log(LogStatus.INFO, "Successfully entered Expiry Date");
		Assert.assertTrue(obj.sendDataToCvv(TestBase.p.getProperty("cvv")));
		test.log(LogStatus.INFO, "Successfully entered Cvv ");
		Assert.assertTrue(obj.clickOnPayNow());
		test.log(LogStatus.INFO, "Successfully clicked on Pay Now");
		
	}
	
	@AfterMethod
	public void quit()
	{
		driver.close();
	}
	
	
}
