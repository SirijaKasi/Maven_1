package com.Test_Cases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.org.Base_Page;
import com.WebPages.org.Login_Page;

public class LoginPage_TestCase extends Base_Page {

	Login_Page login;

	public LoginPage_TestCase() throws Exception {
		super();
	}

	@BeforeMethod
	public void browser_Opening() throws Exception {
		initialization();
		login=new Login_Page();
	}

	@Test(priority=1)
	public void verify_url() {
		login.verify_Url();
	}

	@Test(priority=2)
	public void verify_login() {
		login.verify_Login(prop.getProperty("username"), prop.getProperty("password"));
	}
}
