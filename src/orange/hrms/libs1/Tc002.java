package orange.hrms.libs1;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import orange.hrms.libs.General;

public class Tc002 {
	@Test
	  public void Tc002()  throws Exception   {
	// TODO Auto-generated method stub
			//public static void main(String args[]) throws Exception {  
		        DOMConfigurator.configure("log4j.xml");
				General g = new General();       
				//test case steps  
				g.openapplication(); 
			    g.login(); 
			    g.addemp();
                g.Logout();
                g.closebrowser();
}
}