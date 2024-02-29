package org.pratham.tests;

import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.pratham.driver.Driver;
import com.pratham.pages.loginPage;
import com.pratham.pages.secondLogin;

public final class LoginPageTest extends BaseTest {

	private LoginPageTest() {

	}

	@Test
	public void Login() throws IOException, InterruptedException
	{
		loginPage lgin = new loginPage();
		lgin.clickFirstLogin();
		lgin.enterUsername("pratham.sangar@qsstechnosoft.com");
		lgin.enterPassword("Magic@1234");
		lgin.clickLogin();
		String Title = Driver.driver.getTitle();
		System.out.println(Title);
		Assertions.assertThat(Title).isNotEmpty().contains("Litehouse App");
		secondLogin signOut = new secondLogin();
		signOut.signOut();
	}
	
	

}
