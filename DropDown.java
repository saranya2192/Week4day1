package Week4.Day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import java.util.ArrayList;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		//setup the driver
		WebDriverManager.chromedriver().setup();
		//Chromedriver
		ChromeDriver driver= new ChromeDriver();
		//Load url
		driver.get("https://leaftaps.com/opentaps/");
		//maximaize the screen
		driver.manage().window().maximize();
		//timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter USename
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Create PAssword
		driver.findElement(By.id("passwrod")).sendKeys("crmfsa");
		//Login button after passwrod
		driver.findElement(By.className("decorativeSubmit")).click();
		//clcik on crmsfa tab
		driver.findElement(By.linkText("CRM/SFA")).click();
		//create lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//lead menu
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//enter the details
		driver.findElement(By.id("createLeadFrom_companyName")).sendKeys("Aadith");
		driver.findElement(By.id("createLeadFrom_Name")).sendKeys("saranya");
		driver.findElement(By.id("createLeadFrom_lastName")).sendKeys("sakthivel");
		//use select keys for dropdown
		driver.findElement(By.id("createLeadFrom_dataSourceID")).sendKeys("Employee");
		//find element in market dropdown
		WebElement marketingdropdown = driver.findElement(By.id("createLeadForm_marketingCampID"));
		//select class using visible text
		Select marketing =  new Select(marketingdropdown);
		marketing.selectByVisibleText("Automobile");
		WebElement currencydropdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select source = new Select(currencydropdown);
		source.selectByIndex(1);
		//marketing
		WebElement industrydropdown = driver.findElement(By.id("createLEadForm_industryEnumId"));
		Select industryselect = new Select(industrydropdown);
		List<WebElement> 1 = industryselect.getOptions();
		List<String> list = new ArrayList<String>();
		for(WebElement eachoptions : 1)
		{
			list.add(eachoptions.getText());
		}
		System.out.println(list);
		industryselect.selectByValue("IND-INSURENCE");
		WebElement ownershipdropdown = driver.findElement(By.id("CreateLeadForm_ownershipEnumId"));
		Select ownershipselect = new Select(ownershipdropdown);
		ownershipselect.selectByIndex(ownershipselect.getOptions().size()-1);
		List<String> list = new ArrayList<String>();
		for(WebElement eachoptions : 1)
		{
			list.add(eachoptions.getText());
		}
		System.out.println(list);
		industryselect.selectByValue("IND_INSURENCE");
		WebElement ownershipdropdown = driver.findElement(By.id("createLeadFrom_ownershipEnumId"));
				Select ownershipSelect = new Select(ownershipdropdown);
				ownershipselect.selectByIndex(ownershipselect.getOptions().size()-1);
				WebElement generalstatdropdown = driver.findElement(By.id"createLeadForm_ownershipEnumID");
				Select stateselect =  new Select(generalstatdropdown);
				stateselect.selectByIndex(2);
				driver.findElement(By.className("smallSubmit")).click();		
		}
		
		
		
		
		
	}


