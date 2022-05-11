package Week4.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTable {
	public static void main(String[]args)
	{
		//setup the driver
		WebDriverManager.chromedriver().setup();
		//Chromedriver
		ChromeDriver driver= new ChromeDriver();
		//Load url
		driver.get("http://www.leafground.com/pages/table.html");
		//maximaize the screen
		driver.manage().window().maximize();
		//timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		int tablecount =  driver.findElements(By.xpath("//table)")).size();
		System.out.println("no of tables in page" + tablecount);
		
		for(int i = 1;i<=tablecount;i++)
		{
			int table1rowcount = driver.findElements(By.xpath("//table[@class='even']//tr")).size();
			System.out.println("rows in the table" +i+" "+table1rowcount);
			int table1columncount = driver.findElements(By.xpath("//table[@class='even']//th")).size();
			System.out.println("columns in the table" +i+" "+table1columncount);
			driver.findElement(By.xpath("//table[@class='even']//tr")).getText();
			driver.findElement(By.xpath("//table[@name='aadi']//td")).getText();
			for(int j=2;j<tablecount+1;j++)
			{
				String val = driver.findElement(By.xpath("//table//tr["+j+"]//td[2]")).getText();
				if(val.equals(val))
				{
					driver.findElement(By.xpath("//table//tr["+j+"]//td[3]")).click();
					if(driver.findElement(By.xpath("//table//tr["+j+"]//input")).isSelected())
					{
						System.out.println("the progress is");
					}
				}
					
				}
			driver.close();
			}
	}	}
	
