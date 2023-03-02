package outsystems.applitools.abstraction


import com.kms.katalon.core.annotation.Keyword

import org.openqa.selenium.WebDriver


import outsystems.web.abstraction.WebUIAbstraction as Abstraction

import com.applitools.eyes.*
import com.applitools.eyes.selenium.ClassicRunner
import com.applitools.eyes.selenium.Eyes


import internal.GlobalVariable




public class eyesKeywords {

	private static _appliTools_API_Key = "YUGMsoU1047nD8yq1110Y1W101h95S9MAkxhx8er101wkquN107qg110"

	@Keyword
	def static Eyes initAppliToolsSDK(String appliToolsAPIKey){
		// Initialize the Runner for your test.
		EyesRunner runner = new ClassicRunner()
		// Initialize the eyes SDK
		Eyes eyes = new Eyes(runner)
		// Change the APPLITOOLS_API_KEY API key with yours
		eyes.setApiKey(appliToolsAPIKey)
		return eyes
	}

	@Keyword
	def static Eyes initDefaultAppliToolsSDK(){
		return initAppliToolsSDK(_appliTools_API_Key)
	}

	@Keyword
	def static startTest(Eyes appliToolsRunner, String appName, String testName, int resolutionWidth, int resolutionHeight, String url) {
		def WebDriver driver = Abstraction.getWebDriver()
		// Set SUT's name, test name and viewport size (width X height)
		// set it to resolutionWidth x resolutionHeight to accommodate various screens.
		appliToolsRunner.open(driver, appName, testName, new RectangleSize(resolutionWidth, resolutionHeight))
		// Navigate the browser to the "ACME" demo app.
		driver.get(url);
	}

	@Keyword
	def static checkWindow(Eyes appliToolsRunner, String testStepName, Boolean fullPage) {
		appliToolsRunner.checkWindow(testStepName, fullPage)
	}

	@Keyword
	def static endTest(Eyes appliToolsRunner) {
		//def WebDriver driver = Abstraction.getWebDriver()
		// End the test.
		appliToolsRunner.closeAsync();
		// Close the browser.
		//driver.quit();
		// If the test was aborted before eyes.close was called, ends the test as
		// aborted.
		appliToolsRunner.abortIfNotClosed();
	}
}
