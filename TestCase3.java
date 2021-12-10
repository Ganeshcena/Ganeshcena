package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String title= driver.getTitle();
	System.out.println(title);
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FitnessZone");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ganeskumar");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sundar");
	WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select source = new Select(elesource);
	source.selectByValue("LEAD_EMPLOYEE");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ganeshkumar");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Salutation");
	WebElement elesource1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select source1 = new Select(elesource1);
	source1.selectByValue("IND_SOFTWARE");
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/21/00");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(title);
	driver.close();
	
	
	
	
	
	

	}

}
