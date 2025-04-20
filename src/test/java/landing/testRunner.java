package landing;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/landing", glue = "landing", monochrome = false, dryRun = false,tags = "(@smoke or @sanity) and not (@Security or @test)", plugin = {
		"pretty", "html:Target/TestReport.html" })
public class testRunner extends AbstractTestNGCucumberTests {

}
