package SpiceTest.SpiceJet;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfiguration;

public class ExtentReporter {

	public static ExtentReports repo() {
		
		String path = System.getProperty("user.dir")+"\\reports"+"\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setDocumentTitle("SpiceJet");
		
		reporter.config().setReportName("mbnnlk");
		
		
		
		
		ExtentReports reports = new ExtentReports();
		
		reports.attachReporter(reporter);
		
		return reports;
		
		
	}
}
