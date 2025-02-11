package com.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtils {

	// to handles drop downs
	
	public void selectText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
}
