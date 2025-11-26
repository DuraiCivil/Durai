package org.reporting;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {
	
	public static void generatereport(String json) {
		
		
		File file = new File("D:\\D\\BddCucumber\\target");
		
		Configuration conf = new Configuration(file, "Site Verifications");
		
		conf.addClassifications("version","JDK_1.8");
		
		List<String> list = new LinkedList<>();
		
		list.add(json);
		
		ReportBuilder report = new ReportBuilder(list, conf);
		report.generateReports();
		
		
		
		
	}

}
