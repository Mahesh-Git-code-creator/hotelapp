package Regression_Page;

import java.io.IOException;
import java.util.HashMap;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BrowserPage.chromeBrowser;
import ExcelData.TestScenario;
import Logincases_Adactin_HotelApp.LoginCases;

public class TC_001ExcelLoginPage extends chromeBrowser {

	@Test(description = "success login data", dataProvider = "getExcelRetrieveData")

	public void login(HashMap<String, String> Hashing) {

		LoginCases firstpage = new LoginCases();

		firstpage.UserName(Hashing.get("Username"));
		firstpage.PasswordName(Hashing.get("password"));
		firstpage.Clicking();
		firstpage.VerifyTitle(Hashing.get("Exp-Title"));

	}

	@DataProvider
	public Object[][] getExcelRetrieveData() throws IOException {

		Object[][] dataExcel = new Object[1][1];

		dataExcel[0][0] = TestScenario.ExcelData("TC-001");

		return dataExcel;

	}

}
