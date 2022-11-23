package amazon;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class operations extends login{
  @Test(priority=2)
  public void geturl() {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=3)
  public void dropdown() {
	  WebElement drop=d.findElement(By.id("searchDropdownBox"));
	  List<WebElement>a=drop.findElements(By.tagName("option"));
	  for(int i=0;i<a.size();i++) {
		  System.out.println(a.get(i).getText());
	  }
  }
  public void screenshot() throws IOException {
	  File a=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(a,new File("c://new6.png"));
  }
}
