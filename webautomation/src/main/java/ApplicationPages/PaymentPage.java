package ApplicationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utility.CommonUtility;

public class PaymentPage extends CommonUtility{
	
	 WebDriver driver;
	
	
	 @FindBy(xpath="//a[@class='btn buy']")
	private WebElement BuyButton;
	
	@FindBy(xpath="//div[@class='cart-action']/child::div[1]")
	private WebElement Checkout;
	
	


	@FindBy(xpath="//div[@class='text-button-main']/span")
	//@FindBy(css="div.text-button-main>span")
	private WebElement Continue;
	
	//a[@class='list with-promo']
	
	@FindBy(xpath="//a[@class='list with-promo']")
	private WebElement CreditCard;
	
	
	@FindBy(xpath="//input[@name='cardnumber']")
	private WebElement CardNumber;
	
	
	@FindBy(xpath="//input[@placeholder='MM / YY']")
	private WebElement ExpiryDate;
	
	@FindBy(xpath="//input[@placeholder='123']")
	private WebElement Cvv;
	
	@FindBy(xpath="//div[@class='text-button-main']/span")
	//@FindBy(css="div.text-button-main>span")
	private WebElement PayNow;
	
	 public PaymentPage(WebDriver driver)
	 
	 {
	 
	 this.driver = driver;
	 
	 }
	
	public boolean clickOnBuyButton()
	{
		//CommonUtility.explicitWait(BuyButton,driver);
		CommonUtility.click(BuyButton);
		return clickresult; 
	
	}
	
	public boolean clickOnCheckout()
	{
		/*Checkout.click();
	//	return true;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		actions.moveToElement(Checkout).click().perform();
		return true;*/
		CommonUtility.click(Checkout);
		return clickresult; 
	}
	
	public boolean clickOnContinue()
	{
		
		driver.switchTo().frame("snap-midtrans");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Continue);*/
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	//	boolean result =Continue.isDisplayed();
		//System.out.println(result);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement element = driver.findElement(By("element_path"));
		/*Actions actions = new Actions(driver);
		actions.moveToElement(Continue).click().perform();*/
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().fra
	//	driver.switchTo().defaultContent();
	//	Continue.click();
		CommonUtility.clickByAction(Continue);
		return clickByActionresult;
	}

	
	public boolean clickOnCreditCard()
	{
		CommonUtility.clickByAction(CreditCard);
		return clickByActionresult;
	}
	
	public boolean sendDataToCardNumber(String datacardNumber)
	{
		CommonUtility.sendByKeys(CardNumber, datacardNumber);
	
		return sendByKeysresult;
	}
	
	public boolean sendDataToExpiryDate(String dataexpiryDate)
	{
		CommonUtility.sendByKeys(ExpiryDate, dataexpiryDate);
	
		return sendByKeysresult;
	}
	
	public boolean sendDataToCvv(String datacvv)
	{
		CommonUtility.sendByKeys(Cvv, datacvv);
	
		return sendByKeysresult;
	}
	
	
	public boolean clickOnPayNow()
	{
		
	//	driver.switchTo().frame("snap-midtrans");
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", PayNow);*/
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	//	boolean result =Continue.isDisplayed();
		//System.out.println(result);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement element = driver.findElement(By("element_path"));
		CommonUtility.clickByAction(PayNow);
		return clickByActionresult;
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().fra
		
	//	Continue.click();
		//return true;
	}

	
	
}
