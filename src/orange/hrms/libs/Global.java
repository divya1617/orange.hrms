package orange.hrms.libs;

import org.openqa.selenium.WebDriver;

public class Global 
{
       //variables info 
	    public WebDriver driver;
		public String url = "https://opensource-demo.orangehrmlive.com/"; 
		public String un = "Admin"; 
		public String pw = "admin123"; 
		
		//objects
		public String txt_username = "txtUsername"; 
		public String txt_password = "txtPassword"; 
		public String btn_login = "Submit"; 
		public String btn_welcome= "//a[@id='welcome']";
		public String link_Logout ="//a[@href='/index.php/auth/logout']";
		public String link_pim ="//a[@id='menu_pim_viewPimModule']";
		public String btn_addemployee ="//a[@id='menu_pim_addEmployee']";
		public String txt_firstname = "firstName";
		public String txt_middlename="middleName";
		public String txt_lastname="lastName";
		public String txt_employeeid="employeeId";
		public String btn_save="btnSave";

	}


