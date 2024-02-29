package org.pratham.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.pratham.pages.BasicInfo;
import com.pratham.pages.checklistPage;
import com.pratham.pages.loginPage;


public final class OnboardingTest extends BaseTest {

	private OnboardingTest() {

	}

	@Test(priority = 1)
	public void Login() throws InterruptedException
	{
		loginPage lgin = new loginPage();
		lgin.clickFirstLogin();
		lgin.enterUsername("pratham.sangar@qsstechnosoft.com");
		lgin.enterPassword("Magic@1234");
		lgin.clickLogin();			
		checklistPage signOut = new checklistPage();
		signOut.nextBasic();
	}

	@Test(priority = 2)
	public void basicInfo() throws InterruptedException
	{
		loginPage lgin = new loginPage();
		lgin.clickFirstLogin();
		lgin.enterUsername("pratham.sangar@qsstechnosoft.com");
		lgin.enterPassword("Magic@1234");
		lgin.clickLogin();			
		checklistPage signOut = new checklistPage();
		BasicInfo basic = new BasicInfo();
		signOut.nextBasic();
		Assertions.assertThat(basic.basicInfo()).isNotEmpty().contains("Pratham");
		
	}

}
