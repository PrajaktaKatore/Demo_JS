import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
	
	WebDriver driver;
	@BeforeTest
	public void TestSetUp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");	
		driver.manage().window().maximize();
	
	}
	
	@Test
    public void Testng() throws InterruptedException 
    {	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Log In")).click();
		
		
		
		driver.findElement(By.name("Email")).sendKeys("studymailid12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("abc@123");
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	}
	

}