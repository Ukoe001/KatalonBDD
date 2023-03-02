package outsystems.web.abstraction

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class WebUIAbstraction {

	/**
	 * ############################ Asserts ########################################### 
	 */
	def static VerifyElementText(TestObject webObj, String textToVerify){
		return WebUI.verifyElementText(webObj, textToVerify, FailureHandling.OPTIONAL)
	}

	def static VerifyElementPresent(TestObject webObj, int timeout) {
		return WebUI.verifyElementPresent(webObj, timeout, FailureHandling.OPTIONAL)
	}

	def static VerifyElementChecked(TestObject webObj, int timeout) {
		return WebUI.verifyElementChecked(webObj, timeout, FailureHandling.OPTIONAL)
	}

	def static VerifyElementNotChecked(TestObject webObj, int timeout) {
		return WebUI.verifyElementNotChecked(webObj, timeout, FailureHandling.OPTIONAL)
	}

	def static VerifyElementVisible(TestObject webObj) {
		return WebUI.verifyElementVisible(webObj, FailureHandling.OPTIONAL)
	}

	def static VerifyElementValue(TestObject webObj, String text) {
		return WebUI.verifyElementAttributeValue(webObj, "value", text, 0, FailureHandling.OPTIONAL)
	}

	def static VerifySelectedOptionText(TestObject webObj, String textToVerify) {
		return WebUI.verifyOptionSelectedByLabel(webObj, textToVerify, false, 0, FailureHandling.OPTIONAL)
	}

	/**
	 * ############################ Interactions ######################################
	 */
	def static GetElementText(TestObject webObj) {
		return WebUI.getText(webObj)
	}

	def static Click(TestObject webObj) {
		WebUI.click(webObj)
	}

	def static DoubleClick(TestObject webObj) {
		WebUI.doubleClick(webObj)
	}

	def static Check(TestObject webObj) {
		WebUI.check(webObj)
	}

	def static Uncheck(TestObject webObj) {
		WebUI.uncheck(webObj)
	}

	def static SetText(TestObject webObj, String text) {
		WebUI.setText(webObj, text)
	}

	def static GetValue(TestObject webObj) {
		return WebUI.getAttribute(webObj, "value")
	}

	def static Focus(TestObject webObj) {
		WebUI.focus(webObj)
	}

	def static Delay(int waitTime) {
		WebUI.delay(waitTime)
	}

	def static ClearText(TestObject webObj) {
		WebUI.clearText(webObj)
	}

	def static ClickImage(TestObject webObj) {
		WebUI.clickImage(webObj)
	}

	def static DeselectAllOption(TestObject webObj) {
		WebUI.deselectAllOption(webObj)
	}

	def static DeselectOptionByInnerText(TestObject webObj, String textValue) {
		WebUI.deselectOptionByLabel(webObj, textValue, false)
	}

	def static DeselectOptionByValue(TestObject webObj, String value) {
		WebUI.deselectOptionByValue(webObj,value, false)
	}

	def static SelectAllOption(TestObject webObj) {
		WebUI.selectAllOption(webObj)
	}

	def static SelectOptionByInnerText(TestObject webObj, String textValue) {
		WebUI.selectOptionByLabel(webObj, textValue, false)
	}

	def static SelectOptionByValue(TestObject webObj, String value) {
		WebUI.selectOptionByValue(webObj,value, false)
	}

	def static GetNumberOfSelectedOption(TestObject webObj) {
		return WebUI.getNumberOfSelectedOption(webObj)
	}

	def static GetNumberOfTotalOption(TestObject webObj) {
		WebUI.getNumberOfTotalOption(webObj)
	}

	def static ExecuteJavascript(String javascript, List args) {
		WebUI.executeJavaScript(javascript, args)
	}

	def static SendKeys(TestObject webObj, String keys) {
		return WebUI.sendKeys(webObj, keys)
	}

	def static ScrollToElement(TestObject webObj) {
		WebUI.scrollToElement(webObj, 1)
	}

	/***
	 * @return image file path
	 */
	def static TakeScreenshot() {
		return WebUI.takeScreenshot()
	}

	def static UploadFile(TestObject webObj, String fileAbsolutePath) {
		WebUI.uploadFile(webObj, fileAbsolutePath)
	}

	/***
	 * iFrame
	 */
	def static SwitchToFrame(TestObject webObj) {
		WebUI.switchToFrame(webObj, 1)
	}

	def static SwithToDefaultContent() {
		WebUI.switchToDefaultContent()
	}

	// ######################################################## Selenium ###################################################
	def public static getWebDriver(){
		def WebDriver driver = DriverFactory.getWebDriver()
		// line below solves issue found on katalon v7
		def remoteWebDriver =  ((RemoteWebDriver) (((EventFiringWebDriver) driver).getWrappedDriver()))
		return remoteWebDriver
	}
	
}
