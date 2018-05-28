package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class LinkedloginPO extends BasePage {
	 public LinkedloginPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		 
		 @FindBy(xpath="//input[@name='session_key']")
			private WebElement unTxtBx;
			public WebElement unTxtBx() {
				return unTxtBx;
			}
			@FindBy(xpath="//input[@name='session_password']")
			private WebElement pwdTxtBx;
			public WebElement pwdTxtBx() {
				return pwdTxtBx;
			}
			@FindBy(xpath="//input[@class='login submit-button']")
			private WebElement loginBtn;
			public WebElement loginBtn() {
				return loginBtn;
			}
			
			@FindBy(xpath="(//span[@class='error'])[1]")
			private WebElement errorMsg;
			public WebElement errorMsg() {
				return errorMsg;
			
}
		
}
