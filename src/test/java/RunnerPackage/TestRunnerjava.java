package RunnerPackage;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.Reporting;

import StepsPackage.LoginFeature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\D\\BddCucumber\\src\\test\\resources\\resources\\feature\\Myfeature.feature",
		glue ="StepsPackage",
		dryRun =false,
		
		
		plugin= {"html:target\\htmlReport",
				"junit:target\\xmlReport.xml",
				"json:target\\jsonReport.json"}
				
			
		)
public class TestRunnerjava extends LoginFeature{
	
	@AfterClass
	public static void result() {
		
		Reporting.generatereport("D:\\D\\BddCucumber\\target");
	}

}
