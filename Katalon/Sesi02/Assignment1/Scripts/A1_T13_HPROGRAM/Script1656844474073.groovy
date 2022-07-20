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

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('LOGIN/button_Make Appointment'))

WebUI.setText(findTestObject('LOGIN/input_Username'), GlobalVariable.username)

WebUI.setText(findTestObject('LOGIN/input_Password'), GlobalVariable.password)

WebUI.sendKeys(findTestObject('LOGIN/input_Password'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByLabel(findTestObject('APPOINTMENT/select_Facility'), 'Tokyo CURA Healthcare Center', 
    false)

WebUI.check(findTestObject('APPOINTMENT/input_Apply for hospital readmission'))

WebUI.check(findTestObject('APPOINTMENT/input_None_programs'))

WebUI.setText(findTestObject('Object Repository/APPOINTMENT/input_Visit Date'), '30/07/2022')

WebUI.setText(findTestObject('Object Repository/APPOINTMENT/textarea_Comment'), 'Test Facility')

WebUI.click(findTestObject('Object Repository/APPOINTMENT/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/APPOINTMENT CONFIRMATION/p_Appointment booked'), 
    0)

WebUI.click(findTestObject('Object Repository/APPOINTMENT CONFIRMATION/a_Go to Homepage'))

WebUI.closeBrowser()

