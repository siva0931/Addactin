package org.pojo;

import org.libglobal.Libglob;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Libglob{
	
	public Pojoclass() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement loginbtn;

	public WebElement togetUsername() {
		return username;
	}

	public WebElement togetPassword() {
		return password;
	}

	public WebElement togetLoginbtn() {
		return loginbtn;
	}
	
	

}
