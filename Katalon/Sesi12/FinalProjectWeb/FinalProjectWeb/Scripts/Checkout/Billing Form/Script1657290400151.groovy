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

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Checkout/Billing form/Billing form label/h1_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout/Billing form/Billing form label/h3_Billing details'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout/Billing form/Billing form label/label_First name'), 0)

WebUI.setText(findTestObject('Checkout/Billing form/Billing form input/input__billing_first_name'), 'budi')

WebUI.verifyElementPresent(findTestObject('Checkout/Billing form/Billing form input/input__billing_last_name'), 0)

WebUI.setText(findTestObject('Checkout/Billing form/Billing form input/input__billing_last_name'), 'doremi')

WebUI.waitForElementClickable(findTestObject('Checkout/Billing form/Country selection/span_Indonesia_select2-selection__arrow'), 
    3)

WebUI.click(findTestObject('Checkout/Billing form/Country selection/span_Indonesia_select2-selection__arrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Checkout/Billing form/Country selection/input__select2-search__field'), 3)

WebUI.setText(findTestObject('Checkout/Billing form/Country selection/input__select2-search__field'), 'Indonesia')

WebUI.waitForElementPresent(findTestObject('Checkout/Billing form/Country selection/li_Indonesia'), 3)

WebUI.click(findTestObject('Checkout/Billing form/Country selection/li_Indonesia'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Checkout/Billing form/Billing form input/input_street_1'), 0)

WebUI.setText(findTestObject('Checkout/Billing form/Billing form input/input_street_1'), 'jl jakarta')

WebUI.waitForElementPresent(findTestObject('Checkout/Billing form/Billing form input/input_city'), 0)

WebUI.setText(findTestObject('Checkout/Billing form/Billing form input/input_city'), 'jakarta')

WebUI.verifyElementPresent(findTestObject('Checkout/Billing form/Billing form input/input__billing_postcode'), 0)

WebUI.setText(findTestObject('Checkout/Billing form/Billing form input/input__billing_postcode'), '11530')

WebUI.verifyElementPresent(findTestObject('Checkout/Billing form/Billing form input/input__billing_phone'), 0)

WebUI.setText(findTestObject('Checkout/Billing form/Billing form input/input__billing_phone'), '081123456789')

WebUI.verifyElementPresent(findTestObject('Checkout/Billing form/Billing form input/input__billing_email'), 0)

WebUI.setText(findTestObject('Checkout/Billing form/Billing form input/input__billing_email'), 'budi@gmail.com')

