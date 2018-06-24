package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		
		//collecting number of elements in gmail login page
		List<WebElement> wbl=driver.findElements(By.xpath("//*"));
		System.out.println("Total numer of elements :"+wbl.size());
		
		//collecting number of links in gmail login page and print
		List<WebElement> Lkl=driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links :"+Lkl.size());
		for(int i=0; i<Lkl.size(); i++)
		{
			System.out.println(Lkl.get(i).getText());
		}
		
		//collecting number of text boxes in gmail login page and print
		List<WebElement> TxtBoxl=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("Total number of Text boxes :"+TxtBoxl.size());
		for(int i=0; i<TxtBoxl.size(); i++)
		{
			System.out.println(TxtBoxl.get(i).getAttribute("name"));
		}
		
		// login to gmail and collecting number of tables in gmail page
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("srikiran216");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("xxxxxxxxxxxxxxx",Keys.ENTER);
		Thread.sleep(180000);
		List<WebElement> tbl=driver.findElements(By.tagName("table"));
		System.out.println("Total number of tables:"+tbl.size());
		
		//collecting number of forms in gmail page
		List<WebElement> forl=driver.findElements(By.xpath("//form"));
		System.out.println("Total number of forms:"+forl.size());
		
		//collecting number of frames in gmail page
		List<WebElement> frml=driver.findElements(By.xpath("//iframe"));
		System.out.println("Total number of frames :"+frml.size());
		
	}

}
