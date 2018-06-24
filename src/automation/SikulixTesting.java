package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class SikulixTesting 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("abdul kalam sir speech");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.partialLinkText("Dr. A P J Abdul Kalam in European")).click();
		Thread.sleep(10000);
		Screen s=new Screen();
		Location l=new Location(200,200);
		s.wheel(l,Button.LEFT,0);
		Thread.sleep(2000);
		s.click("pause");
		Thread.sleep(5000);
		s.wheel(l,Button.LEFT,0);
		s.click("play");
		Thread.sleep(8000);
		s.mouseMove("volume");
		Match e=s.find("bubble.png");
		int x=e.getX();
		int y=e.getY();
		System.out.println(x+" "+y);
		Thread.sleep(5000);
		s.wheel(l,Button.LEFT,0);
		s.mouseMove("volume");
		Thread.sleep(2000);
		Location l1=new Location(x-20, y);
		s.dragDrop(e, l1);
		Location l2=new Location(x+20, y);
		Thread.sleep(5000);
		s.dragDrop(e, l2);
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
