package com.WebPages.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Base.org.Base_Page;

public class Login_Page extends Base_Page {

	public Login_Page() throws Exception {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	WebElement username;
	@FindBy(id = "pass")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement loginbtn;

	public void verify_Url() {
		System.out.println(driver.getCurrentUrl());
	}

//public void verify_Title() {
//	System.out.println(driver.getTitle());
//}

	public void verify_Login(String usr, String psw) {
		username.sendKeys(usr);
		password.sendKeys(psw);
		loginbtn.click();
		System.out.println("login Succcesully");
	}

}
