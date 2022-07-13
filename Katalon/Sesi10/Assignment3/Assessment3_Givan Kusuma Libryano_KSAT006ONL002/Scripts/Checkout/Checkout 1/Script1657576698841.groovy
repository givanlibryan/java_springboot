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

Mobile.startExistingApplication(GlobalVariable.linkk, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home/Top/btn_cart'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cart/Bottom/android.widget.Button - CHECKOUT'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Checkout/Body/android.widget.EditText - nama'), 'Budi', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Checkout/Body/android.widget.EditText - your.emailgmail.com'), 'budi@gmail.com', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Checkout/Body/android.widget.EditText - 628123456789'), '085333333333', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Checkout/Body/android.widget.EditText - Your Address'), 'Jakarta', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Checkout/Body/spinner_shipping'), 0)

Mobile.tap(findTestObject('Checkout/Body/spinner_shipping'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Checkout/Body/android.widget.CheckedTextView - TNT Express'), 0)

Mobile.tap(findTestObject('Checkout/Body/android.widget.CheckedTextView - TNT Express'), 0)

Mobile.tap(findTestObject('Checkout/Bottom/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Checkout/Proceed to checkout/android.widget.TextView - Process Checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout/Proceed to checkout/android.widget.TextView - Are you sure want to checkout'), 
    0)

Mobile.verifyElementVisible(findTestObject('Checkout/Proceed to checkout/android.widget.Button - YES'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout/Proceed to checkout/android.widget.Button - NO'), 0)

Mobile.tap(findTestObject('Checkout/Proceed to checkout/android.widget.Button - YES'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Checkout/Thank you for ordering/android.widget.TextView - Congratulation'), 
    0)

Mobile.verifyElementVisible(findTestObject('Checkout/Thank you for ordering/Thanks for ordering'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout/Thank you for ordering/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Checkout/Thank you for ordering/android.widget.Button - OK'), 0)

WebUI.callTestCase(findTestCase('Close application'), [:], FailureHandling.STOP_ON_FAILURE)

