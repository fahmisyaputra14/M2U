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


def data = findTestData('Data Files/Login/LoginData')
	// ===== Flow 1 (Row 1) =====
	//Mobile.startApplication('/Users/fahmi/Downloads/app-fcm-debug.apk', false)
	Mobile.startExistingApplication('id.com.uiux.mobile')
	
	CustomKeywords.'auth.Login.loginExistingData'(
		//data.getValue('username', 1),
		data.getValue('password', 1)
	)
	
	//Mobile.closeApplication()
	//Mobile.clearApplicationData('id.com.uiux.mobile')
	//Runtime.getRuntime().exec("adb shell pm clear id.com.uiux.mobile")
