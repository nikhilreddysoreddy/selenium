package packageNG;

import org.testng.annotations.Test;

public class program1 {
  @Test(priority=1)
  public void opening_delivery() {
	  System.out.println("APPLICATION SUCCESSFULLY EXECUTED");
  }
  @Test(priority=3)
  public void customer_details() {
	  System.out.println("CUSTOMER DETAILS UPDATED");
  }
  @Test(priority=5)
  public void productdetils() {
	  System.out.println("PRODUCT IS UPDATED");
  }
  @Test(priority=2)
  public void paymentdetails() {
	  System.out.println("payment updated");
  }
  @Test(enabled=false)
  public void feedback() {
	  System.out.println("ORDER DELIVERED");
  }
  @Test(enabled=false)
  public void logoff() {
	  System.out.println("APPLICATION CLOSED");
  }
}
