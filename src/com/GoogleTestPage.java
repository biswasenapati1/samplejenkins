package com;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class GoogleTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "search.box")
	private QAFWebElement searchBox;
	@FindBy(locator = "search.key")
	private QAFWebElement searchKey;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getSearchBox() {
		return searchBox;
	}

	public QAFWebElement getSearchKey() {
		return searchKey;
	}

}
