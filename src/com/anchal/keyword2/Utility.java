package com.anchal.keyword2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	
	public static void captureScreenshot(WebDriver driver, String screenshotname)
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Src = ts.getScreenshotAs(OutputType.FILE); 
		try {
			FileUtils.copyFile(Src, new File("./Screenshots/"+screenshotname+".png" ));
			System.out.println("screenshot taken");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
