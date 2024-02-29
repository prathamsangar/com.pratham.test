package com.pratham.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.pratham.driver.Driver;
	
public class checklistPage {


	private final By next_basicInfo = By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div/div/div[2]/div/div[6]/div/div/div[2]/div/div/button");
			

	public void nextBasic() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Actions actions = new Actions(Driver.driver);
		actions.moveToElement(Driver.wait(next_basicInfo)).perform();
		Driver.wait(next_basicInfo).click();		
	}



}
