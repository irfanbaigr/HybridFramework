package com.qa.learn.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.learn.testng.utils.ElementUtils;

public class LoginPage {

	private By Email= By.name("email");
	private	By Password= By.name("password");
	private	By Login= By.xpath("//*[@value='Login']");
	private By ForgetPwdlink=By.linkText("Forgotten Password");
	private By LoginHeader=By.xpath("(//li/a[text()='Login'])[2]");
	
	private WebDriver driver;
	private ElementUtils elementUtils;
	private AccountsPage accountsPage;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtils = new ElementUtils(this.driver);
		accountsPage = new AccountsPage(driver);
	}

	public String getLoginPageTitle() {
		return elementUtils.getPageTitle();
	}

	public AccountsPage loginOpenCart(String uname, String pwd) {
		elementUtils.doSendKeys(Email, uname);
		elementUtils.doSendKeys(Password, pwd);
		elementUtils.clickAnElement(Login);
		return accountsPage;
	}

	public boolean loginLinkExist() {
		return elementUtils.isElementDisplayed(LoginHeader);
	}

	public boolean forgottenPwdLinkExist() {
		return elementUtils.isElementDisplayed(ForgetPwdlink);
	}
	
}
