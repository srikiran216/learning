package automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailllogin 
{
public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Launch gmail site
	driver.get("https://www.gmail.com/");
	//Do login
	driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("srikiran216");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("xxxxxxxxxxxxx");
	WebDriverWait w=new WebDriverWait(driver, 200);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	//click on compose
	driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
	//fill fields 
	driver.findElement(By.xpath("//*[@aria-label='To']")).sendKeys("vinaykumar067@yahoo.com");
	driver.findElement(By.xpath("//*[@class='aoT']")).sendKeys("test auto mailing");
	driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("just for testing");
	//click on attachment link
	driver.findElement(By.xpath("//*[@aria-label='Attach files']")).click();
	//automate file upload
	StringSelection x=new StringSelection("E:\\personel\\kiran.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
	Thread.sleep(1000);
	Robot r=new Robot();
	if(System.getProperty("os.name").contains("Mac"))
	{
		r.keyPress(KeyEvent.VK_META);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_META);
	}
	else
	{
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@aria-label,'Uploading attachment:')]/descendant::table/tbody/tr[1]/td[2]/div/div/div/div"))); 
	    w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@aria-label,'Uploading attachment:')]/descendant::table/tbody/tr[1]/td[2]/div/div/div/div")));
	//send mail
	    driver.findElement(By.xpath("//div[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='View message']")));
	//Get message and display
	    System.out.println(driver.findElement(By.xpath("//span[text()='View message']/parent::*")).getText());
	//do logout
	    driver.findElement(By.xpath("//*[@class='gb_db gbii']")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign out']")));
	driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));
	driver.close();
	
	}

}
