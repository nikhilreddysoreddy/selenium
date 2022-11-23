package amazon;

import org.testng.annotations.AfterTest;

public class close extends operations{
  @AfterTest
  public void close3() {
	  d.close();
	  
  }
}
