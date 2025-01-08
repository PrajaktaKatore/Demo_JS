package Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LogIn
{
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/nav/div[1]/ul/li[5]/a")
	WebElement e1;
	
	@FindBy(id="loginusername")
	WebElement e2;

	@FindBy(id="loginpassword")
	WebElement e3;

	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
	WebElement e4;

	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[1]")
	WebElement e5;

		
	public LogIn(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Log_In() 
	{
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e1.click();
		e2.sendKeys("Prajakta");
		e3.sendKeys("prajakta@123");
		e4.click();
		try {
			// Wait for alert to be present
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to alert and accept it
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is present.");
		}
		e5.click();
	}
}
