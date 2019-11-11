package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 extends ClassP{

  
  @Test(priority=1)
  public void verifyYahoo() {
	  driver.get("https://in.yahoo.com/");
	  String pagetitle = driver.getTitle();
	  Assert.assertEquals(pagetitle, "Yahoo");
	   }
  @Test(priority=2)
  public void verifyGcrit() {
	  driver.get("http://www.gcrit.com/build3/admin/login.php");
	  String pagetitle = driver.getTitle();
	  Assert.assertEquals(pagetitle, "GCR Shop");
	   }
    @Test(priority=3)
  public void verifyGoogle() {
	  driver.get("https://www.google.com/");
	  String pagetitle = driver.getTitle();
	  Assert.assertEquals(pagetitle, "Google");
	   }

}
