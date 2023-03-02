package outsystems.web

import outsystems.web.abstraction.ObjectAbstraction
import outsystems.web.abstraction.WebUIAbstraction
import outsystems.common.accelerators.Logging
import outsystems.web.Interaction
import outsystems.web.Assertion

import com.kms.katalon.core.annotation.Keyword


import internal.GlobalVariable

public class Behavior {

	@Keyword
	def static ExecuteSimpleSearchPattern(String searchInputOsId, String searchButtonOsId, String textToSearch, int waitTime) {
		Interaction.SetTextByOSId(searchInputOsId, textToSearch)
		Interaction.ClickObjectByOSId(searchButtonOsId)
		WebUIAbstraction.Delay(waitTime)
	}

	@Keyword
	def static ExecuteSimpleLoginPattern(String usernameInputOsId, String username, String passwordInputOsId, String password, String loginBtnOsId, int waitTime) {
		Interaction.SetTextByOSId(usernameInputOsId, username)
		Interaction.SetTextByOSId(passwordInputOsId, password)
		Interaction.ClickObjectByOSId(loginBtnOsId)
		WebUIAbstraction.Delay(waitTime)
	}
}
