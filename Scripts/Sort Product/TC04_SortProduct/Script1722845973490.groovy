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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.saucedemo.com/v1/index.html')

WebUI.setText(findTestObject('Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name'),
	'standard_user')

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password'),
	'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_login-button'))

WebUI.waitForElementClickable(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'), 10)
WebUI.click(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.waitForElementClickable(findTestObject('Page_Swag Labs/button_ADD TO CART'), 10)
WebUI.click(findTestObject('Page_Swag Labs/button_ADD TO CART'))

WebUI.waitForElementClickable(findTestObject('Page_Swag Labs/div_Sauce Labs Bike Light'), 10)
WebUI.click(findTestObject('Page_Swag Labs/div_Sauce Labs Bike Light'))

WebUI.waitForElementClickable(findTestObject('Page_Swag Labs/button_ADD TO CART'), 10)
WebUI.click(findTestObject('Page_Swag Labs/button_ADD TO CART'))

WebUI.click(findTestObject('Page_Swag Labs/icon_Shopping Cart'))

// Verifikasi produk ada di keranjang
WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/keranjang_Sauce Labs Backpack'), 10)
WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/keranjang_Sauce Labs Bike Light'), 10)
