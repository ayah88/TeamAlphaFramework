package teamAlpha.reporterutils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListner {

	public static ExtentHtmlReporter reportconfig  = null;
	public static ExtentReports extent = null;
	public static ExtentTest test = null;
	static String location = "ExtentReport/extent-report.html";

	public static ExtentReports setup() {
		try {

			reportconfig = new ExtentHtmlReporter(location);
			reportconfig.config().setDocumentTitle("Automation Execution Report");
			reportconfig.config().setReportName("Automation Execution Report");
			reportconfig.config().setTheme(Theme.STANDARD);
			System.out.println("Extent Report Location Initialized..");

			reportconfig.start();

			extent = new ExtentReports();
			extent.attachReporter(reportconfig);
			extent.setSystemInfo("Application", "Execute Automation");
			extent.setSystemInfo("Operating System", System.getProperty("os.name"));
			extent.setSystemInfo("User", System.getProperty("user.name"));
			System.out.println("System Info.set in Extent Report");


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return extent;
	}

	public static void testStepHandle(String teststatus, WebDriver driver, ExtentTest extenttest, Throwable throwable) {
		switch (teststatus) {
		case "FAIL":
			extenttest.fail(MarkupHelper.createLabel("Test Case is Failed :", ExtentColor.RED));
			extenttest.fail(MarkupHelper.createLabel("Control is not found :", ExtentColor.BROWN));
			extenttest.error(throwable.fillInStackTrace());

			try {
				extenttest.addScreenCaptureFromPath(captureScreenShot(driver));
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (driver != null) {
				driver.quit();
			}
			break;

		case "PASS":
			extenttest.pass(MarkupHelper.createLabel("Test Case is Passed :", ExtentColor.GREEN));
			break;

		default:
			break;
		}

	}

	public static String captureScreenShot(WebDriver driver) throws IOException {


		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = "ScreenShots" + getcurrentdateandtime() + ".png";
		File target = new File(dest);

		FileUtils.copyFile(src, target);
		return dest;

	}

	private static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace("", "").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception e) {

		}
		return str;

	}
	}
