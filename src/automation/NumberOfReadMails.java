package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NumberOfReadMails 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Launch gmail site
		driver.get("https://www.gmail.com");
		//Do login
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("srikiran216");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("**************");
		WebDriverWait w=new WebDriverWait(driver, 200);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='COMPOSE']")));
		
		int urmc=0;
		int rmc=0;
		while(2>1)
		{
		List<WebElement> lst=driver.findElements(By.xpath("(//div[@role='tabpanel'])[1]/descendant::tbody/tr"));
		for(int i=1; i<=lst.size(); i++)
		{
			WebElement e=driver.findElement(By.xpath("(//div[@role='tabpanel'])[1]/descendant::tbody/tr["+i+"]/td[5]/div[1]"));
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("var x=arguments[0].textContent; alert(x);", e);
			String sub=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			//System.out.println(sub);
			String z[]=sub.split(",");
			if(z[0].contains("unread"))
			{
				urmc=urmc+1;
				System.out.println(z[2]);
			}
			else
			{
				rmc=rmc+1;
				System.out.println(z[1]);
			}
		}
		
		try
		{
			if(driver.findElement(By.xpath("//*[@aria-disabled='true'][@aria-label='Older']")).isDisplayed())
			{
				break;
			}
		}
		catch(Exception e)
			{
				driver.findElement(By.xpath("//*[@aria-label='Older']")).click();
				//w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
				Thread.sleep(6000);
				
			}
			
		}
		System.out.println("unread mails count "+urmc);
		System.out.println("read mails count "+rmc);
			

	}

}
