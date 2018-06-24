package automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class FbLogin 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the Browser name");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String browser=scan.nextLine();
		WebDriver driver= null;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "D:\\kiran\\SELENIUM\\gecodriver.exe");
		driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\kiran\\SELENIUM\\MicrosoftWebDriver.exe");
		    driver=new EdgeDriver();
		}
		else if(browser.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver", "D:\\kiran\\SELENIUM\\RequiredSoftwares\\operadriver_win64\\operadriver.exe");
	        OperaOptions options = new OperaOptions();
			options.setBinary("C:\\Program Files\\Opera\\launcher.exe");        
			driver = new OperaDriver(options);
		}
		else
		{
			System.out.println("Entered browser name is worrng or not available");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");	
		driver.findElement(By.name("email")).sendKeys("srikiran216@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("xxxxxxxxxxxxxxx");
		Thread.sleep(30000);
		Robot r=new Robot();
		for(int i=1; i<=2; i++)
		{
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}
		WebElement l=driver.findElement(By.id("u_0_a"));
		if(l.isDisplayed())
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
		if(l.isEnabled())
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("Not Enabled");
		}
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.linkText("Home")).click();
		/*driver.findElement(By.xpath("//*[@class='_5lxt f_click']")).click();
		driver.findElement(By.xpath("(//*[@class='_54nh'])[9]")).click();*/
		driver.findElement(By.xpath("//*[text()='Messenger']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Venkat Chiranjeevi']")).click();
		//driver.findElement(By.xpath("//a[@aria-label='New Message']")).click();
		//driver.findElement(By.xpath("//*[contains(@placeholder,'Type the name of a person')]"));
		Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@class='_1mf _1mj']")).sendKeys("hai bava automation testing plz neglect this message",Keys.ENTER);
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
	    WebElement q=(WebElement) ((JavascriptExecutor) driver).executeScript("return document.avlAndFareForm.quota[5]");
	    q.click();*/
		
	}

}
