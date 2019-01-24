package com.sonia.ali.MercuryProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FourthPage {
		@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
		private WebElement userName1;
		@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
		private WebElement password1;
		@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input\r\n")
		private WebElement submit1;
		
		
		public void searchFor() {
			userName1.sendKeys("BlobbyFudge");
			password1.sendKeys("whatnow");
			submit1.click();
			
		}
}


