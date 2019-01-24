package com.sonia.ali.MercuryProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
		
		@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
		private WebElement registerLink;
		
	
		public void searchFor() {
			registerLink.click();
			
		}
}

