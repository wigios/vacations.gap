package commons;

import org.testng.annotations.BeforeClass;

public interface BaseTest {
	
	public static final String RESULT_EXPECTED = "Employee was successfully created.";
	
	public static final String RESULT_EXPECTED_FINAL = "Welcome GAP, Logout";
	
	@BeforeClass
	abstract void setupPages();

}
