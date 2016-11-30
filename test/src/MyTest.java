import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
	private WebDriver driver;
	private String baseUrl;
	private String exePath = "C:\\Users\\rcamp\\Documents\\Workspaces\\chromedriver.exe";
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		baseUrl = "http://loki.ist.unomaha.edu:14559/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/************************/
	/* Create Account Tests */
	/************************/
	@Test // 1
	public void testCorrectAccount() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Create Your Account")).click();
		driver.findElement(By.name("nuid")).clear();
		driver.findElement(By.name("nuid")).sendKeys("55555555");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("passwoird");
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("dob")).clear();
		driver.findElement(By.name("dob")).sendKeys("08/22/89");
		driver.findElement(By.name("add1")).clear();
		driver.findElement(By.name("add1")).sendKeys("123 N. St.");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Omaha");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("Nebraska");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("55252");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("1-989-9989");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ross@email.com");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}

	@Test // 2
	public void testBadAccountFirst() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Create Your Account")).click();
		driver.findElement(By.name("nuid")).clear();
		driver.findElement(By.name("nuid")).sendKeys("55555555");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("5");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("dob")).clear();
		driver.findElement(By.name("dob")).sendKeys("08/22/89");
		driver.findElement(By.name("add1")).clear();
		driver.findElement(By.name("add1")).sendKeys("123 N. St.");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Omaha");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("Nebraska");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("55252");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("1-989-9989");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ross@email.com");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}

	@Test // 3
	public void testBadAccountLast() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Create Your Account")).click();
		driver.findElement(By.name("nuid")).clear();
		driver.findElement(By.name("nuid")).sendKeys("55555555");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("5");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("dob")).clear();
		driver.findElement(By.name("dob")).sendKeys("08/22/89");
		driver.findElement(By.name("add1")).clear();
		driver.findElement(By.name("add1")).sendKeys("123 N. St.");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Omaha");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("Nebraska");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("55252");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("1-989-9989");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ross@email.com");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}

	@Test // 4
	public void testBadAccountDOB() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Create Your Account")).click();
		driver.findElement(By.name("nuid")).clear();
		driver.findElement(By.name("nuid")).sendKeys("55555555");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("passwoird");
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("dob")).clear();
		driver.findElement(By.name("dob")).sendKeys("1");
		driver.findElement(By.name("add1")).clear();
		driver.findElement(By.name("add1")).sendKeys("123 N. St.");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Omaha");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("Nebraska");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("55252");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("1-989-9989");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ross@email.com");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}

	@Test // 5
	public void testBadAccountCity() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Create Your Account")).click();
		driver.findElement(By.name("nuid")).clear();
		driver.findElement(By.name("nuid")).sendKeys("55555555");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("dob")).clear();
		driver.findElement(By.name("dob")).sendKeys("08/22/89");
		driver.findElement(By.name("add1")).clear();
		driver.findElement(By.name("add1")).sendKeys("123 N. St.");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("4");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("Nebraska");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("55252");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("1-989-9989");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ross@email.com");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}

	@Test // 6
	public void testBadAccountState() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Create Your Account")).click();
		driver.findElement(By.name("nuid")).clear();
		driver.findElement(By.name("nuid")).sendKeys("55555555");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("dob")).clear();
		driver.findElement(By.name("dob")).sendKeys("08/22/89");
		driver.findElement(By.name("add1")).clear();
		driver.findElement(By.name("add1")).sendKeys("123 N. St.");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Omaha");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("3");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("55252");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("1-989-9989");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ross@email.com");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}

	@Test // 7
	public void testBadAccountPhone() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Create Your Account")).click();
		driver.findElement(By.name("nuid")).clear();
		driver.findElement(By.name("nuid")).sendKeys("55555555");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("passwoird");
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("dob")).clear();
		driver.findElement(By.name("dob")).sendKeys("08/22/89");
		driver.findElement(By.name("add1")).clear();
		driver.findElement(By.name("add1")).sendKeys("123 N. St.");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Omaha");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("Nebraska");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("55252");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("1");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ross@email.com");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}

	@Test // 8
	public void testBadAccountEmail() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Create Your Account")).click();
		driver.findElement(By.name("nuid")).clear();
		driver.findElement(By.name("nuid")).sendKeys("55555555");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("passwoird");
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("dob")).clear();
		driver.findElement(By.name("dob")).sendKeys("08/22/89");
		driver.findElement(By.name("add1")).clear();
		driver.findElement(By.name("add1")).sendKeys("123 N. St.");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Omaha");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("Nebraska");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("55252");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("1-989-9989");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ross@5");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}
	
	/*********************/
	/* Reservation Tests */
	/*********************/
	@Test // 9
	public void testCorrectReservation() throws Exception {
		driver.get(baseUrl + "/go/index.cgi");
		driver.findElement(By.linkText("Make A Reservation")).click();
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("room")).clear();
		driver.findElement(By.name("room")).sendKeys("100");
		driver.findElement(By.name("date")).clear();
		driver.findElement(By.name("date")).sendKeys("121616");
		driver.findElement(By.name("time")).clear();
		driver.findElement(By.name("time")).sendKeys("2pm to 4pm");
		driver.findElement(By.name("sb")).click();
	}

	@Test // 10
	public void testBadReservationFirst() throws Exception {
		driver.get(baseUrl + "/go/index.cgi");
		driver.findElement(By.linkText("Make A Reservation")).click();
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ro");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("room")).clear();
		driver.findElement(By.name("room")).sendKeys("100");
		driver.findElement(By.name("date")).clear();
		driver.findElement(By.name("date")).sendKeys("121616");
		driver.findElement(By.name("time")).clear();
		driver.findElement(By.name("time")).sendKeys("2pm to 4pm");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}
	
	@Test // 11
	public void testBadReservationLast() throws Exception {
		driver.get(baseUrl + "/go/index.cgi");
		driver.findElement(By.linkText("Make A Reservation")).click();
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbe");
		driver.findElement(By.name("room")).clear();
		driver.findElement(By.name("room")).sendKeys("100");
		driver.findElement(By.name("date")).clear();
		driver.findElement(By.name("date")).sendKeys("121616");
		driver.findElement(By.name("time")).clear();
		driver.findElement(By.name("time")).sendKeys("2pm to 4pm");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}
	
	@Test // 12
	public void testBadReservationRoom() throws Exception {
		driver.get(baseUrl + "/go/index.cgi");
		driver.findElement(By.linkText("Make A Reservation")).click();
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("room")).clear();
		driver.findElement(By.name("room")).sendKeys("f");
		driver.findElement(By.name("date")).clear();
		driver.findElement(By.name("date")).sendKeys("121616");
		driver.findElement(By.name("time")).clear();
		driver.findElement(By.name("time")).sendKeys("2pm to 4pm");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}
	
	@Test // 13
	public void testBadReservationDate() throws Exception {
		driver.get(baseUrl + "/go/index.cgi");
		driver.findElement(By.linkText("Make A Reservation")).click();
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("room")).clear();
		driver.findElement(By.name("room")).sendKeys("100");
		driver.findElement(By.name("date")).clear();
		driver.findElement(By.name("date")).sendKeys("g");
		driver.findElement(By.name("time")).clear();
		driver.findElement(By.name("time")).sendKeys("2pm to 4pm");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}
	
	@Test // 14
	public void testBadReservationTime() throws Exception {
		driver.get(baseUrl + "/go/index.cgi");
		driver.findElement(By.linkText("Make A Reservation")).click();
		driver.findElement(By.name("first")).clear();
		driver.findElement(By.name("first")).sendKeys("Ross");
		driver.findElement(By.name("last")).clear();
		driver.findElement(By.name("last")).sendKeys("Campbell");
		driver.findElement(By.name("room")).clear();
		driver.findElement(By.name("room")).sendKeys("100");
		driver.findElement(By.name("date")).clear();
		driver.findElement(By.name("date")).sendKeys("121616");
		driver.findElement(By.name("time")).clear();
		driver.findElement(By.name("time")).sendKeys("f");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	}
	

	
	/**************************/
	/* Add to Blacklist Tests */
	/**************************/
	  @Test // 15
	  public void testValidBlacklist() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Add To Blacklist")).click();
	    driver.findElement(By.name("first")).clear();
	    driver.findElement(By.name("first")).sendKeys("Ross");
	    driver.findElement(By.name("last")).clear();
	    driver.findElement(By.name("last")).sendKeys("Campbell");
	    driver.findElement(By.name("nuid")).clear();
	    driver.findElement(By.name("nuid")).sendKeys("55555555");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	  }
	  
	  @Test // 16
	  public void testBadBlacklistFirst() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Add To Blacklist")).click();
	    driver.findElement(By.name("first")).clear();
	    driver.findElement(By.name("first")).sendKeys("Ros");
	    driver.findElement(By.name("last")).clear();
	    driver.findElement(By.name("last")).sendKeys("Campbell");
	    driver.findElement(By.name("nuid")).clear();
	    driver.findElement(By.name("nuid")).sendKeys("55555555");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	  }
	  
	  @Test // 17
	  public void testBadBlacklistLast() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Add To Blacklist")).click();
	    driver.findElement(By.name("first")).clear();
	    driver.findElement(By.name("first")).sendKeys("Ross");
	    driver.findElement(By.name("last")).clear();
	    driver.findElement(By.name("last")).sendKeys("Campbel");
	    driver.findElement(By.name("nuid")).clear();
	    driver.findElement(By.name("nuid")).sendKeys("55555555");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	  }
	  
	  @Test // 18
	  public void testBadBlacklistUID() throws Exception {
	    driver.get(baseUrl + "/go/index.cgi");
	    driver.findElement(By.linkText("Add To Blacklist")).click();
	    driver.findElement(By.name("first")).clear();
	    driver.findElement(By.name("first")).sendKeys("Ross");
	    driver.findElement(By.name("last")).clear();
	    driver.findElement(By.name("last")).sendKeys("Campbell");
	    driver.findElement(By.name("nuid")).clear();
	    driver.findElement(By.name("nuid")).sendKeys("55555554");
		Thread.sleep(5000);
		driver.findElement(By.name("sb")).click();
		Thread.sleep(5000);
	  }
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
