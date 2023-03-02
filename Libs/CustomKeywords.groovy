
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.lang.Boolean

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.RectangleSize



def static "outsystems.common.accelerators.Logging.LogInfo"(
    	String text	) {
    (new outsystems.common.accelerators.Logging()).LogInfo(
        	text)
}


def static "outsystems.common.accelerators.Logging.LogPassed"(
    	String text	) {
    (new outsystems.common.accelerators.Logging()).LogPassed(
        	text)
}


def static "outsystems.common.accelerators.Logging.LogWarning"(
    	String text	) {
    (new outsystems.common.accelerators.Logging()).LogWarning(
        	text)
}


def static "outsystems.common.accelerators.Logging.LogError"(
    	String text	) {
    (new outsystems.common.accelerators.Logging()).LogError(
        	text)
}


def static "outsystems.common.accelerators.Logging.LogErrorAndStop"(
    	String text	) {
    (new outsystems.common.accelerators.Logging()).LogErrorAndStop(
        	text)
}


def static "outsystems.common.accelerators.Logging.LogFailed"(
    	String text	) {
    (new outsystems.common.accelerators.Logging()).LogFailed(
        	text)
}


def static "outsystems.common.accelerators.Logging.LogFailedAndStop"(
    	String text	) {
    (new outsystems.common.accelerators.Logging()).LogFailedAndStop(
        	text)
}


def static "outsystems.common.accelerators.API.GetJsonObjectMap"(
    	String jsonString	) {
    (new outsystems.common.accelerators.API()).GetJsonObjectMap(
        	jsonString)
}


def static "outsystems.common.accelerators.API.UrlEncode"(
    	String toEncode	) {
    (new outsystems.common.accelerators.API()).UrlEncode(
        	toEncode)
}


def static "outsystems.web.Behavior.ExecuteSimpleSearchPattern"(
    	String searchInputOsId	
     , 	String searchButtonOsId	
     , 	String textToSearch	
     , 	int waitTime	) {
    (new outsystems.web.Behavior()).ExecuteSimpleSearchPattern(
        	searchInputOsId
         , 	searchButtonOsId
         , 	textToSearch
         , 	waitTime)
}


def static "outsystems.web.Behavior.ExecuteSimpleLoginPattern"(
    	String usernameInputOsId	
     , 	String username	
     , 	String passwordInputOsId	
     , 	String password	
     , 	String loginBtnOsId	
     , 	int waitTime	) {
    (new outsystems.web.Behavior()).ExecuteSimpleLoginPattern(
        	usernameInputOsId
         , 	username
         , 	passwordInputOsId
         , 	password
         , 	loginBtnOsId
         , 	waitTime)
}


def static "outsystems.web.Assertion.VerifyInputValidationMessageByInputOsId"(
    	String textToVerify	
     , 	String inputOsId	) {
    (new outsystems.web.Assertion()).VerifyInputValidationMessageByInputOsId(
        	textToVerify
         , 	inputOsId)
}


def static "outsystems.web.Assertion.VerifyElementTextByOsId"(
    	String textToVerify	
     , 	String osId	) {
    (new outsystems.web.Assertion()).VerifyElementTextByOsId(
        	textToVerify
         , 	osId)
}


def static "outsystems.web.Assertion.VerifyElementPresentByOsId"(
    	String osId	) {
    (new outsystems.web.Assertion()).VerifyElementPresentByOsId(
        	osId)
}


def static "outsystems.web.Assertion.VerifyElementCheckedOrUncheckedByOsId"(
    	String osId	
     , 	Boolean checkedStatus	) {
    (new outsystems.web.Assertion()).VerifyElementCheckedOrUncheckedByOsId(
        	osId
         , 	checkedStatus)
}


def static "outsystems.web.Assertion.VerifyInputValidationMessageVisibleByInputOsId"(
    	String inputOsId	) {
    (new outsystems.web.Assertion()).VerifyInputValidationMessageVisibleByInputOsId(
        	inputOsId)
}


def static "outsystems.web.Assertion.VerifyTextInTableRowColumnByTableOsId"(
    	String tableOsId	
     , 	int rowNum	
     , 	int colNum	
     , 	String textToVerify	) {
    (new outsystems.web.Assertion()).VerifyTextInTableRowColumnByTableOsId(
        	tableOsId
         , 	rowNum
         , 	colNum
         , 	textToVerify)
}


def static "outsystems.web.Assertion.VerifyLinkTextInTableRowColumnByTableOsId"(
    	String tableOsId	
     , 	int rowNum	
     , 	int colNum	
     , 	String textToVerify	) {
    (new outsystems.web.Assertion()).VerifyLinkTextInTableRowColumnByTableOsId(
        	tableOsId
         , 	rowNum
         , 	colNum
         , 	textToVerify)
}


