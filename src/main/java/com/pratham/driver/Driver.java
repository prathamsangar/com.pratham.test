package com.pratham.driver;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pratham.constraints.FrameworkConstraints;

import com.pratham.utils.ReadPropertyFile;

public class Driver {
	public static WebDriver driver;
	static Duration timeoutDuration = Duration.ofSeconds(20);

	public static void initDriver() throws IOException {


		if(Objects.isNull(driver)) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstraints.getChromeDriverpath());
			driver = new ChromeDriver();
			driver.get(ReadPropertyFile.getValue("url"));
			driver.manage().window().maximize();
		}

	}
	
	public static WebElement wait(By elementName) {
		WebDriverWait wait = new WebDriverWait(Driver.driver, timeoutDuration);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementName));
		return element;
	}

	public static void quitDriver() {
		if(Objects.nonNull(driver)) {

			driver.quit();
			driver=null;
		}
	}

}
