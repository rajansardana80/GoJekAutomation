package ApplicationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	
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
		BuyButton.click();
		return true;
	}
	
	public boolean clickOnCheckout()
	{
		Checkout.click();
	//	return true;
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		actions.moveToElement(Checkout).click().perform();*/
		return true;
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
		Actions actions = new Actions(driver);
		actions.moveToElement(Continue).click().perform();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().fra
	//	driver.switchTo().defaultContent();
	//	Continue.click();
		return true;
	}

	
	public boolean clickOnCreditCard()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(CreditCard).click().perform();
		return true;
	}
	
	public boolean sendDataToCardNumber(String cardNumber)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(CardNumber).sendKeys(cardNumber).perform();
		return true;
	}
	
	public boolean sendDataToExpiryDate(String expiryDate)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(ExpiryDate).sendKeys(expiryDate).perform();
		return true;
	}
	
	public boolean sendDataToCvv(String cvv)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(Cvv).sendKeys(cvv).perform();
		return true;
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
		Actions actions = new Actions(driver);
		actions.moveToElement(PayNow).click().perform();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().fra
		
	//	Continue.click();
		return true;
	}

	
	
}