def static "outsystems.web.Assertion.VerifyCustomHtmlPathTextInTableRowColumnByTableOsId"(
    	String tableOsId	
     , 	int rowNum	
     , 	int colNum	
     , 	String textToVerify	
     , 	String htmlPath	) {
    (new outsystems.web.Assertion()).VerifyCustomHtmlPathTextInTableRowColumnByTableOsId(
        	tableOsId
         , 	rowNum
         , 	colNum
         , 	textToVerify
         , 	htmlPath)
}


def static "outsystems.web.Assertion.VerifySelectedOptionTextInTableRowColumnByTableOsId"(
    	String tableOsId	
     , 	int rowNum	
     , 	int colNum	
     , 	String textToVerify	) {
    (new outsystems.web.Assertion()).VerifySelectedOptionTextInTableRowColumnByTableOsId(
        	tableOsId
         , 	rowNum
         , 	colNum
         , 	textToVerify)
}


def static "outsystems.web.Assertion.VerifyCustomHtmlPathValueInTableRowColumnByTableOsId"(
    	String tableOsId	
     , 	int rowNum	
     , 	int colNum	
     , 	String textToVerify	
     , 	String htmlPath	) {
    (new outsystems.web.Assertion()).VerifyCustomHtmlPathValueInTableRowColumnByTableOsId(
        	tableOsId
         , 	rowNum
         , 	colNum
         , 	textToVerify
         , 	htmlPath)
}


def static "outsystems.applitools.abstraction.eyesKeywords.initAppliToolsSDK"(
    	String appliToolsAPIKey	) {
    (new outsystems.applitools.abstraction.eyesKeywords()).initAppliToolsSDK(
        	appliToolsAPIKey)
}


def static "outsystems.applitools.abstraction.eyesKeywords.initDefaultAppliToolsSDK"() {
    (new outsystems.applitools.abstraction.eyesKeywords()).initDefaultAppliToolsSDK()
}


def static "outsystems.applitools.abstraction.eyesKeywords.startTest"(
    	Eyes appliToolsRunner	
     , 	String appName	
     , 	String testName	
     , 	int resolutionWidth	
     , 	int resolutionHeight	
     , 	String url	) {
    (new outsystems.applitools.abstraction.eyesKeywords()).startTest(
        	appliToolsRunner
         , 	appName
         , 	testName
         , 	resolutionWidth
         , 	resolutionHeight
         , 	url)
}


def static "outsystems.applitools.abstraction.eyesKeywords.checkWindow"(
    	Eyes appliToolsRunner	
     , 	String testStepName	
     , 	Boolean fullPage	) {
    (new outsystems.applitools.abstraction.eyesKeywords()).checkWindow(
        	appliToolsRunner
         , 	testStepName
         , 	fullPage)
}


def static "outsystems.applitools.abstraction.eyesKeywords.endTest"(
    	Eyes appliToolsRunner	) {
    (new outsystems.applitools.abstraction.eyesKeywords()).endTest(
        	appliToolsRunner)
}


def static "outsystems.web.Interaction.ClickObjectByOSId"(
    	String osId	) {
    (new outsystems.web.Interaction()).ClickObjectByOSId(
        	osId)
}


def static "outsystems.web.Interaction.ClickObjectCustomProperty"(
    	String propName	
     , 	String propValue	) {
    (new outsystems.web.Interaction()).ClickObjectCustomProperty(
        	propName
         , 	propValue)
}


def static "outsystems.web.Interaction.ClickLinkByInnerText"(
    	String innerText	) {
    (new outsystems.web.Interaction()).ClickLinkByInnerText(
        	innerText)
}


def static "outsystems.web.Interaction.DoubleClickObjectByOSId"(
    	String osId	) {
    (new outsystems.web.Interaction()).DoubleClickObjectByOSId(
        	osId)
}


def static "outsystems.web.Interaction.SetTextByOSId"(
    	String osId	
     , 	String text	) {
    (new outsystems.web.Interaction()).SetTextByOSId(
        	osId
         , 	text)
}


def static "outsystems.web.Interaction.SetTextByCustomProperty"(
    	String propName	
     , 	String propValue	
     , 	String text	) {
    (new outsystems.web.Interaction()).SetTextByCustomProperty(
        	propName
         , 	propValue
         , 	text)
}


def static "outsystems.web.Interaction.SetCheckboxValueByOSId"(
    	String osId	
     , 	Boolean value	) {
    (new outsystems.web.Interaction()).SetCheckboxValueByOSId(
        	osId
         , 	value)
}


def static "outsystems.web.Interaction.SetValueAutoCompleteInputByOsId"(
    	String osId	
     , 	String text	) {
    (new outsystems.web.Interaction()).SetValueAutoCompleteInputByOsId(
        	osId
         , 	text)
}


