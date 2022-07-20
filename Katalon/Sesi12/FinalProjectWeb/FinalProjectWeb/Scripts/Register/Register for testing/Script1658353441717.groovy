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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.WebsiteName)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Register/btn_Go to register'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Register/Register page/input_Username'), username)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Register/Register page/input_E-mail Address'), email)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Register/Register page/div_Phone Number'))

WebUI.setText(findTestObject('Object Repository/Register/Register page/input_Phone Number'), phone)

WebUI.setText(findTestObject('Object Repository/Register/Register page/input_Password'), password)

WebUI.setText(findTestObject('Object Repository/Register/Register page/input_Confirm Password'), confirm_password)

WebUI.setText(findTestObject('Object Repository/Register/Register page/input_Address'), address)

WebUI.click(findTestObject('Object Repository/Register/Register page/btn_Submit register'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

currentUrl = WebUI.getWindowTitle()

currentAcc = ((username + ' | ') + 'Kotakoki')

WebUI.verifyMatch(currentUrl, currentAcc, false)

WebUI.verifyElementText(findTestObject('MyAccount/h1_Chan aja'), username)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

