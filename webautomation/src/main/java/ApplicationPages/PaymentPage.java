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
	WebElement BuyButton;
	
	@FindBy(xpath="//div[@class='cart-checkout']")
	WebElement Checkout;
	
	


	@FindBy(xpath="//div[@class='text-button-main']/span")
	//@FindBy(css="div.text-button-main>span")
	WebElement Continue;
	
	//a[@class='list with-promo']
	
	@FindBy(xpath="//a[@class='list with-promo']")
	WebElement CreditCard;
	
	
	@FindBy(xpath="//input[@name='cardnumber']")
	WebElement CardNumber;
	
	
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
		return true;
	}
	
	public boolean clickOnContinue()
	{
		
		driver.switchTo().frame("snap-midtrans");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Continue);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	//	boolean result =Continue.isDisplayed();
		//System.out.println(result);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement element = driver.findElement(By("element_path"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Continue).click().perform();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().fra
		
	//	Continue.click();
		return true;
	}

	
	public boolean clickOnCreditCard()
	{
		CreditCard.click();
		return true;
	}
	
	public boolean sendDataToCardNumber()
	{
		CardNumber.click();
		return true;
	}
}
