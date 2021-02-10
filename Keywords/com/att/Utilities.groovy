package com.att

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

import internal.GlobalVariable

public class Utilities {
	WebDriver driver
	String url
	@Keyword
	public void navigateToHomePage(){
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://www.att.com/')
	}

	@Keyword
	public void openMenu(){
		WebUI.waitForElementClickable(findTestObject('Menu/MenuBar'), 60)
		WebUI.click(findTestObject('Menu/MenuBar'))
		WebUI.waitForElementClickable(findTestObject('Menu/DesktopMenu'), 60)
	}

	@Keyword
	public void goToSubMenu(String menu,String subMenu){
		driver = DriverFactory.getWebDriver();
		String menuXpath = "(//*[text()='"+menu+"'])[1]";
		driver.findElement(By.xpath(menuXpath)).click();
		String subMenuXpath = "(//*[text()='"+subMenu+"'])[1]";
		driver.findElement(By.xpath(subMenuXpath)).click();
	}

	@Keyword
	public void verifyPage(String screenName){
		url = WebUI.getUrl()
		assert url.contains(screenName)
	}
}
