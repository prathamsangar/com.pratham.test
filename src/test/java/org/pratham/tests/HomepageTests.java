package org.pratham.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.pratham.driver.Driver;

public final class HomepageTests extends BaseTest {
	
	private HomepageTests() {
		
	}

	@Test
	public void test2()
	{
		Driver.driver.findElement(By.name("q")).sendKeys("pratham sangar",Keys.ENTER);

	}
	
	

}
