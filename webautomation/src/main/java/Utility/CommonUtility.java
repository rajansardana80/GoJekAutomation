package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class CommonUtility extends TestBase{
	
	protected static boolean clickresult;
	protected static boolean clickByActionresult;
	protected static boolean sendByActionresult;
	public static void click(WebElement ele)
	{
		
		ele.click();
		clickresult=true;
	
		
	}
	public static void explicitWait(WebElement ele,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) ele));
	}
	
	public static void clickByAction(WebElement ele)
	{
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).click().perform();
		clickByActionresult=true;
	}
	
	public static void sendByAction(WebElement ele,String data)
	{
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).sendKeys(data).perform();
		sendByActionresult=true;
	}

}
