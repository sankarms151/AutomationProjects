package com.basic.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		
		Browser browser = playwright.chromium().launch(
				new BrowserType.LaunchOptions().setHeadless(false)
				.setChannel("chrome")
				);
		
		Page page = browser.newPage();
		page.navigate("https://www.google.com/");
		String title = page.title();
		String url = page.url();
		System.out.println("Page Title: " +title + "Page Url: " +url);
		
		page.close();
		browser.close();
		playwright.close();
		
	}

}
