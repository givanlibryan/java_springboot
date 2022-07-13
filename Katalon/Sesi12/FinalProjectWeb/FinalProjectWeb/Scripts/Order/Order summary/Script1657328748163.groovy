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


currentUrl = WebUI.getWindowTitle()

urlPresent = currentUrl.contains(GlobalVariable.OrderReceivedUrl)

if (!urlPresent) {
	throw new com.kms.katalon.core.exception.StepFailedException('Not redirect to order summary')
}

WebUI.verifyElementPresent(findTestObject('Order/Order summary/h1_Order received'), 0)

WebUI.verifyElementPresent(findTestObject('Order/Order summary/li_DateJuly 9, 2022'), 0)

WebUI.verifyElementPresent(findTestObject('Order/Order summary/li_Order number366'), 0)

WebUI.verifyElementPresent(findTestObject('Order/Order summary/li_Payment methodBank Transfer - BNI'), 0)

WebUI.verifyElementPresent(findTestObject('Order/Order summary/li_TotalRp15.000'), 0)

WebUI.verifyElementPresent(findTestObject('Order/Order summary/p_Thank you. Your order has been received'), 0)

