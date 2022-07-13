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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.chandra.LoopXpath as loopXpath

WebUI.callTestCase(findTestCase('Login/Login - 01'), [('username') : 'akun1', ('password') : 'hIKaRt4WZcA='], FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver()

WebUI.delay(5)

Mobile.tap(findTestObject('Menu/btn_Left menu'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu/Left Menu/Body/android.widget.CheckedTextView - Make a Payment'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Payment/Bottom/btn_Add new payee'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Payment/Add a Payee/android.widget.TextView - Add a Payee'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/Add a Payee/android.widget.EditText - Payee Name'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/Add a Payee/android.widget.Button - ADD'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/Add a Payee/android.widget.Button - CANCEL'), 0)

Mobile.tap(findTestObject('Payment/Add a Payee/android.widget.EditText - Payee Name'), 0)

Mobile.setText(findTestObject('Payment/Add a Payee/android.widget.EditText - Payee Name'), payee_name, 0)

Mobile.tap(findTestObject('Payment/Add a Payee/android.widget.Button - ADD'), 0)

driver.terminateApp(GlobalVariable.appId)

