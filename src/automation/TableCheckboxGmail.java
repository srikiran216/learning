package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCheckboxGmail 
{
public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	//launch gmail site
	driver.get("https://www.gmail.com/");
	
	//gmail login
	driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("srikiran216");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("xxxxxxxxxxxxxxxxxxxx",Keys.ENTER);
	//driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(60000);
	
	//using collections select 2nd row 2nd column checkbox
	List<WebElement> tbl=driver.findElements(By.tagName("table"));
	List<WebElement> tbol=tbl.get(5).findElements(By.tagName("tbody"));
    List<WebElement> trl=tbol.get(0).findElements(By.tagName("tr"));
    List<WebElement> tdl=trl.get(1).findElements(By.tagName("td"));
    tdl.get(1).findElement(By.tagName("div")).click();
    
    //using direct xpath select 3rd row, 2nd column checkbox
    driver.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/descendant::tr[3]/td[2]/div")).click();
	
	}

}
