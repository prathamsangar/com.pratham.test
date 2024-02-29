package com.pratham.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import com.pratham.driver.Driver;

public class secondLogin {

	private final By logout_button = By.xpath("//div[2]/div/div/button/p[1]");
	Duration timeoutDuration = Duration.ofSeconds(20);

	public void signOut() {

		Driver.wait(logout_button).click();

	}


}
