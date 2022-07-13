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

WebUI.navigateToUrl(productUrl)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Product/Product image'), 0)

WebUI.verifyElementText(findTestObject('Product/Product name'), productName)

WebUI.verifyElementPresent(findTestObject('Product/button_Add to cart'), 0)

WebUI.verifyElementPresent(findTestObject('Product/a_Description'), 0)

WebUI.verifyElementPresent(findTestObject('Product/a_Reviews'), 0)

WebUI.verifyElementPresent(findTestObject('Product/Qty box'), 0)

WebUI.clearText(findTestObject('Product/Qty box'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Product/Qty box'), '-1')

WebUI.waitForElementPresent(findTestObject('Cart/Action button/button_Add to cart'), 0)

WebUI.click(findTestObject('Cart/Action button/button_Add to cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyAlertPresent(0, FailureHandling.STOP_ON_FAILURE)

