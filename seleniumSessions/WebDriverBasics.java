package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// 1.Firefox browser
		// geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mano\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();// this driver will launch firefox
		driver.get("http://www.amazon.com");// this method gives url to browser
		System.out.println(driver.getTitle());
		
		//validation point: this is called automation testing
		if (driver.getTitle().equals("amazon")) {
			System.out.println("correct title");
		} else {
			System.out.println("wrong title");
		}
		System.out.println("amazon browsed");
		driver.quit();//this method closes the browser
		
		// driver.get("http://www.google.com");
		// 2.chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mano\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();// launch google chrome
		driver1.get("http://www.youtube.com");// url of youtube
		System.out.println(driver1.getTitle());
		if (driver1.getTitle().equals("YouTube")) {
			System.out.println("correct title");
		} else {
			System.out.println("wrong title");
		}
		System.out.println("youtube browsed");
		driver1.quit();
		ChromeDriver driver11 = new ChromeDriver();// we can do like this also
		driver11.get("http://flipkart.com");
		driver11.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8790234448");
		System.out.println(driver11.getTitle());
		if (driver11.getTitle().equals("flipkart")) {
			System.out.println("correct title");
		} else {
			System.out.println("wrong title");
		}
		System.out.println("flipkart browsed");
		System.out.println(driver11.getCurrentUrl());// guves current url of browser
		System.out.println(driver11.getPageSource());// gives sourse code of the web page
		//driver11.sleep(3000);
		driver11.quit();
		System.out.println("yesX");

		
	}

}
