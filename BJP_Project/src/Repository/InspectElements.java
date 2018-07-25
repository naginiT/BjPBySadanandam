package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InspectElements extends OpenBrowser{
	//AdminLogin
    static By AdminButton=By.xpath("/html/body/div[1]/div/div/div[1]/div/button/b/a");
    static By user=By.name("username");
    static By pswd=By.name("password");
    static By LoginButton=By.xpath("/html/body/div[2]/div/div/form/div[3]/button"); 
    static By menubar=By.xpath("/html/body/div/header/b/nav/a");
    static By moreinfo=By.xpath("/html/body/div/b/div[1]/section/div[1]/div[1]/div/div[3]/a/font");
    static By moreinfo1=By.xpath("/html/body/div/b/div[1]/section/div[1]/div/div/div[3]/a[1]/font");
    static By back=By.cssSelector("body > div > b > div.content-wrapper > section > div:nth-child(1) > div > div > div.small-box-footer > a:nth-child(2) > font");
    static By back1=By.xpath("/html/body/div/b/div[1]/form/button");
    //ForgotUsernameORPassword
    static By UsernameORpassword=By.xpath("/html/body/div/div/div/form/div[6]/a");
    static By backToMainPage=By.xpath("/html/body/div[2]/div/div/form/div[5]/a");
    static By email1  =By.name("email");
    static By submit1=By.xpath("/html/body/form/input[2]");
    static By backToMainPageAfter_D_Login=By.xpath("/html/body/div/div/div/form/div[5]/a");
        
    //MyProfilePage
    static By  MyProfilePage=By.cssSelector("body > div > header > b > nav > div > ul > li > a > span");
    static By  Signout=By.cssSelector("body > div > header > b > nav > div > ul > li > ul > li.user-footer > div.pull-right > a");
    static By  AdminEdit=By.xpath("/html/body/div/header/b/nav/div/ul/li/ul/li[3]/div[1]/a");
    static By  Submit_EditAdmin=By.xpath("/html/body/div/b/div[1]/div/div/form/div[9]/div/button");
    static By  Submit_EditAdmin1=By.xpath(" /html/body/div/b/div[1]/div/div/form/div[9]/div/button");
               
    static By  Ok_EditAdmin=By.xpath("/html/body/div[2]/div/div[10]/button[1]");
    static By  MyProfilePage1=By.cssSelector("body > div > header > nav > div > ul > li > a > img");
    static By  AdminEdit1=By.xpath("/html/body/div/header/nav/div/ul/li/ul/li[2]/div[1]/a");
 
    //AdminHomePage
    static By constitution=By.xpath("/html/body/div/b/aside/section/ul/li[2]/a");
    static By AddConstitution=By.cssSelector("body > div > b > aside > section > ul > li.treeview.menu-open > ul > li.active > a");
    static By viewconstitution=By.xpath("/html/body/div/b/aside/section/ul/li[2]/ul/li[2]/a");
    static By Divisions=By.xpath("/html/body/div/aside/section/ul/li[3]/a/span[1]");
    static By AddDivisions=By.cssSelector("body > div > aside > section > ul > li.treeview.menu-open > ul > li.active > a");
    static By viewdivisions=By.cssSelector("body > div > b > aside > section > ul > li.treeview.menu-open > ul > li:nth-child(2) > a");
    static By DivisionsAfterPositive=By.xpath("/html/body/div/b/aside/section/ul/li[3]/a/span[1]");
    static By AddDivisionsAfterPositive=By.xpath("/html/body/div/b/aside/section/ul/li[3]/ul/li[1]/a");
    static By ViewDivisionsAfterPositive=By.xpath("/html/body/div/b/aside/section/ul/li[3]/ul/li[2]/a");

    //AddConstitutions
    static By constitutionname=By.name("constitution");
    static By Firstname=By.name("firstname");
    static By middlename=By.name("middlename");
    static By lastname=By.name("lastname");
    static By username=By.name("username");
    static By password=By.name("password");
    static By email=By.name("email");
    static By gender=By.xpath("/html/body/div/b/div/div/div/form/div[8]/div/div/div[2]/label/input");
    static By gender_D=By.xpath("/html/body/div/b/div/div/div/form/div[9]/div/div/div[2]/label/input");

    static By mobile=By.xpath("//*[@id=\"phone\"]");
    static By submit=By.xpath("/html/body/div/b/div/div/div/form/div[11]/div/button");
    static By OK=By.xpath("/html/body/div[2]/div/div[10]/button[1]");
    //ViewConstitutions 
    static By CheckBox=By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]/div/ins");
    static By SelectAllCheckBox=By.cssSelector("#customers > tbody > tr:nth-child(1) > th:nth-child(1) > div > button > i");
    static By Delete=By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th[1]/div/div/button/i");
    
   // AddDivisions
    static By DivisionName=By.name("division");
    static By HomePageOfDivision=By.xpath("/html/body/div/b/div/div/div");
    static By mobile_D=By.name("mobile");
    static By submit_D=By.xpath("/html/body/div/b/div/div/div/form/div[12]/div/button");
 
    //ViewDivisions
    static By checkbox_D=By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]/div/ins");
    static By selectallcheckbox_D=By.cssSelector("#customers > tbody > tr:nth-child(1) > th:nth-child(1) > div > button > i");
    static By delete_D=By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th[1]/div/div/button/i");
    

    //DivisionLogin
    static By Divisionloginbtn=By.xpath("/html/body/div[1]/div/div/div[3]/div/button/b/a");
    static By loginbtn_D=By.xpath("/html/body/div/div/div/form/div[3]/button");
    
    //DivisionHomePage
     
    static By AddProblem=By.xpath("/html/body/div/b/aside/section/ul/li[2]/a/span[1]");
    static By ViewProblem=By.xpath("/html/body/div/b/aside/section/ul/li[3]/a/span[1]");
    
    //AddProblem
    static By gender_AddProblem=By.xpath("/html/body/div/b/div/div/div/form/div[6]/div/div/div[2]/label/input");
    static By problemtype=By.name("problemtype");
    static By enterproblem=By.id("comment");
    static By submit_addproblem=By.xpath("/html/body/div/b/div/div/div/form/div[12]/div/button");
    static By ok_addproblemsuccess=By.xpath("/html/body/div[2]/div/div[10]/button[1]");
    
    //ViewProblems
    static By EditBtn_Viewproblem=By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[6]/button/a");
    static By submit_editproblem=By.xpath("/html/body/div/b/div[1]/div/div/form/div[10]/div/button");
    
    //ConstitutionLogin
    static By ConstitutionLoginbtn=By.xpath("/html/body/div[1]/div/div/div[2]/div/button/span/b/a");
    static By Login_C=By.xpath("/html/body/div/div/div/form/div[3]/button");
    
    //ConstitutionHomePage
    static By viewproblem=By.xpath("/html/body/div/b/div[1]/section/div/div/div[1]/div[3]/div/a/font");
    static By Delete_viewproblem=By.cssSelector("body > div > div.content-wrapper > section > div > div > div > div.box-body.table-responsive.no-padding > table > tbody > tr:nth-child(2) > td:nth-child(6) > form > button > span");
    static By back_c=By.xpath("/html/body/div/div[1]/section/form/button");
    static By ViewDivisions_C=By.xpath("/html/body/div/b/aside/section/ul/li[2]/a/span[1]");
    static By problems=By.cssSelector("body > div > b > aside > section > ul > li.treeview > a > span:nth-child(2)");
    static By pendingproblems=By.xpath("/html/body/div/b/aside/section/ul/li[3]/ul/li[1]/a");
    static By successproblems=By.xpath("/html/body/div/b/aside/section/ul/li[3]/ul/li[2]/a");
    static By Approve=By.xpath("/html/body/div/b/div/section/div/div/div/div[2]/table/tbody/tr[2]/td[5]/form/button/span");
    static By Ok_Approve=By.xpath("/html/body/div[2]/div/div[10]/button[1]");
    
    //AdminLoginMethods
    
    public static WebElement adminbutton() {
    	
    	return driver.findElement(AdminButton);
    	
    }
 public static WebElement UserName() {
    	
    	return driver.findElement(user);
    	
    }
 public static WebElement Password() {
 	
 	return driver.findElement(pswd);
 	
 }
 public static WebElement Login() {
 	
 	return driver.findElement(LoginButton);
 	
 }
 public static WebElement MenuBar() {
	 	
	 	return driver.findElement(menubar);
	 	
	 }
 public static WebElement MoreInfo() {
	 	
	 	return driver.findElement(moreinfo);
	 	
	 }
 public static WebElement MoreInfo1() {
	 	
	 	return driver.findElement(moreinfo1);
	 	
	 }
 public static WebElement Back() {
	 	
	 	return driver.findElement(back);
	 	
	 }
 public static WebElement Back1() {
	 	
	 	return driver.findElement(back1);
	 	
	 }
 
 //ForgotUsernameORPassword
 public static WebElement UsernameORPassword() {
	 	
	 	return driver.findElement(UsernameORpassword);
	 	
	 }
	 public static WebElement BackToMainPage() {
		 	
		 	return driver.findElement(backToMainPage);
		 	
		 }
	 public static WebElement BackToMainPageAfter_D_Login() {
		 	
		 	return driver.findElement(backToMainPageAfter_D_Login);
		 	
		 }
	 public static WebElement email1() {
		 	
		 	return driver.findElement(email1);
		 	
		 }
	 public static WebElement Submit1() {
		 	
		 	return driver.findElement(submit1);
		 	
		 }
 
 //MyProfilePage
 
 public static WebElement MyProfilePage() {
	 	
	 	return driver.findElement(MyProfilePage);
	 	
	 }
 public static WebElement MyProfilePage1() {
	 	
	 	return driver.findElement(MyProfilePage1);
	 	
	 }
 public static WebElement SignOut() {
	 	
	 	return driver.findElement(Signout);
	 	
	 }
 public static WebElement AdminEdit() {
	 	
	 	return driver.findElement(AdminEdit);
	 	
	 }
 public static WebElement AdminEdit1() {
	 	
	 	return driver.findElement(AdminEdit1);
	 	
	 }
 public static WebElement Submit_EditAdmin() {
	 	
	 	return driver.findElement(Submit_EditAdmin);
	 	
	 }
 public static WebElement Submit_EditAdmin1() {
	 	
	 	return driver.findElement(Submit_EditAdmin1);
	 	
	 }
 public static WebElement Ok_EditAdmin() {
	 	
	 	return driver.findElement(Ok_EditAdmin);
	 	
	 }

 
 //AdminHomePage methods
 public static WebElement Constitutions() {
	 	
	 	return driver.findElement(constitution);
	 	
	 }
 public static WebElement AddConstitutions() {
	 	
	 	return driver.findElement(AddConstitution);
	 	
	 }
 public static WebElement ViewConstitutions() {
	 	
	 	return driver.findElement(viewconstitution);
	 	
	 }
 public static WebElement Divisions() {
	 	
	 	return driver.findElement(Divisions);
	 	
	 }
 public static WebElement DivisionAfterPositive() {
	 	
	 	return driver.findElement(DivisionsAfterPositive);
	 	
	 }
 public static WebElement AddDivisionAfterPositive() {
	 	
	 	return driver.findElement(AddDivisionsAfterPositive);
	 	
	 }
 public static WebElement ViewDivisionAfterPositive() {
	 	
	 	return driver.findElement(ViewDivisionsAfterPositive);
	 	
	 }
 public static WebElement AddDivisions() {
	 	
	 	return driver.findElement(AddDivisions);
	 	
	 }
 public static WebElement ViewDivisions() {
	 	
	 	return driver.findElement(viewdivisions);
	 	
	 }

 //AddConstitutions Methods
 public static WebElement ConstitutionName() {
	 	
	 	return driver.findElement(constitutionname);
	 	
	 }
 public static WebElement FirstName() {
	 	
	 	return driver.findElement(Firstname);
	 	
	 }
 public static WebElement MiddleName() {
	 	
	 	return driver.findElement(middlename);
	 	
	 }
 public static WebElement LastName() {
	 	
	 	return driver.findElement(lastname);
	 	
	 }
 public static WebElement UserName1() {
	 	
	 	return driver.findElement(username);
	 	
	 }
 public static WebElement Password1() {
	 	
	 	return driver.findElement(password);
	 	
	 }
 public static WebElement email() {
	 	
	 	return driver.findElement(email);
	 	
	 }
 public static WebElement Gender() {
	 	
	 	return driver.findElement(gender);
	 	
	 }
 public static WebElement Mobile() {
	 	
	 	return driver.findElement(mobile);
	 	
	 }
 public static WebElement SubmitButton() {
	 	
	 	return driver.findElement(submit);
	 	
	 }
 public static WebElement OK() {
	 	
	 	return driver.findElement(OK);
	 	
	 }

 //ViewConstitutions
 public static WebElement ChechBox() {
	 	
	 	return driver.findElement(CheckBox);
	 	
	 }
 public static WebElement SelectAllChechBox() {
	 	
	 	return driver.findElement(SelectAllCheckBox);
	 	
	 }

 public static WebElement Delete() {
	 	
	 	return driver.findElement(Delete);
	 	
	 }
 
 //ADdDivisions
 
 public static WebElement DivisionName() {
	 	
	 	return driver.findElement(DivisionName);
	 	
	 }
 public static WebElement HomePageDivision() {
	 	
	 	return driver.findElement(HomePageOfDivision);
	 	
	 }
 public static WebElement Gender_D() {
	 	
	 	return driver.findElement(gender_D);
	 	
	 }
 public static WebElement Mobile_D() {
	 	
	 	return driver.findElement(mobile_D);
	 	
	 }
 public static WebElement Submit_D() {
	 	
	 	return driver.findElement(submit_D);
	 	
	 }
 
 //ViewDivisions
 public static WebElement CheckBox_D() {
	 	
	 	return driver.findElement(checkbox_D);
	 	
	 }
 public static WebElement SelectAllCheckBox_D() {
	 	
	 	return driver.findElement(selectallcheckbox_D);
	 	
	 }
 public static WebElement Delete_D() {
	 	
	 	return driver.findElement(delete_D);
	 	
	 }
 
  //DivisionLogin
 
 public static WebElement DivisionLogin_D() {
	 	
	 	return driver.findElement(Divisionloginbtn);
	 	
	 }
 public static WebElement Login_D() {
	 	
	 	return driver.findElement(loginbtn_D);
	 	
	 }
 
 //DivisionHomePage
 public static WebElement Addproblem_D() {
	 	
	 	return driver.findElement(AddProblem);
	 	
	 }
 public static WebElement ViewProblem_D() {
	 	
	 	return driver.findElement(ViewProblem);
	 	
	 }
 
 
 //Add Problem
 public static WebElement Gender_AddProblem() {
	 	
	 	return driver.findElement(gender_AddProblem);
	 	
	 }
 public static WebElement ProblemType() {
	 	
	 	return driver.findElement(problemtype);
	 	
	 }
 public static WebElement EnterProblem() {
	 	
	 	return driver.findElement(enterproblem);
	 	
	 }
 public static WebElement Submit_AddProblem() {
	 	
	 	return driver.findElement(submit_addproblem);
	 	
	 }
 public static WebElement Ok_AddProblemSuccess() {
	 	
	 	return driver.findElement(ok_addproblemsuccess);
	 	
	 }


 //ViewProblem
 public static WebElement Edit_ViewProblem() {
	 	
	 	return driver.findElement(EditBtn_Viewproblem);
	 	
	 }
 public static WebElement Submit_EditProblem() {
	 	
	 	return driver.findElement(submit_editproblem);
	 	
	 }
 
 //ConstitutionLogin
 public static WebElement ConstitutionLoginButton() {
	 	
	 	return driver.findElement(ConstitutionLoginbtn);
	 	
	 }
 public static WebElement Login_C() {
	 	
	 	return driver.findElement(Login_C);
	 	
	 }
 
 
 //ConstitutionHomePage
 
 public static WebElement ViewProblem_C() {
	 	
	 	return driver.findElement(viewproblem);
	 	
	 }
 public static WebElement Delete_ViewProblem() {
	 	
	 	return driver.findElement(Delete_viewproblem);
	 	
	 }
 public static WebElement Back_Viewproblem_c() {
	 	
	 	return driver.findElement(back_c);
	 	
	 }
 public static WebElement ViewDivisions_C() {
	 	
	 	return driver.findElement(ViewDivisions_C);
	 	
	 }
 public static WebElement problems_C() {
	 	
	 	return driver.findElement(problems);
	 	
	 }
 public static WebElement PendingProblems() {
	 	
	 	return driver.findElement(pendingproblems);
	 	
	 }
 public static WebElement SuccessProblems() {
	 	
	 	return driver.findElement(successproblems);
	 	
	 }
 public static WebElement Approve_PendingProblem() {
	 	
	 	return driver.findElement(Approve);
	 	
	 }
 public static WebElement Ok_ProblemApproved() {
	 	
	 	return driver.findElement(Ok_Approve);
	 	
	 }









 



 






 
 
 
 
    



	


}
