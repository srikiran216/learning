package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctcb
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.get("https://www.irctc.co.in");
	    driver.findElement(By.id("usernameId")).sendKeys("penkekiran");
	    driver.findElement(By.name("j_password")).sendKeys("xxxxxxxxx");
	    Thread.sleep(20000);
	    driver.findElement(By.id("loginbutton")).click();
	    driver.findElement(By.id("jpform:fromStation")).sendKeys("SECUNDERABAD JN - SC");
	    driver.findElement(By.id("jpform:toStation")).sendKeys("BHIMAVARAM JN - BVRM");
	    driver.findElement(By.id("jpform:journeyDateInputDate")).sendKeys("15-04-2018");
	    driver.findElement(By.id("jpform:jpsubmit")).click();
	    //Thread.sleep(5000);
	    /*String page=driver.getPageSource();
	    System.out.println(page);*/
	    //driver.findElement(By.xpath("//form[@name='avlAndFareForm']/div[2]/div/table[1]/tbody/tr/td[1]/div/table/tbody/tr/td[6]/input")).click();
	    @SuppressWarnings("unused")
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    WebElement q=(WebElement) ((JavascriptExecutor) driver).executeScript("return document.avlAndFareForm.quota[5]");
	    q.click();
	    driver.findElement(By.id("cllink-17256-SL-3")).click();
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[contains(text(),'Book Now')])[2]")).click();
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath("(//input[contains(@id,'addPassengerForm:psdetail:0:p')])[1]")).sendKeys("P SRITARUN");
	    driver.findElement(By.id("addPassengerForm:psdetail:0:psgnAge")).sendKeys("30");
	    WebElement e=driver.findElement(By.id("addPassengerForm:psdetail:0:psgnGender"));
	    Select s=new Select(e);
	    s.selectByVisibleText("Male");;
	    WebElement f=driver.findElement(By.id("addPassengerForm:psdetail:0:berthChoice"));
	    Select t=new Select(f);
	    t.selectByVisibleText("UPPER");
	    
	    /*driver.findElement(By.xpath("(//input[contains(@id,'addPassengerForm:psdetail:1:p')])[1]")).sendKeys("VARALAKSHMI");
	    driver.findElement(By.id("addPassengerForm:psdetail:1:psgnAge")).sendKeys("26");
	    WebElement e1=driver.findElement(By.id("addPassengerForm:psdetail:1:psgnGender"));
	    Select s1=new Select(e1);
	    s1.selectByVisibleText("Female");
	    WebElement f1=driver.findElement(By.id("addPassengerForm:psdetail:1:berthChoice"));
	    Select t1=new Select(f1);
	    t1.selectByVisibleText("LOWER");
	    
	    driver.findElement(By.xpath("(//input[contains(@id,'addPassengerForm:psdetail:2:p')])[1]")).sendKeys("TARUN");
	    driver.findElement(By.id("addPassengerForm:psdetail:2:psgnAge")).sendKeys("20");
	    WebElement e2=driver.findElement(By.id("addPassengerForm:psdetail:2:psgnGender"));
	    Select s2=new Select(e2);
	    s2.selectByVisibleText("Male");
	    WebElement f2=driver.findElement(By.id("addPassengerForm:psdetail:2:berthChoice"));
	    Select t2=new Select(f2);
	    t2.selectByVisibleText("UPPER");
	    
	    driver.findElement(By.xpath("(//input[contains(@id,'addPassengerForm:psdetail:3:p')])[1]")).sendKeys("LAVANYA");
	    driver.findElement(By.id("addPassengerForm:psdetail:3:psgnAge")).sendKeys("19");
	    WebElement e3=driver.findElement(By.id("addPassengerForm:psdetail:3:psgnGender"));
	    Select s3=new Select(e3);
	    s3.selectByVisibleText("Female");
	    WebElement f3=driver.findElement(By.id("addPassengerForm:psdetail:3:berthChoice"));
	    Select t3=new Select(f3);
	    t3.selectByVisibleText("UPPER");*/
	    
	    driver.findElement(By.id("addPassengerForm:mobileNo")).clear();
	    driver.findElement(By.id("addPassengerForm:mobileNo")).sendKeys("7032912664");
	    Thread.sleep(10000);
	    driver.findElement(By.id("validate")).click();
	    Thread.sleep(5000);
	    /*String page=driver.getPageSource();
	    System.out.println(page);*/
	    /*WebElement O=(WebElement) ((JavascriptExecutor) driver).executeScript("return document.jpBook.PREFERRED[1]");
	    O.click();*/
	    driver.findElement(By.xpath("(//input[@name='PREFERRED'])[2]")).click();
	    driver.findElement(By.id("validate")).click();
	    driver.findElement(By.id("debitCardNumber")).sendKeys("466552255532325");
	    WebElement g=driver.findElement(By.id("debiMonth"));
	    Select u=new Select(g);
	    u.selectByVisibleText("10");
	    WebElement h=driver.findElement(By.id("debiYear"));
	    Select v=new Select(h);
	    v.selectByVisibleText("2008");
	    driver.findElement(By.name("debitCardholderName")).sendKeys("PS K KUMAR");
	    driver.findElement(By.name("cardPin")).sendKeys("****");
	    
	}

}
