package com.sonia.ali.MercuryProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {
	@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	private WebElement firstName;
	@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")
	private WebElement lastName;
	@FindBy(xpath =	"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")
	private WebElement phone;
	@FindBy(id = "userName")
	private WebElement email;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")
	private WebElement addressLine1;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")
	private WebElement addressLine2;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input\r\n")
	private WebElement city;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input\r\n")
	private WebElement state;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input")
	private WebElement postcode;
	@FindBy(id = "email")
	private WebElement userName;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
	private WebElement password;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")
	private WebElement confirmPassword;
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")
	private WebElement submit;
	
	public void searchFor() {
		firstName.sendKeys("Blobby");
		lastName.sendKeys("FudgeCake");
		phone.sendKeys("485431");
		email.sendKeys("blobbyf@gmail.com");
		addressLine1.sendKeys("17 LazyTown");
		addressLine2.sendKeys("GodKnows");
		city.sendKeys("Tallahassee");
		state.sendKeys("Florida");
		postcode.sendKeys("32044");
		userName.sendKeys("BlobbyFudge");
		password.sendKeys("whatnow");
		confirmPassword.sendKeys("whatnow");
		submit.click();
		
	}
}
