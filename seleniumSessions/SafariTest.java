package seleniumSessions;
// we can not run safari in windows because selenium driver is supported by safari10+ version only ,
//but apple stopped its update for windows at 5.1 only
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.safari.driver","C:\\Users\\Mano\\Downloads\\org\\openqa\\selenium\\safari.exe");
		// the above statement is not required for safari browser
WebDriver driver = new SafariDriver();
 driver.get("http://www.ssc.nic.in");
 
	}

}
