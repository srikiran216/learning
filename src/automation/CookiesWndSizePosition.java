package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesWndSizePosition 
{
public static void main(String[] args) throws Exception
{

	System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	if(driver.manage().getCookies().size()!=0)
	{
		System.out.println("cookies were loaded");
	}
	else
	{
		System.out.println("cookies were not loaded");
	}
	// Get size of the browser window
	int w=driver.manage().window().getSize().getWidth();
	int h=driver.manage().window().getSize().getHeight();
	System.out.println("size of the browser window"+w+" "+h);
	//Set size of the window
	Dimension wh=new Dimension(300,400);
	driver.manage().window().setSize(wh);
	Thread.sleep(10000);
	//get position of browser window
	int x=driver.manage().window().getPosition().getX();
	int y=driver.manage().window().getPosition().getY();
	System.out.println("position of the window on screen x:"+x+", y:"+y);
	//set position of browser window
	Point p=new Point(400,400);
	driver.manage().window().setPosition(p);
	Thread.sleep(10000);
	//close site
	driver.close();
	
	
	
	
	

	}

}
