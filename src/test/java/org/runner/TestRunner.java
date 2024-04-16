package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features", glue="org.steps",dryRun=false, monochrome=true,strict=true,tags="@smoke",
plugin={"pretty",
"html:C:\\Users\\Admin\\eclipse-workspace\\Cucumber1\\Reports\\HTMLReport",
"json:C:\\Users\\Admin\\eclipse-workspace\\Cucumber1\\Reports\\JSONReport\\jsonreport.json",
"junit:C:\\Users\\Admin\\eclipse-workspace\\Cucumber1\\Reports\\JUNITReport\\junitreport.xml",
"rerun:FailedScenarios\\failed.txt"})
public class TestRunner {
	@AfterClass
	public static void aftCls() {
		JvmReportClass.jvmGenerateReport("C:\\Users\\Admin\\eclipse-workspace\\Cucumber1\\Reports\\JSONReport\\jsonreport.json");
	}

}
