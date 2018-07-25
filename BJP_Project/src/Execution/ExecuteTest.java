package Execution;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import Operations.LoginOperations;
import Repository.OpenBrowser;

public class ExecuteTest {

	@Test
	public void Execution()  throws Exception {
		Logger log=Logger.getLogger(ExecuteTest.class);
		PropertyConfigurator.configure("D:\\Sadanandam_Projects\\log4j.properties.txt");
		OpenBrowser.browser();
		OpenBrowser.WindowMaximize();
		OpenBrowser.LoginPageURL();
		/*LoginOperations.AdminLoginPage(log);
		LoginOperations.AddConstitution(log);
		LoginOperations.ViewConstitutions(log);
		LoginOperations.AddDivision(log);
		LoginOperations.ViewDivisions(log);
		LoginOperations.EditAdmin(log);
		LoginOperations.DivisionLogin(log);
		 LoginOperations.AddProblem(log);
		LoginOperations.ViewProblemsAndEditProblem(log);
		LoginOperations.ConstitutionLogin(log);
		LoginOperations.ConstitutionHomePage(log);*/
		LoginOperations.Constitution_Home(log);
		OpenBrowser.CloseApplication();

}
}
