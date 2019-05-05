package TestListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.TestBase;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class AutomationListener extends TestBase implements ITestListener {

	//WebDriver driver;
	//ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("C:\\Users\\rajan\\work\\webautomation\\src\\test\\java\\Reports\\AutomtionReport.html");

	// protected static WebDriver driver;
 /*static ExtentReports reports ;
 static ExtentTest test;*/


	@Override
	public void onTestStart(ITestResult result) {
		//reports..attachReporter(htmlreport);
		System.out.println(result.getMethod().getMethodName());
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName()+" test has started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(LogStatus.PASS, result.getMethod().getMethodName()+" test has passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.FAIL, result.getMethod().getMethodName()+" test has failed");
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File("C:\\Users\\rajan\\work\\webautomation\\Screenshot" + result.getMethod().getMethodName() + ".png"));
			 //  String file = test.addScreenCaptureFromPath("C:\\Users\\rajan\\work\\webautomation\\Screenshot" + result.getMethod().getMethodName() + ".png");
			//test.log(Status.FAIL, result.getMethod().getMethodName() + "failed testcasescreenshot",file);
			String file = test.addScreenCapture("C:\\Users\\rajan\\work\\webautomation\\Screenshot" + result.getMethod().getMethodName() + ".png");
			   test.log(LogStatus.FAIL, file);

			   test.log(LogStatus.FAIL, result.getThrowable().getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//FileUtils.copyFile(f, new File("C:\\images\\" + result.getMethod().getMethodName() + ".png"));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 System.out.println("on test skipped");
		  test.log(LogStatus.SKIP, result.getMethod().getMethodName() + " test is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext contexts) {
		  System.out.println("on start");
		  
		//  System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_2.35\\chromedriver.exe");
		  //driver = new ChromeDriver();
		reports=	new ExtentReports("C:\\Users\\rajan\\work\\webautomation\\src\\test\\java\\Reports\\AutomtionReport.html");
		 
	}

	@Override
	public void onFinish(ITestContext context) {
	//	 driver.close();
		reports.endTest(test);
		  reports.flush();
		
	}

	
}
