import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.att.Utilities.navigateToHomePage'()
CustomKeywords.'com.att.Utilities.openMenu'()
CustomKeywords.'com.att.Utilities.goToSubMenu'("Deals & discounts", "Deals")
CustomKeywords.'com.att.Utilities.verifyPage'("deals")
CustomKeywords.'com.att.Utilities.openMenu'()
CustomKeywords.'com.att.Utilities.goToSubMenu'("Deals & discounts", "Military")
CustomKeywords.'com.att.Utilities.verifyPage'("military-discount")
CustomKeywords.'com.att.Utilities.openMenu'()
CustomKeywords.'com.att.Utilities.goToSubMenu'("Deals & discounts", "First responders")
CustomKeywords.'com.att.Utilities.verifyPage'("first-responders")
CustomKeywords.'com.att.Utilities.openMenu'()
CustomKeywords.'com.att.Utilities.goToSubMenu'("Deals & discounts", "Nurses & physicians")
CustomKeywords.'com.att.Utilities.verifyPage'("healthcare")
CustomKeywords.'com.att.Utilities.openMenu'()
CustomKeywords.'com.att.Utilities.goToSubMenu'("Deals & discounts", "Teachers")
CustomKeywords.'com.att.Utilities.verifyPage'("teacher")

