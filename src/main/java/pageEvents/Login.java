package pageEvents;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObject.Login_Locators;
import utils.CommonMethods;
import utils.ElementFetch;

public class Login extends CommonMethods implements  Login_Locators {
	
	public void login1() throws InterruptedException
	{
		ElementFetch obj=new ElementFetch();
		obj.getwebelement("XPATH", Loc_Username).sendKeys("superadmin007@agnext.in");
		obj.getwebelement("XPATH", Loc_Password).sendKeys("Specx123!");
		obj.getwebelement("XPATH", Loc_SubmitButton).click();
		//sleepTime(2);
		Thread.sleep(5000);
		assertEquals(true, true);
		
	}
	
	
	public void login2() throws InterruptedException
	{
		ElementFetch obj=new ElementFetch();
		obj.getwebelement("XPATH", Loc_Username).sendKeys("superadmin007@agnext.in");
		obj.getwebelement("XPATH", Loc_Password).sendKeys("Specx123!");
		obj.getwebelement("XPATH", Loc_SubmitButton).click();
		//sleepTime(2);
		Thread.sleep(5000);
		assertEquals(true, true);
		
	}

	public void login3() throws InterruptedException
	{
		ElementFetch obj=new ElementFetch();
		obj.getwebelement("XPATH", Loc_Username).sendKeys("superadmin007@agnext.in");
		obj.getwebelement("XPATH", Loc_Password).sendKeys("Specx123!");
		obj.getwebelement("XPATH", Loc_SubmitButton).click();
		//sleepTime(2);
		Thread.sleep(5000);
		assertEquals(true, false);
		
	}
	
	public void login4() throws InterruptedException
	{
		ElementFetch obj=new ElementFetch();
		obj.getwebelement("XPATH", Loc_Username).sendKeys("superadmin007@agnext.in");
		obj.getwebelement("XPATH", Loc_Password).sendKeys("Specx123!");
		obj.getwebelement("XPATH", Loc_SubmitButton).click();
		//sleepTime(2);
		Thread.sleep(5000);
		assertEquals(true, true);
		
	}
	

}
