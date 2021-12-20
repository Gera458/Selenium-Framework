package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.BaseTest;



public class ElementFetch {

	
	public WebElement getwebelement(String identifiretype, String identifirevalue)
	{
		switch (identifiretype) {
		case "ID":
			return BaseTest.driver.findElement(By.id(identifirevalue));
		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(identifirevalue));
		case "CLASS":
			return BaseTest.driver.findElement(By.className(identifirevalue));
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifirevalue));
			default:
				return null;
		
		}
	}
	
	public List<WebElement> getListwebelement(String identifiretype, String identifirevalue)
	{
		switch (identifiretype) {
		case "ID":
			return BaseTest.driver.findElements(By.id(identifirevalue));
		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identifirevalue));
		case "CLASS":
			return BaseTest.driver.findElements(By.className(identifirevalue));
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifirevalue));
			default:
				return null;
		
		}
	}
}
