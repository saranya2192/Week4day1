package Week4.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

public static void main(String[]args)
{
	//setup the driver
	WebDriverManager.chromedriver().setup();
	//Chromedriver
	ChromeDriver driver= new ChromeDriver();
	//Load url
	driver.get("https://www.chittorgarh.com/");
	//maximaize the screen
	driver.manage().window().maximize();
	//timeout
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//click on stock market
	driver.findElement(By.id("Stock Market")).click();
	//click on NSE Bulk Deals
	driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
	//get security names
	List<WebElement> findElements = driver.findElements(By.xpath("//table[@class= 'table table bordered table-condensed table-stripped']//th"));
	List<String> securityNames =  new ArrayList<String>();
	int Count =  findElements.size();
	System.out.println(Count);
	for(int i=1; i <=Count; i++)
	{
		String text =  driver.findElement((By.xpath("//table[@class='table table-bordered table -condensed table-stripped']///tr["+i+"]//th[1]"))).getText();
		System.out.println("Secuirtynames" + text );
	Set<String> set = new LinkedHashSet<String>();
	if(set.size()<findElements.size())
	{
		System.out.println("the Elements are : + set");
	}
	
	}	
}
}
