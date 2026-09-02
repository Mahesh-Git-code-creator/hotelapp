package Logincases_Adactin_HotelApp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import BrowserPage.chromeBrowser;

public class stepDefinition extends chromeBrowser {

	public stepDefinition() {
		PageFactory.initElements(driver, this);
	}

	public void type(WebElement element, String text) {

		ScrollBypage("");

		waitForElement(element);

		element.sendKeys(text);
	}

	public void ScrollBypage(String string) {

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript(string);

	}

	public void IntegerValue(WebElement element, CharSequence num) {

		element.sendKeys(num);

	}

	public void waitForElement(WebElement element) {

		WebDriverWait mywaits = new WebDriverWait(driver,
				Duration.ofSeconds(Long.parseLong(prop.getProperty("implicitywait"))));

		mywaits.until(ExpectedConditions.visibilityOf(element));

	}

	public String Title() {

		return driver.getTitle();

	}

	public void clickelement(WebElement element) {
		element.click();
	}

	public void VerifyTitle(String expTitle) {

		Assert.assertEquals(Title(), expTitle);

	}

	public void ActionKey(WebElement element) {

		Actions action = new Actions(driver);

		action.moveToElement(element).click().build().perform();

	}

	public void selectMethod(WebElement element, String option) {

		new Select(element).selectByVisibleText(option);

	}

	public void clearData(WebElement element) {

		element.clear();

	}

	public void SecreenShotOFF(String pattern) throws IOException {

		String file = System.getProperty(pattern);

		TakesScreenshot TS = (TakesScreenshot) driver;

		File Fs = TS.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(Fs, new File(file));

	}

	public void MultipleWindowHandles(WebElement element, String text) {

		String HomeWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath(text)).click();

		Set<String> Handle = driver.getWindowHandles();

		Iterator<String> Window = Handle.iterator();

		while (Window.hasNext()) {

			driver.switchTo().window(Window.next());

			System.out.println(driver.getCurrentUrl());

			System.out.println(driver.getTitle());

			if (driver.getTitle().equals(text)) {
				break;
			}
			driver.switchTo().window(HomeWindowId);
		}

	}
}
