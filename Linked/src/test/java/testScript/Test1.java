package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BasePage;
import library.BaseTest;

import pom.LinkedloginPO;

public class Test1 extends BaseTest {
	@Test (groups= {"Smoke","regression"},priority=1)
	public void ValidLoginLogout() {
		try {
		driver.get("https://www.linkedin.com/");
		LinkedloginPO po=new LinkedloginPO(driver);
		po.unTxtBx().sendKeys("banty.kumar862@gmail.com");
		po.pwdTxtBx().sendKeys("9835406398");
		po.loginBtn().click();
		BasePage page=new BasePage(driver);
		System.out.println();
		
	}
		catch (Exception e) {
		Reporter.log("Test Fail",true);
		Assert.fail();
	
		}
	}
	




public class Test2 extends BaseTest {
@Test (groups= {"regression"},priority=2)
public void testValidUnInvalidPw() {
	try {
	driver.get("https://www.linkedin.com/");
	LinkedloginPO po=new LinkedloginPO(driver);
	po.unTxtBx().sendKeys("banty.kumar862");
	po.pwdTxtBx().sendKeys("eWuVyRE21");
	po.loginBtn().click();
	BasePage page=new BasePage(driver);
	page.VerifyWebElement(po.errorMsg());
	Assert.assertEquals(po.errorMsg().isDisplayed(), true);
	}
	catch (Exception e) {
		Reporter.log("Test Fail",true);
		Assert.fail();
	}
}
}
public class Test3 extends BaseTest {
		@Test (groups= {"regression"},priority=3)
		public void testInValidUnvalidPw() {
			try {
			driver.get("https://www.linkedin.com/");
			LinkedloginPO po=new LinkedloginPO(driver);
			po.unTxtBx().sendKeys("banty.kumar862");
			po.pwdTxtBx().sendKeys("eWuVyRE21");
			po.loginBtn().click();
			BasePage page=new BasePage(driver);
			page.VerifyWebElement(po.errorMsg());
			Assert.assertEquals(po.errorMsg().isDisplayed(), true);
			}
			catch (Exception e) {
				Reporter.log("Test Fail",true);
				Assert.fail();
					}
		}
}
public class Test4 extends BaseTest {
	@Test (groups= {"regression"},priority=4)
	public void testValidUnInvalidPw() {
		try {
		driver.get("https://www.linkedin.com/");
		LinkedloginPO po=new LinkedloginPO(driver);
		po.unTxtBx().sendKeys("banty.kumar862");
		po.pwdTxtBx().sendKeys("eWuVyRE21");
		po.loginBtn().click();
		BasePage page=new BasePage(driver);
		page.VerifyWebElement(po.errorMsg());
		Assert.assertEquals(po.errorMsg().isDisplayed(), true);
		}
	
		catch (Exception e) {
			Reporter.log("Test Fail",true);
			Assert.fail();
		}
	}
}

public class Test5 extends BaseTest {
	@Test (groups= {"regression"},priority=5)
	public void testInValidUnInvalidPw() {
		try {
		driver.get("https://www.linkedin.com/");
		LinkedloginPO po=new LinkedloginPO(driver);
		po.unTxtBx().sendKeys("banty.kumar8621");
		po.pwdTxtBx().sendKeys("eWuVyRE21");
		po.loginBtn().click();
		BasePage page=new BasePage(driver);
		page.VerifyWebElement(po.errorMsg());
		Assert.assertEquals(po.errorMsg().isDisplayed(), true);
		}
		catch (Exception e) {
			Reporter.log("Test Fail",true);
			Assert.fail();
}
	}	}

public class Test6 extends BaseTest {
@Test (groups= {"regression"},priority=6)
public void testValidUnEmptyPw() {
	try {
	driver.get("https://www.linkedin.com/");
	LinkedloginPO po=new LinkedloginPO(driver);
	po.unTxtBx().sendKeys("banty.kumar862");
	po.pwdTxtBx().sendKeys("eWuVyRE21");
	po.loginBtn().click();
	BasePage page=new BasePage(driver);
	page.VerifyWebElement(po.errorMsg());
	Assert.assertEquals(po.errorMsg().isDisplayed(), true);
	}
	catch (Exception e) {
		Reporter.log("Test Fail",true);
		Assert.fail();
	}
}
}
public class Test7 extends BaseTest {
@Test (groups= {"regression"},priority=7)
public void EmptyUnInvalidPw() {
	try {
	driver.get("https://www.linkedin.com/");
	LinkedloginPO po=new LinkedloginPO(driver);
	po.unTxtBx().sendKeys("");
	po.pwdTxtBx().sendKeys("eWuVyRE21");
	po.loginBtn().click();
	BasePage page=new BasePage(driver);
	page.VerifyWebElement(po.errorMsg());
	Assert.assertEquals(po.errorMsg().isDisplayed(), true);
	}
	catch (Exception e) {
		Reporter.log("Test Fail",true);
		Assert.fail();
	}
}
}
public  class Test8 extends BaseTest {
@Test (groups= {"regression"},priority=8)
public void testEmptyUnEmptyPw() {
	try {
	driver.get("https://www.linkedin.com/");
	LinkedloginPO po=new LinkedloginPO(driver);
	po.unTxtBx().sendKeys("");
	po.pwdTxtBx().sendKeys("");
	po.loginBtn().click();
	BasePage page=new BasePage(driver);
	page.VerifyWebElement(po.errorMsg());
	Assert.assertEquals(po.errorMsg().isDisplayed(), true);
	}
	catch (Exception e) {
		Reporter.log("Test Fail",true);
		Assert.fail();
	}
}}
} 


