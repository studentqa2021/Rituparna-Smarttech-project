package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {
	public static void getColor(WebElement element,WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'",element );
	}

}
