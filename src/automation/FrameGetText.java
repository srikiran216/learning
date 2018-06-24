package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameGetText {

	public static void main(String[] args) 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_cols");
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_a.htm']")));
		String heading=driver.findElement(By.tagName("h3")).getText();
		System.out.println(heading);
		String x=driver.findElement(By.tagName("p")).getText();
		System.out.println(x);

	}

}
