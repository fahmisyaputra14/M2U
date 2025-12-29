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

import internal.GlobalVariable

public class Transfer {

	@Keyword
	def transferAntarMaybank(String NorekAntarMaybank) {

		Mobile.delay(2)

		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Transfer/TransferAntarMaybank/IconTransfer'), 5, FailureHandling.OPTIONAL)) {

			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/IconTransfer'), 5)
			Mobile.waitForElementPresent(findTestObject('Object Repository/Transfer/TransferAntarMaybank/IconTransferAntarMaybank'), 2)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/IconTransferAntarMaybank'), 0)
			Mobile.waitForElementPresent(findTestObject('Object Repository/Transfer/TransferAntarMaybank/PilihRekening8003951650'), 2)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/PilihRekening8003951650'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/tapMataUang'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/TapMataUang-IDR'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/txt_Nomor Rekening'), 0)
			Mobile.setText(findTestObject('Object Repository/Transfer/TransferAntarMaybank/txt_Nomor Rekening'), '8003951664', 1)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/Button-LANJUT-PilihMataUang'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/InputJumlahTransfer-Button-1'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/InputJumlahTransfer-Button-0'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/InputJumlahTransfer-Button-0'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/InputJumlahTransfer-Button-0'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/InputJumlahTransfer-Button-0'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/Button-OKJumlahDanaTransfer'), 0)
			Mobile.tap(findTestObject('Object Repository/Transfer/TransferAntarMaybank/Button-PROSES-Transfer'), 0)
		}
	}

	/*@Keyword
	def loginExistingData (String username, String password) {

		Mobile.delay(1)
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Login/android.widget.EditText - User-ID'), 5, FailureHandling.STOP_ON_FAILURE)) {

			Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - User-ID (1)'), username,0)
			Mobile.hideKeyboard()
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LANJUT'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - YA'), 0)
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), 0)
			Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Masukan Password Anda'), password,0)
			Mobile.hideKeyboard()
			Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - LOGIN'), 0)
		}
	}*/
}
