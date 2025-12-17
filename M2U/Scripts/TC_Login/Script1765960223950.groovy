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
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

TestData data = TestDataFactory.findTestData('Data Files/Login/LoginData')

int rowCount = data.getRowNumbers()
for (int i = 1; i <= rowCount; i++) {
	
	String username = data.getValue('username', i)
	String password = data.getValue('password', i)
	String expected = data.getValue('expected', i)
	
	Mobile.startApplication('/Users/fahmi/Downloads/app-fcm-debug.apk', false)
	
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - MULAI'), 0)
	
	Mobile.scrollToText('SETUJU DAN LANJUT')
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.CheckBox'), 0)
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - SETUJU DAN LANJUT'), 0)
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton'), 0)
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - User-ID'), 0)
	Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - User-ID (1)'), username, 10)
	Mobile.hideKeyboard()
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LANJUT'), 0)
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - YA'), 0)
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), 0)
	Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), password, 10)
	Mobile.hideKeyboard()
	Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LOGIN'), 0)
	
	if (expected == 'success') {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton (1)'), 0)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - U Transaction Account'), 10)
		Mobile.takeScreenshot('/Users/fahmi/Documents/Project/Katalon/Mobile/M2U Dev/Screenshoot/screenshot.png')
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton (2)'), 0)
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - LOGOUT'), 0)
		Mobile.getText(findTestObject('Object Repository/Login/android.widget.TextView - Anda telah berhasil keluar.Terima kasih telah menggunakan M2U hari ini'), 0)
		Mobile.takeScreenshot('/Users/fahmi/Documents/Project/Katalon/Mobile/M2U Dev/Screenshoot/Logout.png')
		Mobile.closeApplication()
		
	} else {
		println("Login Salah")
	}
	
}








/*

Mobile.startApplication('/Users/fahmi/Downloads/app-fcm-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - MULAI'), 0)

Mobile.scrollToText('SETUJU DAN LANJUT')

Mobile.tap(findTestObject('Object Repository/Login/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - SETUJU DAN LANJUT'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - User-ID'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - User-ID (1)'), 'ntbfau12', 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LANJUT'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - YA'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), 'Mbi1234567', 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton (1)'), 0)

Mobile.getText(findTestObject('Object Repository/Login/android.widget.TextView - U Transaction Account'), 0)

Mobile.getText(findTestObject('Object Repository/Login/android.widget.TextView - 8003951650'), 0)

//Mobile.takeScreenshot('/Users/fahmi/Documents/Project/Katalon/Mobile/M2U Dev/Screenshoot/screenshot.png')

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - LOGOUT'), 0)

Mobile.getText(findTestObject('Object Repository/Login/android.widget.TextView - Anda telah berhasil keluar.Terima kasih telah menggunakan M2U hari ini'), 0)

//Mobile.takeScreenshot('/Users/fahmi/Documents/Project/Katalon/Mobile/M2U Dev/Screenshoot/Logout.png')

Mobile.closeApplication()
*/