def static "outsystems.web.Interaction.ClickLinkInTableRowColumnByTableOsId"(
    	String tableOsId	
     , 	int rowNum	
     , 	int colNum	) {
    (new outsystems.web.Interaction()).ClickLinkInTableRowColumnByTableOsId(
        	tableOsId
         , 	rowNum
         , 	colNum)
}


def static "outsystems.web.Interaction.GetTextFromTableRowColumnByTableOsId"(
    	String tableOsId	
     , 	int rowNum	
     , 	int colNum	) {
    (new outsystems.web.Interaction()).GetTextFromTableRowColumnByTableOsId(
        	tableOsId
         , 	rowNum
         , 	colNum)
}


def static "outsystems.web.Interaction.SetTextInputInTableRowColumnByTableOsId"(
    	String tableOsId	
     , 	int rowNum	
     , 	int colNum	
     , 	String text	) {
    (new outsystems.web.Interaction()).SetTextInputInTableRowColumnByTableOsId(
        	tableOsId
         , 	rowNum
         , 	colNum
         , 	text)
}


def static "outsystems.web.Interaction.SetSelectOptionByInnerTextByOsId"(
    	String osId	
     , 	String text	) {
    (new outsystems.web.Interaction()).SetSelectOptionByInnerTextByOsId(
        	osId
         , 	text)
}


def static "outsystems.web.Interaction.SwitchToIframe"(
    	String partialSrc	) {
    (new outsystems.web.Interaction()).SwitchToIframe(
        	partialSrc)
}


def static "outsystems.web.Interaction.SwitchToDefaultContent"() {
    (new outsystems.web.Interaction()).SwitchToDefaultContent()
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetTestObjectByHtmlElementAndOutSystemsId"(
    	String osId	
     , 	String htmlElem	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetTestObjectByHtmlElementAndOutSystemsId(
        	osId
         , 	htmlElem)
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetTestObjectByHtmlElementAndOutSystemsIdWithAnchoring"(
    	String anchorId	
     , 	String osId	
     , 	String htmlElem	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetTestObjectByHtmlElementAndOutSystemsIdWithAnchoring(
        	anchorId
         , 	osId
         , 	htmlElem)
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetTestObjectByHtmlElementAndInnerText"(
    	String innerText	
     , 	String htmlElem	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetTestObjectByHtmlElementAndInnerText(
        	innerText
         , 	htmlElem)
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetElementValidationMessageByHtmlElementAndOutSystemsId"(
    	String elementOsId	
     , 	String htmlElem	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetElementValidationMessageByHtmlElementAndOutSystemsId(
        	elementOsId
         , 	htmlElem)
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetTestObjectByHtmlElementAndCustomProperty"(
    	String propName	
     , 	String propValue	
     , 	String htmlElem	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetTestObjectByHtmlElementAndCustomProperty(
        	propName
         , 	propValue
         , 	htmlElem)
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetElementValidationMessageByHtmlElementAndCustomProperty"(
    	String propName	
     , 	String propValue	
     , 	String htmlElem	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetElementValidationMessageByHtmlElementAndCustomProperty(
        	propName
         , 	propValue
         , 	htmlElem)
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetElementTableRowColumnByTableOSId"(
    	String osId	
     , 	int rowNum	
     , 	int colNum	
     , 	String htmlElem	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetElementTableRowColumnByTableOSId(
        	osId
         , 	rowNum
         , 	colNum
         , 	htmlElem)
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetElementTableRowColumnByTableOSIdWithAnchoring"(
    	String anchorId	
     , 	String osId	
     , 	int rowNum	
     , 	int colNum	
     , 	String htmlElem	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetElementTableRowColumnByTableOSIdWithAnchoring(
        	anchorId
         , 	osId
         , 	rowNum
         , 	colNum
         , 	htmlElem)
}


def static "outsystems.web.abstraction.ObjectAbstraction.GetIframeByPartialSrc"(
    	String partialSrc	) {
    (new outsystems.web.abstraction.ObjectAbstraction()).GetIframeByPartialSrc(
        	partialSrc)
}


def static "outsystems.common.accelerators.Json.GetJsonObjectMap"(
    	String jsonString	) {
    (new outsystems.common.accelerators.Json()).GetJsonObjectMap(
        	jsonString)
}


def static "outsystems.common.accelerators.Browser.OpenUrl"(
    	String url	) {
    (new outsystems.common.accelerators.Browser()).OpenUrl(
        	url)
}


def static "outsystems.common.accelerators.Browser.CloseBrowser"() {
    (new outsystems.common.accelerators.Browser()).CloseBrowser()
}


def static "outsystems.common.accelerators.Browser.refreshBrowser"() {
    (new outsystems.common.accelerators.Browser()).refreshBrowser()
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}
