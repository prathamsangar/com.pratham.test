package com.pratham.pages;

import org.openqa.selenium.By;

import com.pratham.driver.Driver;

public final class loginPage {

	private final By first_login = By.xpath("//div/div[2]/div/div/div[4]/button");
	private final By textbox_username = By.id("username");
	private final By textbox_password = By.xpath("//input[@id='password' and @type ='password']");
	private final By button_login = By.id("kc-login");

	public secondLogin clickFirstLogin() {
		Driver.wait(first_login).click();
		return new secondLogin();
	}

	public void enterUsername(String username) {

		Driver.driver.findElement(textbox_username).sendKeys(username);

	}

	public void enterPassword(String password) {
		Driver.driver.findElement(textbox_password).sendKeys(password);

	}

	public BasicInfo clickLogin() {
		Driver.driver.findElement(button_login).click();
		return new BasicInfo();
	}


}
