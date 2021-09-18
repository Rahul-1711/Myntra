package dvg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asss1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("rahuldubale01@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='radio-inline']/label/div/span//input[@id='id_gender1']")).click();
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("dubale");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("9922187064");
		
		/*WebElement date=driver.findElement(By.xpath("//select[@id='days']"));
		Select s1= new Select(date);
		s1.selectByValue("17");
		
		WebElement month=driver.findElement(By.xpath("//select[@id='months']"));
		Select s2= new Select(month);
		s2.selectByValue("5");
	
		WebElement year=driver.findElement(By.xpath("//select[@id='years']"));
		Select s3= new Select(year);
		s3.selectByValue("1996");*/
		
		driver.findElement(By.xpath("//select[@id='days']")).sendKeys("17",Keys.ENTER);
		driver.findElement(By.xpath("//select[@id='months']")).sendKeys("may",Keys.ENTER);
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1996",Keys.ENTER);
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys(Keys.ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
