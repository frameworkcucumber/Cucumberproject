package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportClass {
	public static void jvmGenerateReport(String jsonPath) {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumber1\\Reports\\JVMReport");
		Configuration c = new Configuration(f, "Social Application");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("OS", "Windows");
		List<String> l = new ArrayList<String>();
		l.add(jsonPath);
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}

}
