package org.pratham.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pratham.driver.Driver;

public class BaseTest {

	protected BaseTest() {}

	@BeforeMethod
	protected void setup() throws IOException {
		Driver.initDriver();
	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();

	}
}
