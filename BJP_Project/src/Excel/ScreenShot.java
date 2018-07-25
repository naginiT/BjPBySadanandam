package Excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Repository.OpenBrowser;

public class ScreenShot extends OpenBrowser{

	public static void Screenshot(String name) throws IOException {
		TakesScreenshot shot=((TakesScreenshot)driver);
		File f = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Sadanandam_Projects\\screenshots\\"+name+".png"));
	}
}
