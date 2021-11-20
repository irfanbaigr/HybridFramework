package com.qa.learn.testng.ProjectStructure;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.learn.testng.utils.ConstantUtils;



public class LoginPageTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String loginPageTitle = loginPage.getLoginPageTitle();
		System.out.println("Login Page Title " + loginPageTitle);
		Assert.assertEquals(loginPageTitle, ConstantUtils.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 4)
	public void LoginAppTest() {
		loginPage.loginOpenCart(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 2)
	public void forgottentPwdLinkTest() {
		Assert.assertTrue(loginPage.forgottenPwdLinkExist());
	}

	@Test(priority = 3)
	public void loginLinkTest() {
		Assert.assertTrue(loginPage.loginLinkExist());

	}
}