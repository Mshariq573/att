import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.testdata.TestDataFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities

WebDriver driver

System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())

ChromeOptions options = new ChromeOptions()

options.setExperimentalOption("useAutomationExtension", false)

driver = new ChromeDriver(options)

DriverFactory.changeWebDriver(driver)		

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()


WebUI.verifyElementPresent(findTestObject('Object Repository/Deals'), GlobalVariable.Time_Out)

WebUI.click(findTestObject('Object Repository/Deals'))

WebUI.verifyTextPresent("Shop AT&T deals by category", false)

WebUI.click(findTestObject('Object Repository/Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Phone_And_devices'), GlobalVariable.Time_Out)

WebUI.click(findTestObject('Object Repository/Phone_And_devices'))

WebUI.verifyTextPresent("Pick your phones", false)

WebUI.click(findTestObject('Object Repository/Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Wireless'), GlobalVariable.Time_Out)

WebUI.click(findTestObject('Object Repository/Wireless'))

WebUI.click(findTestObject('Object Repository/Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Internet'), GlobalVariable.Time_Out)

WebUI.click(findTestObject('Object Repository/Internet'))

WebUI.click(findTestObject('Object Repository/Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TV'), GlobalVariable.Time_Out)

WebUI.click(findTestObject('Object Repository/TV'))

WebUI.click(findTestObject('Object Repository/Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Prepaid'), GlobalVariable.Time_Out)

WebUI.click(findTestObject('Object Repository/Prepaid'))

WebUI.click(findTestObject('Object Repository/Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Bundles'), GlobalVariable.Time_Out)

WebUI.click(findTestObject('Object Repository/Bundles'))

WebUI.click(findTestObject('Object Repository/Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Search_Box'), GlobalVariable.Time_Out)

WebUI.sendKeys(findTestObject('Object Repository/Search_Box'), GlobalVariable.search_item)

WebUI.click(findTestObject('Object Repository/Home'))







