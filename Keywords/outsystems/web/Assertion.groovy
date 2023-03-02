package outsystems.web

import outsystems.common.accelerators.Logging
import outsystems.web.abstraction.ObjectAbstraction as Abstraction
import outsystems.web.abstraction.WebUIAbstraction

import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable


public class Assertion {

	private static _waitTimeout = 2
	private static _executeTimeout = 1

	@Keyword
	def static VerifyInputValidationMessageByInputOsId(String textToVerify, String inputOsId) {
		def webObj = Abstraction.GetInputValidationMessageByOutSystemsId(inputOsId)
		def passed = WebUIAbstraction.VerifyElementText(webObj, textToVerify)
		if(!passed) {
			def obtained = WebUIAbstraction.GetElementText(webObj)
			Logging.LogFailedAndStop("Failed:\nexpected value: '" + textToVerify + "'\nobtained value: '" + obtained + "'\n")
		}
	}

	@Keyword
	def static VerifyElementTextByOsId(String textToVerify, String osId) {
		def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
		def passed = WebUIAbstraction.VerifyElementText(webObj, textToVerify)
		if(!passed) {
			def obtained = WebUIAbstraction.GetElementText(webObj)
			Logging.LogFailedAndStop("Failed:\nexpected value: '" + textToVerify + "'\nobtained value: '" + obtained + "'\n")
		}
	}

	@Keyword
	def static VerifyElementPresentByOsId(String osId) {
		def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
		def passed = WebUIAbstraction.VerifyElementPresent(webObj, _waitTimeout)
		if(!passed) {
			Logging.LogFailedAndStop("Failed:\nElement with osId = " + osId + " not found on screen within 2 seconds\n")
		}
	}

	private static VerifyElementCheckedByOsId(String osId) {
		def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
		def passed = WebUIAbstraction.VerifyElementChecked(webObj, _executeTimeout)
		if(!passed) {
			Logging.LogFailedAndStop("Failed:\nElement with osId = " + osId + " is not checked. \nExpected checked\n")
		}
	}


	private static VerifyElementUnCheckedByOsId(String osId) {
		def webObj = Abstraction.GetTestObjectByOutSystemsId(osId)
		def passed = WebUIAbstraction.VerifyElementNotChecked(webObj, _executeTimeout)
		if(!passed) {
			Logging.LogFailedAndStop("Failed:\nElement with osId = " + osId + " is checked. \nExpected not checked\n")
		}
	}

	@Keyword
	def static VerifyElementCheckedOrUncheckedByOsId(String osId, Boolean checkedStatus) {
		if(checkedStatus) {
			VerifyElementCheckedByOsId(osId)
		}
		else {
			VerifyElementUnCheckedByOsId(osId)
		}
	}

	@Keyword
	def static VerifyInputValidationMessageVisibleByInputOsId(String inputOsId) {
		def webObj = Abstraction.GetInputValidationMessageByOutSystemsId(inputOsId)
		def passed = WebUIAbstraction.VerifyElementVisible(webObj)
		if(!passed) {
			Logging.LogFailedAndStop("Failed:\nValidation Message for input id " + inputOsId + " not visible\n")
		}
	}

	@Keyword
	def static VerifyTextInTableRowColumnByTableOsId(String tableOsId, int rowNum, int colNum, String textToVerify) {
		def webObj = Abstraction.GetElementTableRowColumnByTableOSId(tableOsId, rowNum, colNum, "")
		def passed = WebUIAbstraction.VerifyElementText(webObj, textToVerify)
		if(!passed) {
			def obtained = WebUIAbstraction.GetElementText(webObj)
			Logging.LogFailedAndStop("Failed:\nexpected value: '" + textToVerify + "'\nobtained value: '" + obtained + "'\n")
		}
	}

	@Keyword
	def static VerifyLinkTextInTableRowColumnByTableOsId(String tableOsId, int rowNum, int colNum, String textToVerify) {
		def webObj = Abstraction.GetElementTableRowColumnByTableOSId(tableOsId, rowNum, colNum, "> a")
		def passed = WebUIAbstraction.VerifyElementText(webObj, textToVerify)
		if(!passed) {
			def obtained = WebUIAbstraction.GetElementText(webObj)
			Logging.LogFailedAndStop("Failed:\nexpected value: '" + textToVerify + "'\nobtained value: '" + obtained + "'\n")
		}
	}

	@Keyword
	def static VerifyCustomHtmlPathTextInTableRowColumnByTableOsId(String tableOsId, int rowNum, int colNum, String textToVerify, String htmlPath) {
		def webObj = Abstraction.GetElementTableRowColumnByTableOSId(tableOsId, rowNum, colNum, htmlPath)
		def passed = WebUIAbstraction.VerifyElementText(webObj, textToVerify)
		if(!passed) {
			def obtained = WebUIAbstraction.GetElementText(webObj)
			Logging.LogFailedAndStop("Failed:\nexpected value: '" + textToVerify + "'\nobtained value: '" + obtained + "'\n")
		}
	}

	@Keyword
	def static VerifySelectedOptionTextInTableRowColumnByTableOsId(String tableOsId, int rowNum, int colNum, String textToVerify) {
		def webObj = Abstraction.GetElementTableRowColumnByTableOSId(tableOsId, rowNum, colNum, "select")
		def passed = WebUIAbstraction.VerifyElementText(webObj, textToVerify)
		if(!passed) {
			def obtained = WebUIAbstraction.GetElementText(webObj)
			Logging.LogFailedAndStop("Failed:\nexpected value: '" + textToVerify + "'\nobtained value: '" + obtained + "'\n")
		}
	}

	@Keyword
	def static VerifyCustomHtmlPathValueInTableRowColumnByTableOsId(String tableOsId, int rowNum, int colNum, String textToVerify, String htmlPath) {
		def webObj = Abstraction.GetElementTableRowColumnByTableOSId(tableOsId, rowNum, colNum, htmlPath)
		def passed = WebUIAbstraction.VerifyElementValue(webObj, textToVerify)
		if(!passed) {
			def obtained = WebUIAbstraction.GetValue(webObj)
			Logging.LogFailedAndStop("Failed:\nexpected value: '" + textToVerify + "'\nobtained value: '" + obtained + "'\n")
		}
	}
}
