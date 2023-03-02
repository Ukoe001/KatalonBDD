package outsystems.common.accelerators

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
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class Logging {
	@Keyword
	def static LogInfo(String text) {
		KeywordUtil.logInfo(text)
	}

	@Keyword
	def static LogPassed(String text) {
		KeywordUtil.markPassed(text)
	}

	@Keyword
	def static LogWarning(String text) {
		KeywordUtil.markWarning(text)
	}

	@Keyword
	def static LogError(String text) {
		KeywordUtil.markError(text)
	}

	@Keyword
	def static LogErrorAndStop(String text) {
		KeywordUtil.markErrorAndStop(text)
	}

	@Keyword
	def static LogFailed(String text) {
		KeywordUtil.markFailed(text)
	}

	@Keyword
	def static LogFailedAndStop(String text) {
		KeywordUtil.markFailedAndStop(text)
	}
}
