package tests;

import common.PageManager;
import driver.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected PageManager pageManager;

	@BeforeClass
	public void setUp() {
		pageManager = new PageManager();
	}

	@AfterClass
	public void tearDown() {
		DriverFactory.close();
	}
}
