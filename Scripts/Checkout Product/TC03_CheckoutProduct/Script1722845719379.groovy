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

WebUI.openBrowser('https://www.saucedemo.com/v1/inventory.html')

// Klik pada Sauce Labs Backpack
WebUI.click(findTestObject('Page_Swag Labs/div_Sauce Labs Backpackcarry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.29.99ADD TO CART'))

// Klik pada tombol 'ADD TO CART'
WebUI.click(findTestObject('Page_Swag Labs/button_ADD TO CART'))

// Klik pada ikon keranjang belanja
WebUI.click(findTestObject('Page_Swag Labs/svg_Open Menu_svg-inline--fa fa-shopping-cart fa-w-18 fa-3x'))

// Tunggu tombol checkout agar terlihat
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/a_CHECKOUT'), 10)

// Klik pada tombol 'CHECKOUT'
WebUI.click(findTestObject('Page_Swag Labs/a_CHECKOUT'))

// Isi informasi checkout
WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_first-name'), 'john')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_last-name'), 'doe')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_postal-code'), '12345')

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/continueButton'), 20)

// Klik pada tombol 'CONTINUE'
WebUI.click(findTestObject('Page_Swag Labs/continueButton'))

// Tunggu tombol 'FINISH' agar terlihat
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/a_FINISH'), 10)

// Klik pada tombol 'FINISH'
WebUI.click(findTestObject('Page_Swag Labs/a_FINISH'))

