package project_package;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project_class {
	WebDriver driver;
	Actions act;
	String Cus_id;
	
	
	@BeforeSuite
	public void launch_browser() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		this.driver=new ChromeDriver();
		
		this.act=new Actions(driver);
		
	}
	
	@Test(priority=1)
	public void Open_Website() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/telecom/index.html");
		
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void Add_Customer() throws InterruptedException, IOException {
		
		
		
		
		
		driver.findElement(By.xpath("//section[@id='one'] //a[@href='addcustomer.php']")).click();
		
		Thread.sleep(1500);
		
		File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file1,new File("E:\\java\\imgfiles\\screenshot2.png"));
		
		System.out.println("Screenshot saved succesfully");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0\"]")));
			
		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]"));
		
		act.click().perform();
	
			
		
	}
		
	@Test(priority=4)
	public void when_Bg_status_done() throws InterruptedException {
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[2]/input")).click();//Reset Button
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();//done radio button
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Imran");//FirstName
		
		driver.findElement(By.id("lname")).sendKeys("Khan");//LastName
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("imrankhan@gmail.com");//mail id
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Imran Manzil New Delhi India");//Address
		
		driver.findElement(By.xpath("//*[@id=\"telephoneno\"]")).sendKeys("9987465487");//Mobile number
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();//Submit Button
		
		Thread.sleep(1500);
		
		String Cus_Id=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[2]/h3")).getText();

		Cus_id=Cus_Id;
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a")).click();
		
		Thread.sleep(2000);	
		
	}
	
	
	@Test(priority=3)
	public void when_bg_status_pending() throws InterruptedException {
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[2]/label")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Imran");//FirstName
		
		driver.findElement(By.id("lname")).sendKeys("Khan");//LastName
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("imrankhan@gmail.com");//mail id
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Imran Manzil New Delhi India");//Address
		
		driver.findElement(By.xpath("//*[@id=\"telephoneno\"]")).sendKeys("9987465487");//Mobile number
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();//Submit Button
		
		Thread.sleep(1500);
		
	}
	
	@Test(priority=5)
	public void Add_Tarrif_Plan() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rental1\"]")).sendKeys("600");
		
		driver.findElement(By.xpath("//*[@id=\"local_minutes\"]")).sendKeys("200");
		
		driver.findElement(By.xpath("//*[@id=\"inter_minutes\"]")).sendKeys("100");
		
		driver.findElement(By.xpath("//*[@id=\"sms_pack\"]")).sendKeys("100");
		
		driver.findElement(By.xpath("//*[@id=\"minutes_charges\"]")).sendKeys("1");
		
		driver.findElement(By.xpath("//*[@id=\"inter_charges\"]")).sendKeys("5");
		
		driver.findElement(By.xpath("//*[@id=\"sms_charges\"]")).sendKeys("2");
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[2]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rental1\"]")).sendKeys("600");
		
		driver.findElement(By.xpath("//*[@id=\"local_minutes\"]")).sendKeys("200");
		
		driver.findElement(By.xpath("//*[@id=\"inter_minutes\"]")).sendKeys("100");
		
		driver.findElement(By.xpath("//*[@id=\"sms_pack\"]")).sendKeys("100");
		
		driver.findElement(By.xpath("//*[@id=\"minutes_charges\"]")).sendKeys("1");
		
		driver.findElement(By.xpath("//*[@id=\"inter_charges\"]")).sendKeys("5");
		
		driver.findElement(By.xpath("//*[@id=\"sms_charges\"]")).sendKeys("2");
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
	}
		
	@Test(priority=6)
	public void Add_Tariff_Plan_To_Cus() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"customer_id\"]")).sendKeys(Cus_id);
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).click();
		
		Thread.sleep(1500);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
 		
		js.executeScript("scrollBy(0,500)"); 
 			
		driver.findElement(By.xpath("//table[@class='alt']/tbody/tr/td")).click();
 		
 		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[2]/input")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
		
		Thread.sleep(1500);
	}
	
	@Test(priority=7)
	public void Pay_Billing() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[2]/h3/a")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"customer_id\"]")).sendKeys(Cus_id);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,500)"); 
			
		Thread.sleep(2000);
		
		
	}

	
	@AfterSuite
	public void close_browser() {
		driver.close();
	}
		
	}
		

