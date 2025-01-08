package Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Register 
{
	WebDriver driver;

	/*@FindBy(xpath ="//*[@id=\"demo-page\"]/body/div[7]/header/nav/ul/li[3]/span")
	WebElement e1;*/
	
	@FindBy(xpath ="/html/body/nav/div[1]/ul/li[8]/a")
	WebElement e2;
	
	@FindBy(id ="sign-username")
	WebElement e3;

	@FindBy(id ="sign-password")
	WebElement e4;

	@FindBy(xpath ="/html/body/div[2]/div/div/div[3]/button[1]")
	WebElement e5;
		
	public Register(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Register() 
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e2.click();
		e3.sendKeys("Prajakta");
		e4.sendKeys("Prajakta@123");
		e5.click();
		/*try {
			// Wait for alert to be present
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to alert and accept it
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is present.");
		}
		e5.click();*/
	}
}

