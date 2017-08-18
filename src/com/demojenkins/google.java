package com.demojenkins;

import org.testng.annotations.Test;

import com.GoogleTestPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class google extends GoogleTestPage {
	

	@QAFTestStep(description = "user open google search engine")
	public void Searchmyproduct() {
		
		driver.get("www.google.com");
		waitForPageToLoad();
		
	}

	
	@QAFTestStep(description="search for any product")
	public void search_for_any_product(){
		System.out.println(getSearchBox().isPresent());
		getSearchBox().click();
		getSearchBox().sendKeys("Royal enfield");
		getSearchKey().click();
		Reporter.logWithScreenShot("input product name sucessfully");
		waitForPageToLoad();
	}

	
	@QAFTestStep(description="veryfy product page is opening")
	public void veryfy_product_page_is_opening(){
		
		Reporter.logWithScreenShot("product page is opening");
	}

}
