package Operations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Excel.ExcelCode;
import Excel.ExcelWrite;
import Excel.ScreenShot;
import Execution.ExecuteTest;
import Repository.InspectElements;
import Repository.OpenBrowser;

public class LoginOperations extends ExcelCode {
	static String s;
	
	public static void AdminLoginPage(Logger log) throws Exception {
		
	 		InspectElements.adminbutton().click();
			ExcelCode.Code("Test Data For Admin Login", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
		for(int i=2;i<=sh.getLastRowNum();i++) {
			try{
				log.info("Enter into For");
				s=ExcelCode.RowColumn(i, 1);
		Thread.sleep(3000);
		InspectElements.UserName().sendKeys(s);
		s=ExcelCode.RowColumn(i, 2);
		Thread.sleep(3000);
		InspectElements.Password().sendKeys(s);
		InspectElements.Login().click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println(OpenBrowser.driver.getTitle());
		WebElement element=InspectElements.Constitutions();
		if(element.isDisplayed()) {
	        log.info("Enter into if");

        log.info("Login Completed Successfully");

        
   
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        ScreenShot.Screenshot(name);
        }else {
	        log.info("enter into else");
	        log.info("Content mismatch");

		}
		
			Thread.sleep(3000);
	       InspectElements.MenuBar().click();
			Thread.sleep(3000);
		InspectElements.MyProfilePage().click();
		Thread.sleep(3000);
		InspectElements.SignOut().click();
        log.info("Logout Completed Successfully");
	      
			}
			catch(Exception e) {
				InspectElements.UsernameORPassword().click();
				ExcelCode.Code("Test Data for Admin EditProfile", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
               s=ExcelCode.RowColumn(2, 4);
               
               Thread.sleep(3000);
               InspectElements.email1().sendKeys(s);
               Thread.sleep(4000);
               InspectElements.Submit1().click();
               System.out.println(OpenBrowser.driver.getCurrentUrl());
               break;
			}
	        log.info("Out Of Catch");
		//r.keyPress(KeyEvent.VK_TAB);
		//r.keyPress(KeyEvent.VK_ENTER);
		
	}
        log.info("End Of For");
		Thread.sleep(5000);
		
		}	
	
	public static void AddConstitution(Logger log) throws Exception {
		
		//InspectElements.adminbutton().click();
		ExcelCode.Code("Test Data For Admin Login", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
		s=ExcelCode.RowColumn(2, 1);
		Thread.sleep(3000);
		InspectElements.UserName().sendKeys(s);
		s=ExcelCode.RowColumn(2, 2);
		Thread.sleep(3000);
		InspectElements.Password().sendKeys(s);
		InspectElements.Login().click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		InspectElements.Constitutions().click();
		InspectElements.AddConstitutions().click();
		ExcelCode.Code("Test Data For Add Constitution", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
		for(int i=2;i<=sh.getLastRowNum();i++) {
			try{
				s=ExcelCode.RowColumn(i, 1);
			System.out.println("con  "+s);
			Thread.sleep(3000);
			WebElement element=InspectElements.ConstitutionName();
			if(element.isDisplayed()) {
		        log.info("Enter Constitution name");

			}else {
		        log.info("Stop Execution");

			}
			InspectElements.ConstitutionName().clear();
			InspectElements.ConstitutionName().click();
			Thread.sleep(3000);
			InspectElements.ConstitutionName().sendKeys(s);
			s=ExcelCode.RowColumn(i, 2);
			Thread.sleep(3000);    
			
	           InspectElements.FirstName().clear();
	           InspectElements.FirstName().click();
				Thread.sleep(3000);
           InspectElements.FirstName().sendKeys(s);
			s=ExcelCode.RowColumn(i, 3);
			Thread.sleep(3000);
			InspectElements.MiddleName().clear();
			InspectElements.MiddleName().sendKeys(s);
			s=ExcelCode.RowColumn(i, 4);
			Thread.sleep(3000);
			InspectElements.LastName().clear();
			InspectElements.LastName().sendKeys(s);
			s=ExcelCode.RowColumn(i, 5);
			Thread.sleep(3000);
            InspectElements. UserName1().clear();
            InspectElements. UserName1().sendKeys(s);
			s=ExcelCode.RowColumn(i, 6);
			Thread.sleep(3000);
			InspectElements.Password1().clear();
			InspectElements.Password1().sendKeys(s);
			s=ExcelCode.RowColumn(i, 7);
			Thread.sleep(3000);
            InspectElements.email().clear();
            InspectElements.email().sendKeys(s);
    		Thread.sleep(3000);
            InspectElements.Gender().click();
			s=ExcelCode.RowColumn(i, 9);
			Thread.sleep(3000);
			String s1=InspectElements.Mobile().getAttribute("onkeypress");
			if(s1.equalsIgnoreCase("return AllowNumbersOnly(event)"))
			{
				InspectElements.Mobile().clear();
				InspectElements.Mobile().sendKeys(s);
		        log.info("Accepting only numerics");
			}
			else
			{
		        log.info("Error Occured");

			}
				
			InspectElements.SubmitButton().click();
            InspectElements.OK().click();
	        log.info("Constitution Added Successfully");
            String name = new Object(){}.getClass().getEnclosingMethod().getName();
            ScreenShot.Screenshot(name);
			Thread.sleep(3000);
            InspectElements.Constitutions().click();
    		InspectElements.AddConstitutions().click();
	}catch(Exception e)
			{
        log.info(e);
	        }
		}
	}
	public static void ViewConstitutions(Logger log) throws Exception {
	    Thread.sleep(3000);
		InspectElements.Constitutions().click();
		InspectElements.ViewConstitutions().click();
		Thread.sleep(3000);
		WebElement element =InspectElements.ChechBox();
		if(element.isEnabled()) {
			InspectElements.ChechBox().click();
			InspectElements.Delete().click();	
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
	        log.info("Element Found And Row Deleted");
			String name = new Object(){}.getClass().getEnclosingMethod().getName();
		       ScreenShot.Screenshot(name);
		}else {
	        log.info("Content Mismatch");

		}
		/*InspectElements.SelectAllChechBox().click();
		InspectElements.Delete().click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Rows Deleted");*/
		Thread.sleep(3000);

		

	}
	public static void AddDivision(Logger log) throws Exception {
		/*InspectElements.adminbutton().click();
		ExcelCode.Code("Test Data For Admin Login", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
		
		s=ExcelCode.RowColumn(2, 1);
		Thread.sleep(3000);
		InspectElements.UserName().sendKeys(s);
		s=ExcelCode.RowColumn(2, 2);
		Thread.sleep(3000);
		InspectElements.Password().sendKeys(s);
		InspectElements.Login().click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);*/
		//Thread.sleep(3000);
		InspectElements.Divisions().click();
		Thread.sleep(3000);
		InspectElements.AddDivisions().click();
		ExcelCode.Code("Test Data For Add Division", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
		for(int i=2;i<=sh.getLastRowNum();i++) {

			try{
				WebElement element=InspectElements.ConstitutionName();
				element.click();
				Select sel=new Select(element);
				sel.selectByIndex(1);
				s=ExcelCode.RowColumn(i, 2);
				Thread.sleep(3000);    
				InspectElements.DivisionName().clear();
			
				InspectElements.DivisionName().sendKeys(s);
			s=ExcelCode.RowColumn(i, 3);
			Thread.sleep(3000);    
	           InspectElements.FirstName().clear();
	           //InspectElements.FirstName().click();
				Thread.sleep(3000);
           InspectElements.FirstName().sendKeys(s);
			s=ExcelCode.RowColumn(i, 4);
			Thread.sleep(3000);
			InspectElements.MiddleName().clear();
			InspectElements.MiddleName().sendKeys(s);
			s=ExcelCode.RowColumn(i, 5);
			Thread.sleep(3000);
			InspectElements.LastName().clear();
			InspectElements.LastName().sendKeys(s);
			s=ExcelCode.RowColumn(i, 6);
			Thread.sleep(3000);
            InspectElements. UserName1().clear();
            InspectElements. UserName1().sendKeys(s);
			s=ExcelCode.RowColumn(i, 7);
			Thread.sleep(3000);
			InspectElements.Password1().clear();
			InspectElements.Password1().sendKeys(s);
			s=ExcelCode.RowColumn(i, 8);
			Thread.sleep(3000);
            InspectElements.email().clear();
            InspectElements.email().sendKeys(s);
    		Thread.sleep(3000);
            InspectElements.Gender_D().click();
            s=ExcelCode.RowColumn(i, 10);
			Thread.sleep(3000);
			String s1=InspectElements.Mobile().getAttribute("onkeypress");
			if(s1.equalsIgnoreCase("return AllowNumbersOnly(event)"))
			{
				InspectElements.Mobile().clear();
				InspectElements.Mobile().sendKeys(s);
		        log.info("Accepting Only Numerics");
			}
			else
			{
		        log.info("Error Occured");
			}
			InspectElements.Submit_D().click();
			
			Thread.sleep(3000);
            InspectElements.OK().click();
	        log.info("Division Added SUccessfully");
            String name = new Object(){}.getClass().getEnclosingMethod().getName();
            ScreenShot.Screenshot(name);
			Thread.sleep(3000);
            InspectElements.DivisionAfterPositive().click();
    		InspectElements.AddDivisionAfterPositive().click();
			    
	}catch(Exception e) {
			
        log.info(e);
	        }
			
		
				
		}
	}
	public static void ViewDivisions(Logger log) throws Exception {
		/*InspectElements.adminbutton().click();
		ExcelCode.Code("Test Data For Admin Login", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
		
		s=ExcelCode.RowColumn(2, 1);
		Thread.sleep(3000);
		InspectElements.UserName().sendKeys(s);
		s=ExcelCode.RowColumn(2, 2);
		Thread.sleep(3000);
		InspectElements.Password().sendKeys(s);
		InspectElements.Login().click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);*/
		Thread.sleep(3000);
		//InspectElements.Divisions().click();
		InspectElements.ViewDivisionAfterPositive().click();
		Thread.sleep(3000);
		/*InspectElements.CheckBox_D().click();
		InspectElements.Delete_D().click();
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Single Row Deleted");
		Thread.sleep(3000);
		InspectElements.SelectAllCheckBox_D().click();
		InspectElements.Delete_D().click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Entire Rows Deleted");*/
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
       ScreenShot.Screenshot(name);
	}
	public static void EditAdmin(Logger log) throws Exception {

		/*InspectElements.adminbutton().click();
		ExcelCode.Code("Test Data For Admin Login", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
		s=ExcelCode.RowColumn(2, 1);
		Thread.sleep(3000);
		InspectElements.UserName().sendKeys(s);
		s=ExcelCode.RowColumn(2, 2);
		Thread.sleep(3000);
		InspectElements.Password().sendKeys(s);
		InspectElements.Login().click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);*/
		InspectElements.MyProfilePage1().click();
		InspectElements.AdminEdit1().click();
		ExcelCode.Code("Test Data for Admin EditProfile", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");

		for(int i=2;i<=sh.getLastRowNum();i++) {

			try{
				s=ExcelCode.RowColumn(i, 5);
				Thread.sleep(3000);
				InspectElements.Password1().clear();
				InspectElements.Password1().sendKeys(s);
				InspectElements.Submit_EditAdmin().click();
				Thread.sleep(3000);
			    InspectElements.Ok_EditAdmin().click();
		        log.info("Admin Edited Successfully");
			    String name = new Object(){}.getClass().getEnclosingMethod().getName();
			       ScreenShot.Screenshot(name);
				Thread.sleep(3000);
			    InspectElements.MyProfilePage().click();
				InspectElements.AdminEdit().click();
				InspectElements.Submit_EditAdmin1().click();
			    InspectElements.Ok_EditAdmin().click();

			}catch(Exception e) {
				System.out.println(e);
			}
		}
		InspectElements.MyProfilePage().click();
		InspectElements.SignOut().click();
		
	}
	public static void DivisionLogin(Logger log) throws Exception {
		InspectElements.BackToMainPage().click();
		InspectElements.DivisionLogin_D().click();
		InspectElements.UserName().sendKeys("mallela.sadanand@gmail.com");
		InspectElements.Password().sendKeys("Mallela.7sada");
		InspectElements.Login_D().click();
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
        log.info("Division Login Completed");
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
	       ScreenShot.Screenshot(name);
			Thread.sleep(3000);

	}
	public static void AddProblem(Logger log) throws Exception {
		InspectElements.Addproblem_D().click();
		ExcelCode.Code("Test Data For Add Problem", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");

		for(int i=2;i<=sh.getLastRowNum();i++) {

			try{
		/*WebElement element=InspectElements.ConstitutionName();
		element.click();
		Select sel=new Select(element);
		sel.selectByIndex(1);
		WebElement element1=InspectElements.DivisionName();
		Select sel1=new Select(element1);
		sel.selectByIndex(1);*/
		s=ExcelCode.RowColumn(i, 3);
		Thread.sleep(3000);    
        InspectElements.FirstName().click();

           InspectElements.FirstName().clear();
			Thread.sleep(3000);
       InspectElements.FirstName().sendKeys(s);
		s=ExcelCode.RowColumn(i, 4);
		Thread.sleep(3000);
		InspectElements.MiddleName().clear();
		InspectElements.MiddleName().sendKeys(s);
		s=ExcelCode.RowColumn(i, 5);
		Thread.sleep(3000);
		InspectElements.LastName().clear();
		InspectElements.LastName().sendKeys(s);
		InspectElements.Gender_AddProblem().click();
		Thread.sleep(3000);
		s=ExcelCode.RowColumn(i, 6);
		Thread.sleep(3000);
        InspectElements.email().clear();
        InspectElements.email().sendKeys(s);
        s=ExcelCode.RowColumn(i, 8);
		Thread.sleep(3000);
		InspectElements.Mobile_D().clear();
		InspectElements.Mobile_D().sendKeys(s);
		WebElement element=InspectElements.ProblemType();
		//element.click();
		Select sel=new Select(element);
		sel.selectByIndex(1);
		s=ExcelCode.RowColumn(i, 10);
		Thread.sleep(3000);
		InspectElements.EnterProblem().clear();
		InspectElements.EnterProblem().sendKeys(s);
        InspectElements.Submit_AddProblem().click();
		Thread.sleep(3000);
		InspectElements.Ok_AddProblemSuccess().click();
        log.info("Problem Added Successfully");
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
	       ScreenShot.Screenshot(name);
		Thread.sleep(3000);
		InspectElements.Addproblem_D().click();

	}catch(Exception e) {
        log.info(e);

	}
		}
	}
	public static void ViewProblemsAndEditProblem(Logger log) throws Exception {
		InspectElements.ViewProblem_D().click();
		InspectElements.Edit_ViewProblem().click();
		ExcelCode.Code("Test Data For Edit Add Problem", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");

		for(int i=2;i<=sh.getLastRowNum();i++) {

			try{
				
				s=ExcelCode.RowColumn(i, 8);
				Thread.sleep(3000);
				InspectElements.Mobile_D().clear();
				InspectElements.Mobile_D().sendKeys(s);
				InspectElements.Submit_EditProblem().click();
		        log.info("Problem Edited Successfully");
				String name = new Object(){}.getClass().getEnclosingMethod().getName();
			       ScreenShot.Screenshot(name);
				Thread.sleep(4000);
				InspectElements.Edit_ViewProblem().click();
			}catch(Exception e){
		        log.info(e);
			}
			
	}
		InspectElements.MyProfilePage().click();
		InspectElements.SignOut().click();
		   
	}

public static void ConstitutionLogin(Logger log) throws Exception {
	InspectElements.BackToMainPageAfter_D_Login().click();
		 InspectElements.ConstitutionLoginButton().click();
		 InspectElements.UserName().sendKeys("mallela.sadanand@gmail.com");
		 InspectElements.Password().sendKeys("Jon.7Sada");
		 InspectElements.Login_C().click();
		 Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
	        log.info("Constitution Login Successfully");
			String name = new Object(){}.getClass().getEnclosingMethod().getName();
		       ScreenShot.Screenshot(name);
	Thread.sleep(3000);
}
public static void ConstitutionHomePage(Logger log) throws Exception {
	/*InspectElements.ViewProblem_C().click();
	Thread.sleep(3000);
	InspectElements.Delete_ViewProblem().click();
	System.out.println("ProblrmDeleted Successfully");
      InspectElements.Back_Viewproblem_c().click();*/
      InspectElements.ViewDivisions_C().click();
      Thread.sleep(3000);
      InspectElements.problems_C().click();
      InspectElements.PendingProblems().click();
      InspectElements.Approve_PendingProblem().click();
      Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
        log.info("Problem Approved");
      Thread.sleep(3000);
      InspectElements.Ok_AddProblemSuccess().click();
      Thread.sleep(3000);
      InspectElements.SuccessProblems().click();
      Thread.sleep(3000);
      InspectElements.MyProfilePage().click();
      InspectElements.SignOut().click();
      String name = new Object(){}.getClass().getEnclosingMethod().getName();
      ScreenShot.Screenshot(name);
      log.info("Logout Successfully Completed");

  	Thread.sleep(3000);
}
public static void Constitution_Home(Logger log) throws Exception {
	//InspectElements.BackToMainPageAfter_D_Login().click();
	InspectElements.adminbutton().click();
	ExcelCode.Code("Test Data For Admin Login", "D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx");
	s=ExcelCode.RowColumn(2, 1);
	Thread.sleep(3000);
	InspectElements.UserName().sendKeys(s);
	s=ExcelCode.RowColumn(2, 2);
	Thread.sleep(3000);
	InspectElements.Password().sendKeys(s);
	InspectElements.Login().click();
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);

	InspectElements.MoreInfo().click();
	Thread.sleep(3000);
	InspectElements.MoreInfo1().click();
	Thread.sleep(3000);
	InspectElements.Back1().click();
	Thread.sleep(3000);
	InspectElements.Back().click();
	Thread.sleep(3000);
    log.info("More info checked successfully");
	String name = new Object(){}.getClass().getEnclosingMethod().getName();
    ScreenShot.Screenshot(name);
    InspectElements.MenuBar().click();
    InspectElements.MyProfilePage().click();
    InspectElements.SignOut().click();
    Thread.sleep(3000);
    //ExcelCode.Write("D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx", "Test Data For Admin Login",6,2, "PASS");
   ExcelCode.Write("D:\\Sadanandam_Projects\\Sadanandam_BJPProject_TestCases.xlsx", 4, 3, "pass");
	Thread.sleep(3000);
    
}
	
}


	
	
	

	
        

	
	
	
	
	

