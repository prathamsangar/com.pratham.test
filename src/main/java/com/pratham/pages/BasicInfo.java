package com.pratham.pages;

import org.openqa.selenium.By;

import com.pratham.driver.Driver;

public class BasicInfo {

	private final By get_name = By.xpath("//form/div[2]/div/div[3]/div/p");

	public String basicInfo(){
		String realFN = Driver.wait(get_name).getText();		
		return realFN;

	}
}
