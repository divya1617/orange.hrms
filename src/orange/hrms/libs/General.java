package orange.hrms.libs;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import orange.hrms.utility.Log;


public class General extends Global 
{ 
	//open application
	public void openapplication()
	{ 
		//System.setProperty(“webdriver.gecko.driver”,”E:\\geckodriver.exe”); 
		driver = new ChromeDriver(); 
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
		
	} 
	//close application
	public void closebrowser()
	{ 
		driver.quit();
		System.out.println("Application closed");
		Reporter.log("Application closed");
		Log.info("Application closed");
	}
	//login
	public void login() throws Exception
	{  
		driver.findElement(By.name(txt_username)).sendKeys(un); 
		driver.findElement(By.name(txt_password)).sendKeys(pw);

		driver.findElement(By.name(btn_login)).click(); 
		System.out.println("Login completed");
		Reporter.log("Login completed");
		Log.info("Login completed");
		Thread.sleep(3000); 
	} 
	//logout
	public void Logout() throws Exception {

		driver.findElement(By.xpath(btn_welcome)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(link_Logout)).click();
		System.out.println("Logout completed");
		Reporter.log("Logout completed");
		Log.info("Logout completed");
	}
	//add employee
	public void addemp(){
		//driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(link_pim)).click();
		driver.findElement(By.xpath(btn_addemployee)).click();
		//driver.switchTo().frame("rightMenu");
		driver.findElement(By.id(txt_firstname)).sendKeys("divya");;
		driver.findElement(By.id(txt_middlename)).sendKeys("ch");
		driver.findElement(By.id(txt_lastname)).sendKeys("ch");
		driver.findElement(By.id(txt_employeeid)).sendKeys("235");
		driver.findElement(By.id(btn_save)).click();
		driver.switchTo().parentFrame();
		
		System.out.println("adding new emp");
		Reporter.log("adding new emp");
		Log.info("adding new emp");
	} 
	//delete employee
	public void delmp(){ 

		System.out.println("delete emp");
	} 
} 





//driver.findElement(By.xpath("//a[@id='welcome']")).click();
//	driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
//System.out.println("Logout Successfully Completed");
//Thread.sleep(3000);