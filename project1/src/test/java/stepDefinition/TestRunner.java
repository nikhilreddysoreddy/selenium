package stepDefinition;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumberoptions(features="src/test/resources/features2/new_tours2.feature",
glue= {"stepDefenation"},
monochrome=true,
plugin= {"pretty","html:target/htmlreports/report.html",
		"json:target/jsonreports/report.json",
		"junit:target/junitreports/report.xml"
}
)

public class TestRunner {
	
	

}
