package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.*;

public class JvmReport {
	
	public static void generateJvmReport(String jasonPath) {
		
		//1. mention the target folder for JVM report
		File f= new File(System.getProperty("user.dir")+"\\target\\Reports\\JvmReport");

		//2. add the details that you want
		Configuration con= new Configuration(f, "My Project application");
		con.addClassifications("Browser", "chrome");
		con.addClassifications("window", "10");
		con.addClassifications("Browser Version", "95");
		con.addClassifications("Sprint", "21");
		
		
		//3. mentuon the jason file path(converting string to list<string>)
		
		List<String> li= new ArrayList<String>();
		li.add(jasonPath);
		
		//4. create report for reportBuilder
		
		ReportBuilder r= new ReportBuilder(li, con); 
		r.generateReports();
		
		
		
		
	}

}
