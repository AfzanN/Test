package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class tolearnextentreport {
	@Test
	
	public void reports() {
		
		String TIME = LocalDateTime.now().toString().replace(":", "-");
		// step1 create extentspaRK reporter object
		ExtentSparkReporter Spark = new ExtentSparkReporter("./HTML_reports/extentReport"+TIME+".html");
		
		//step2 create extent reports object
		
		ExtentReports extreports = new ExtentReports();
		
		//step3 attach spark reporter to extent reports
		
		extreports.attachReporter(Spark);
		
		//step4 create extent test object
		ExtentTest test = extreports.createTest("report");
		
		//step5 call log() to provide status and message
		test.log(Status.PASS, "log message added into extent reports");
		
		//step6 call flush () to write report into destination
		
		extreports.flush();
		
		
		
	}

}
