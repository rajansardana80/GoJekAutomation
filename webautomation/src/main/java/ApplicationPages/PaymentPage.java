package ApplicationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//a[@class='btn buy']")
	WebElement BuyButton;
	
	@FindBy(xpath="//div[@class='cart-checkout']")
	WebElement Checkout;
	
	


	@FindBy(xpath="//div[@class='text-button-main']")
	WebElement Continue;
	
	//a[@class='list with-promo']
	
	@FindBy(xpath="//a[@class='list with-promo']")
	WebElement CreditCard;
	
	
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Continue);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Continue.click();
		return true;
	}

	
	public boolean clickOnCreditCard()
	{
		CreditCard.click();
		return true;
	}
}
