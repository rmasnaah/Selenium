import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginUserAccount {

	public static void main(String[]args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
	
		driver.findElement(By.cssSelector(".caret")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'unt/login')]")).click();
		
		driver.findElement(By.cssSelector("#input-email")).sendKeys("rmasnaah@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("123Test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		try {
			driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible"));
			System.out.println("Login is not Successful");
		}
		
		catch(Exception e) {
			System.out.println("Login is Successful");
		}
		
}
}