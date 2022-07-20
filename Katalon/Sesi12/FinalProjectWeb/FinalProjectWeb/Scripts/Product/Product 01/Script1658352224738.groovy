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

WebUI.verifyElementPresent(findTestObject('Product/Product image'), 3)

WebUI.verifyElementText(findTestObject('Product/Product name'), productName)

WebUI.verifyElementText(findTestObject('Product/p_Rp20 Rp18'), productPrice)

WebUI.verifyElementPresent(findTestObject('Product/button_Add to cart'), 5)

WebUI.verifyElementPresent(findTestObject('Product/a_Description'), 3)

WebUI.verifyElementPresent(findTestObject('Product/a_Reviews'), 3)

WebUI.verifyElementPresent(findTestObject('Product/Qty box'), 3)

WebUI.clearText(findTestObject('Product/Qty box'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Product/Qty box'), productQty)

WebUI.waitForElementPresent(findTestObject('Cart/Action button/button_Add to cart'), 5)

WebUI.click(findTestObject('Cart/Action button/button_Add to cart'))

WebUI.click(findTestObject('Cart/Action button/i_Rp_thehanger-icons-shopping-bag'))

WebUI.verifyElementPresent(findTestObject('Cart/Action button/a_Remove product'), 5)

