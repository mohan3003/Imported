package org.runner;

import org.baseclass.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepDefinition", dryRun= false, snippets= SnippetType.UNDERSCORE, 
tags= {"@sanity"}, plugin= {"html:C:\\Users\\USER\\eclipse-workspace\\ProjectStar1\\target\\Reports",
		"json:target\\Reports\\landing.json",
		"junit:target\\Reports\\lk.xml",
		"rerun:src\\test\\resources\\Rerun\\failed.txt"})
public class TestRunnerClass {
	
	@AfterClass
	public static void reports() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\landing.json");
	}
	

}
