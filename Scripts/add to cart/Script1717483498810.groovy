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

Mobile.tap(findTestObject('android.widget.TextView - ADD TO CART'), 0)

price = Mobile.getText(findTestObject('android.widget.TextView - 29.99'), 0)

Mobile.tap(findTestObject('android.view.ViewGroup'), 0)

cartPrice = Mobile.getText(findTestObject('android.widget.TextView - 29.99 (1)'), 0)

Mobile.verifyMatch(price, cartPrice, false)

Mobile.tap(findTestObject('android.widget.TextView - CHECKOUT'), 0)

Mobile.setText(findTestObject('android.widget.EditText - First Name'), GlobalVariable.firstName, 0)

Mobile.setText(findTestObject('android.widget.EditText - Last Name'), GlobalVariable.lastName, 0)

Mobile.setText(findTestObject('android.widget.EditText - ZipPostal Code'), GlobalVariable.postal, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView - CONTINUE'), 0)

Mobile.scrollToText('FINISH', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView - FINISH'), 0)

Mobile.verifyElementVisible(findTestObject('android.widget.TextView - THANK YOU FOR YOU ORDER'), 0)

