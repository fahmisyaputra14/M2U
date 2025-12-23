package auth

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable

class Login {

	@Keyword
	def login(String username, String password) {

		Mobile.delay(5)

		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Login/FormWhileUsingApp'), 5, FailureHandling.OPTIONAL)) {

			Mobile.delay(5)
			//Mobile.waitForElementPresent(findTestObject('Object Repository/Login/FormWhileUsingApp'), 3)
			Mobile.tap(findTestObject('Object Repository/Login/Button - While using the app'), 3)
			Mobile.delay(1)
			Mobile.waitForElementPresent(findTestObject('Object Repository/Login/TextView - Allow M2U ID FCM to send you notifications'), 5)
			Mobile.tap(findTestObject('Object Repository/Login/Button - Dont allow'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - MULAI'), 0)
			//Mobile.scrollToElement(findTestObject('Object Repository/Login/android.widget.Button - SETUJU DAN LANJUT'),10, FailureHandling.OPTIONAL)
			Mobile.scrollToText('SETUJU DAN LANJUT')
			//Mobile.delay(20)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.CheckBox'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - SETUJU DAN LANJUT'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - User-ID'), 0)
			Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - User-ID (1)'), username,0)
			Mobile.hideKeyboard()
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LANJUT'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - YA'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), 0)
			Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), password,0)
			Mobile.hideKeyboard()
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LOGIN'), 0)

			
		}else {

			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - MULAI'), 0)
			//Mobile.scrollToElement(findTestObject('Object Repository/Login/android.widget.Button - SETUJU DAN LANJUT'),10, 5)
			Mobile.scrollToText('SETUJU DAN LANJUT')
			//	Mobile.delay(20)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.CheckBox'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - SETUJU DAN LANJUT'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - User-ID'), 0)
			Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - User-ID (1)'), username,0)
			Mobile.hideKeyboard()
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LANJUT'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - YA'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), 0)
			Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), password,0)
			Mobile.hideKeyboard()
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LOGIN'), 0)

			
		}
	}

	@Keyword
	def verifyResult(String expected) {
		if (expected == 'success') {
			Mobile.verifyElementVisible(findTestObject('Object Repository/Login/PopUpNotifikasiAplikasiAndaAktif'),10)
			Mobile.tap(findTestObject('Object Repository/Login/ImageButtonSilangNotifikasiAplikasiAndaAktif'), 5)
			Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - 8003951650'), 5)
			Mobile.takeScreenshot('/Users/fahmi/Documents/Project/Katalon/Mobile/Mobile/Screenshoot/LoginBerhasil.png')
		} else {
			Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - PasswordSalah'),10)
			Mobile.takeScreenshot('/Users/fahmi/Documents/Project/Katalon/Mobile/Mobile/Screenshoot/LoginGagal.png')
		}
	}
}
