package automation;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtowindowhandles 
{
	public static void main(String[] args) throws Exception
{
	//open browser
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open website
		driver.get("http://www.way2sms.com");
		driver.findElement(By.xpath("//*[contains(@src,'android-button')]")).click();
		Thread.sleep(10000);
		//switch to new window
		ArrayList<String> whs=new ArrayList<String>(driver.getWindowHandles());
	for(int i=0; i<whs.size(); i++)
		{
		System.out.println(whs.get(i));
		}
		driver.switchTo().window(whs.get(1));
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(10000);
		driver.close();
		Thread.sleep(10000);
		//switch to 1st window
		driver.switchTo().window(whs.get(0));
		driver.close();
		
		

	}

}
