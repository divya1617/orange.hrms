package orange.hrms.libs1;



import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import orange.hrms.libs.General;

public class Tc0001   {
   // TODO Auto-generated method stub
		//public static void main(String args[]) throws Exception {  
	@Test
	public void Tc0001() throws Exception {
		    DOMConfigurator.configure("log4j.xml");
			General g = new General();       
			//test case steps  
			g.openapplication();
		    g.login();
			g.Logout();
			g.closebrowser();
		}

	}


