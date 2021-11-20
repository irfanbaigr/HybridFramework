package com.qa.learn.testng.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.learn.testng.utils.ElementUtils;

/*
 * 1. By locators
 * 2. Constructor
 * 3. Page Actions
*/
public class AccountsPage {

	private By accountPageHeaders = By.xpath("//div[@id='content']/h2");
	private By accountPageList = By.xpath("//div[@class='list-group']/a");
	private By accountFooterLinks = By.xpath("//*[text()='Information']/../../div/h5");

	private WebDriver driver;
	private ElementUtils elementUtils;

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		elementUtils = new ElementUtils(this.driver);
	}

	public List<String> getaccountPageHeaders() {
		return elementUtils.getAllElementText(accountPageHeaders);
	}

	public List<String> getaccountPageList() {
		return elementUtils.getAllElementText(accountPageList);
	}

	public List<String> getaccountPageFooters() {
		return elementUtils.getAllElementText(accountFooterLinks);
	}

	public String getaccountPageUrl() {
		return elementUtils.getPageUrl();
	}

}