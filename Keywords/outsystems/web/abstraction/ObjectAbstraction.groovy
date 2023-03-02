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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class ObjectAbstraction {

	private static _anyHTMLElement = "*"

	@Keyword
	def static GetTestObjectByHtmlElementAndOutSystemsId(String osId, String htmlElem) {
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.CSS)
		webObj.setSelectorValue(SelectorMethod.CSS, htmlElem + '[Id$=' + osId + ']')
		return webObj
	}

	@Keyword
	def static GetTestObjectByHtmlElementAndOutSystemsIdWithAnchoring(String anchorId, String osId, String htmlElem) {
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.CSS)
		webObj.setSelectorValue(SelectorMethod.CSS, '*[Id$=' + anchorId + '] ' + htmlElem + '[Id$=' + osId + ']')
		return webObj
	}

	@Keyword
	def static GetTestObjectByHtmlElementAndInnerText(String innerText, String htmlElem) {
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.XPATH)
		webObj.setSelectorValue(SelectorMethod.XPATH, '//' + htmlElem + '[text() = "' + innerText + '"]')
		return webObj
	}

	@Keyword
	def static GetElementValidationMessageByHtmlElementAndOutSystemsId(String elementOsId, String htmlElem) {
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.CSS)
		webObj.setSelectorValue(SelectorMethod.CSS, htmlElem + '[Id$=' + elementOsId + '] ~*.ValidationMessage')
		return webObj
	}

	@Keyword
	def static GetTestObjectByHtmlElementAndCustomProperty(String propName, String propValue, String htmlElem) {
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.CSS)
		webObj.setSelectorValue(SelectorMethod.CSS, htmlElem + '[' + propName+ '=' + propValue + ']')
		return webObj
	}

	@Keyword
	def static GetElementValidationMessageByHtmlElementAndCustomProperty(String propName, String propValue, String htmlElem) {
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.CSS)
		webObj.setSelectorValue(SelectorMethod.CSS, htmlElem + '[' + propName+ '=' + propValue + '] ~*.ValidationMessage')
		return webObj
	}

	@Keyword
	def static GetElementTableRowColumnByTableOSId(String osId, int rowNum, int colNum, String htmlElem) {
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.CSS)
		webObj.setSelectorValue(SelectorMethod.CSS, 'table[id$=' + osId +'] tbody tr:nth-child(' + rowNum + ') td:nth-child(' + colNum + ') ' + htmlElem)
		return webObj
	}

	@Keyword
	def static GetElementTableRowColumnByTableOSIdWithAnchoring(String anchorId, String osId, int rowNum, int colNum, String htmlElem) {
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.CSS)
		webObj.setSelectorValue(SelectorMethod.CSS, '*[Id=' + anchorId + '] table[id$=' + osId +'] tbody tr:nth-child(' + rowNum + ') td:nth-child(' + colNum + ') ' + htmlElem)
		return webObj
	}

	@Keyword
	def static GetIframeByPartialSrc(String partialSrc) {
		//iframe[src*='/Login_UI/My_Info']
		TestObject webObj = new TestObject("outsystems.web.abstraction.ObjectAbstraction")
		webObj.setSelectorMethod(SelectorMethod.CSS)
		webObj.setSelectorValue(SelectorMethod.CSS, 'iframe[src*="' + partialSrc + '"]')
		return webObj
	}

	// Any Element with OutSystems Id (Name property)
	def static GetTestObjectByOutSystemsId(String osId) {
		TestObject webObj = GetTestObjectByHtmlElementAndOutSystemsId(osId, _anyHTMLElement)
		return webObj
	}

	def static GetTestObjectByInnerText(String innerText) {
		TestObject webObj = GetTestObjectByHtmlElementAndInnerText(innerText, _anyHTMLElement)
		return webObj
	}

	def static GetElementValidationMessageByOutSystemsId(String elementOsId) {
		TestObject webObj = GetElementValidationMessageByHtmlElementAndOutSystemsId(elementOsId, _anyHTMLElement)
		return webObj
	}

	// Any Element with Custom Property (Extended OutSystems property)
	def static GetTestObjectByCustomProperty(String propName, String propValue) {
		TestObject webObj = GetTestObjectByHtmlElementAndCustomProperty(propName, propValue, _anyHTMLElement)
		return webObj
	}

	def static GetElementValidationMessageByCustomProperty(String propName, String propValue) {
		TestObject webObj = GetElementValidationMessageByHtmlElementAndCustomProperty(propName, propValue, _anyHTMLElement)
		return webObj
	}

	// Specific html elements
	def static GetInputByOutSystemsId(String osId) {
		TestObject webObj = GetTestObjectByHtmlElementAndOutSystemsId(osId, "input")
		return webObj
	}

	def static GetInputValidationMessageByOutSystemsId(String inputOsId) {
		TestObject webObj = GetElementValidationMessageByHtmlElementAndOutSystemsId(inputOsId, "input")
		return webObj
	}

	def static GetAnchorByOutSystemsId(String osId) {
		TestObject webObj = GetTestObjectByHtmlElementAndOutSystemsId(osId, "a")
		return webObj
	}

	def static GetAnchorByInnerText(String innerText) {
		TestObject webObj = GetTestObjectByHtmlElementAndInnerText(innerText, "a")
		return webObj
	}

	def static GetSelectByOutSystemsId(String osId)
	{
		TestObject webObj = GetTestObjectByHtmlElementAndOutSystemsId(osId, "select")
		return webObj
	}

	def static GetTextAreaByOutSystemsId(String osId)
	{
		TestObject webObj = GetTestObjectByHtmlElementAndOutSystemsId(osId, "textarea")
		return webObj
	}

	def static GetInputWithValue(String value)
	{
		TestObject webObj = this.GetTestObjectByHtmlElementAndCustomProperty("value", value, "input")
		return webObj
	}

}
