package com.sonia.ali.MercuryProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage {
	@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")
	private WebElement signin;
	
	public void searchFor() {
		signin.click();
		
	}
}
