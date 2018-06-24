package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwtchActvElement 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("http://www.way2sms.com");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("mindq");
		Thread.sleep(5000);
		String t=driver.getTitle();
		String u=driver.getCurrentUrl();
		System.out.println(t);
		System.out.println(u);
		if(u.contains("https"))
		{
			System.out.println("opened site is secured");
		}
		else
		{
			System.out.println("opened site is not secured");
		}
		driver.quit();

	}

}
