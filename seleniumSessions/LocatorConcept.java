package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorConcept {// there are 8 locators avalable in selenium

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mano\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//enter url
		// 1. xpath : absolute xpath should not be used, only relative xpath should be used
		driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("manu");//this enter manu in name tab
		driver.findElement(By.xpath("//*[@id=\"TypeofID\"]")).sendKeys("PAN Card");
		driver.findElement(By.xpath("//*[@id=\"IDnumber\"]")).sendKeys("8315432110046");
		 
		// 2.id : best to use if id available
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://ssc.nic.in/registration/home");
		driver1.findElement(By.id("Name")).sendKeys("M RAMA KRISHNA");
		driver1.findElement(By.id("TypeofID")).sendKeys("PAN Card");
		driver1.findElement(By.id("IDnumber")).sendKeys("AIOUP15465");
		
		//3. NAME:
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://ssc.nic.in/registration/home");
		driver2.findElement(By.name("Name")).sendKeys("M RAMA KRISHNA");
		driver2.findElement(By.name("TypeofID")).sendKeys("PAN Card");
		driver2.findElement(By.name("IDnumber")).sendKeys("AIOUP15465");
		
		//4. linktext : this is only for links
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://ssc.nic.in/registration/home");
		driver3.findElement(By.linkText("HOME")).click();// this will click home button
		driver3.findElement(By.linkText("New User ? Register Now")).click();// this will click register
		driver3.findElement(By.name("Name")).sendKeys("M RAMA KRISHNA");
		driver3.findElement(By.name("TypeofID")).sendKeys("PAN Card");
		driver3.findElement(By.name("IDnumber")).sendKeys("AIOUP15465");
		
		//5. partial linktext : not more useful , no need to give full linktext and only for links
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://ssc.nic.in/registration/home");
		driver4.findElement(By.partialLinkText("ANSW")).click();
		driver4.findElement(By.partialLinkText("APP")).click();
		driver4.findElement(By.partialLinkText("HOM")).click();
		
		//6. css selector : 
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://ssc.nic.in/registration/home");
		driver5.findElement(By.cssSelector("#Name")).sendKeys("M RAMA KRISHNA");
		driver5.findElement(By.cssSelector("#TypeofID")).sendKeys("PAN Card");
		driver5.findElement(By.cssSelector("#IDnumber")).sendKeys("AIOUP15465");
		
		//7. className: not recomended because we have many duplicate class names
		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://www.flipkart.com/");
		driver6.findElement(By.className("_1En5li")).click();// this click new user button
		
		//8. 
		
		
	
	}

}
