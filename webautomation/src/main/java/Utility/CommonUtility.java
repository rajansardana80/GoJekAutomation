package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableBiMap.Builder;

import Base.TestBase;

public class CommonUtility extends TestBase{
	
	protected static boolean clickresult;
	protected static boolean clickByActionresult;
	protected static boolean sendByActionresult;
	protected static boolean sendByKeysresult;
	public static void click(WebElement ele)
	{
		
		ele.click();
		clickresult=true;
	
		// just a comment for demo
	}
//	public static void explicitWait(WebElement ele,WebDriver driver)
//	{
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) ele));
//	}
	
	public static void clickByAction(WebElement ele)
	{
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).click().build().perform();
		clickByActionresult=true;
	}
	
	public static void sendByAction(WebElement ele,String data)
	{
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).sendKeys(data).build().perform();
		sendByActionresult=true;
	}
	
	public static void sendByKeys(WebElement ele,String data)
	{
		
	ele.sendKeys(data);
	sendByKeysresult=true;
	}

}
