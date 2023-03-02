package outsystems.web

import outsystems.web.abstraction.ObjectAbstraction as Abstraction
import outsystems.web.abstraction.WebUIAbstraction
import outsystems.web.Assertion
import outsystems.common.accelerators.Logging

import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable


public class Interaction {

	def private static _logErrorAndStop(String errorMsg) {
		Logging.LogErrorAndStop(errorMsg)
	}

	@Keyword
	def static ClickObjectByOSId(String osId) {
		try {
			def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
			WebUIAbstraction.Click(webObj)
		} catch (e) {
			_logErrorAndStop("Unable to click object with OS Id = " + osId)
		}
	}

	@Keyword
	def static ClickObjectCustomProperty(String propName, String propValue) {
		try {
			def webObj = Abstraction.GetTestObjectByHtmlElementAndCustomProperty(propName, propValue, "*")
			WebUIAbstraction.Click(webObj)
		} catch (e) {
			_logErrorAndStop("Unable to click object with custom property name = " + propName + " and value = " + propValue)
		}
	}

	@Keyword
	def static ClickLinkByInnerText(String innerText) {
		try {
			def webObj = Abstraction.GetAnchorByInnerText(innerText)
			WebUIAbstraction.Click(webObj)
		} catch (e) {
			_logErrorAndStop("Unable to click link with inner text = " + innerText)
		}
	}

	@Keyword
	def static DoubleClickObjectByOSId(String osId) {
		try {
			def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
			WebUIAbstraction.DoubleClick(webObj)
		} catch (e) {
			_logErrorAndStop("Unable to double click object with OS Id = " + osId)
		}
	}

	@Keyword
	def static SetTextByOSId(String osId, String text) {
		try {
			def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
			WebUIAbstraction.SetText(webObj, text)
		} catch (e) {
			_logErrorAndStop("Unable to set text to object with OS Id = " + osId)
		}
	}

	@Keyword
	def static SetTextByCustomProperty(String propName, String propValue, String text) {
		try {
			def webObj = Abstraction.GetTestObjectByHtmlElementAndCustomProperty(propName, propValue, "*")
			WebUIAbstraction.SetText(webObj, text)
		} catch (e) {
			_logErrorAndStop("Unable to set text in object with custom property name = " + propName + " and value = " + propValue)
		}
	}

	@Keyword
	def static SetCheckboxValueByOSId(String osId, Boolean value) {
		try {
			def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
			if(value) {
				WebUIAbstraction.Check(webObj)
			}
			else {
				WebUIAbstraction.Uncheck(webObj)
			}
		} catch (e) {
			_logErrorAndStop("Unable to set check box value for OS Id = " + osId)
		}
	}

	@Keyword
	def static SetValueAutoCompleteInputByOsId(String osId, String text) {
		try {
			def webObj = Abstraction.GetInputByOutSystemsId(osId)
			WebUIAbstraction.Focus(webObj)
			WebUIAbstraction.DoubleClick(webObj)
			WebUIAbstraction.Delay(1)
			WebUIAbstraction.SetText(webObj, text)
			WebUIAbstraction.Delay(1)
		} catch (e) {
			_logErrorAndStop("Unable to Set value into autocomplete for OS Id = " + osId)
		}
	}

	@Keyword
	def static ClickLinkInTableRowColumnByTableOsId(String tableOsId, int rowNum, int colNum) {
		try {
			def webObj = Abstraction.GetElementTableRowColumnByTableOSId(tableOsId, rowNum, colNum, "a")
			WebUIAbstraction.Click(webObj)
		} catch (e) {
			_logErrorAndStop("Unable to click link in table OS Id = " + tableOsId + ", row num " + rowNum + ", col num "+ colNum)
		}
	}

	@Keyword
	def static GetTextFromTableRowColumnByTableOsId(String tableOsId, int rowNum, int colNum) {
		try {
			def webObj = Abstraction.GetElementTableRowColumnByTableOSId(tableOsId, rowNum, colNum, "")
			WebUIAbstraction.GetElementText(webObj)
		} catch (e) {
			_logErrorAndStop("Unable to get text from table OS Id = " + tableOsId + ", row num " + rowNum + ", col num "+ colNum)
		}
	}

	@Keyword
	def static SetTextInputInTableRowColumnByTableOsId(String tableOsId, int rowNum, int colNum, String text) {
		try {
			def webObj = Abstraction.GetElementTableRowColumnByTableOSId(tableOsId, rowNum, colNum, "input")
			WebUIAbstraction.SetText(webObj, text)
		} catch (e) {
			_logErrorAndStop("Unable to set text in input at table OS Id = " + tableOsId + ", row num " + rowNum + ", col num "+ colNum)
		}
	}

	@Keyword
	def static SetSelectOptionByInnerTextByOsId(String osId, String text) {
		try {
			def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
			WebUIAbstraction.Focus(webObj)
			WebUIAbstraction.Click(webObj)
			WebUIAbstraction.SelectOptionByInnerText(webObj, text)
		} catch (e) {
			_logErrorAndStop("Unable to Set option for select with OS Id = " + osId + ".\nNo option with inner text '" + text + "' was found.")
		}
	}


	@Keyword
	def static SwitchToIframe(String partialSrc) {
		try{
			def webObj = Abstraction.GetIframeByPartialSrc(partialSrc)
			WebUIAbstraction.SwitchToFrame(webObj)
		}
		catch(e) {
			_logErrorAndStop("Unable to switch to iframe with partial src = " + partialSrc + ".")
		}
	}

	@Keyword
	def static SwitchToDefaultContent() {
		try{
			WebUIAbstraction.SwithToDefaultContent()
			WebUIAbstraction.Delay(1)
		}
		catch(e) {
			_logErrorAndStop("Unable to switch back to default content.")
		}
	}
}
