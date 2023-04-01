package smoke;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.erphorizon.pages.commonpages.LoginPage;
import com.erphorizon.utils.CsvUtil;

public class AdminTest {
	LoginPage loginPage;
	private static final String USER_ACCOUNT = System.getProperty("user.dir")+"src/main/resources/csv/Users.csv";
	
	@BeforeClass
	public void setup() {
		loginPage= new LoginPage();
		
	}
	@Test
	public void loginAdmin() {
		CsvUtil.setCsvPath(USER_ACCOUNT);
		loginPage.login(CsvUtil.get("username"),CsvUtil.get("password"));
	}

	@AfterClass
	public void teardown() {
		loginPage.signout();
	}

}
