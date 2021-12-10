package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.linkText("Name and ID")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='firstName']) [3]")).sendKeys("ganeshkumar");
        driver.findElement(By.xpath("(//button[@type='button']) [7]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
        driver.findElement(By.linkText("Edit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("FitnessZone");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        System.out.println("EditLead");
        driver.close();
        }

}
