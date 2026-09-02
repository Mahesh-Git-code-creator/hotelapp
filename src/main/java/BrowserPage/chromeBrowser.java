package BrowserPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class chromeBrowser {

	public static WebDriver driver;

	public static FileInputStream fis1;

	public static Properties prop;

	@BeforeTest

	public void LaunchApp() {

		try {
			fis1 = new FileInputStream("src\\test\\resources\\chrome\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		prop = new Properties();

		try {
			prop.load(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeMethod

	public void BrowserLaunch() {

		String browsername = prop.getProperty("browserName");

		switch (browsername.toLowerCase()) {
		case "chrome":

			driver = new ChromeDriver();

			break;

		case "firefox":

			driver = new FirefoxDriver();

			break;

		case "edge":

			driver = new EdgeDriver();

			break;

		default:
			try {

				throw new Exception();

			} catch (Exception e) {

				System.out.println(e.getMessage());

			}
			break;
		}

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Long.parseLong(prop.getProperty("implicitywait"))));

	}

	@AfterMethod

	public void Ending() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
