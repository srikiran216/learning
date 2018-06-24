package automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2sms
{
public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.way2sms.com");	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	/*driver.findElement(By.id("loginBTN")).click();
	Thread.sleep(5000);
	//Change focus of driver object to alert window
	String alr=driver.switchTo().alert().getText();
	System.out.println(alr);
	driver.switchTo().alert().accept();*/
	//do login
    driver.findElement(By.name("username")).sendKeys("9491643264");
    driver.findElement(By.name("password")).sendKeys("tarun83352kiran");
    driver.findElement(By.id("loginBTN")).click();
    //send message
    driver.findElement(By.xpath("//a[contains(@href,'sendSMS')]")).click();
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'sendSMS?Token')]")));
    driver.findElement(By.xpath("//*[@placeholder='Mobile Number']")).sendKeys("8328342230");
    driver.findElement(By.name("message")).sendKeys("where r u");
    driver.findElement(By.id("Send")).click();
    Thread.sleep(5000);
    driver.switchTo().defaultContent();
  if(driver.findElement(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")).isDisplayed())
  {
     		driver.findElement(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")).click();
    		Thread.sleep(5000);
    		Robot r=new Robot();
    	    r.keyPress(KeyEvent.VK_TAB);
    		r.keyRelease(KeyEvent.VK_TAB);
    		r.keyPress(KeyEvent.VK_TAB);
    		r.keyRelease(KeyEvent.VK_TAB);
    		r.keyPress(KeyEvent.VK_ENTER);
    		r.keyRelease(KeyEvent.VK_ENTER);
  }
    driver.switchTo().frame("frame");
    String x=driver.findElement(By.xpath("(//*[@class='ssms consuki ']/following-sibling::span)|(//*[@class='ssms consuki err']/following-sibling::span)")).getText();
    System.out.println(x);
    //change focus of driver object to page
    driver.switchTo().defaultContent();
    //do logout
    driver.findElement(By.xpath("//i[@class='out louti']")).click();
    
	}

}
