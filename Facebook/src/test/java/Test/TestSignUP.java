package Test;

import Base.CommonAPI;
import Homepage.FbSignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestSignUP extends CommonAPI {

    @Test(priority = 1)
    public void registerNewUser() {
      FbSignUp fbHome = PageFactory.initElements(driver, FbSignUp.class);
        fbHome.setFirstName();
    }

    @Test(priority = 2)
    public void inputlastname() {
        FbSignUp fbHome = PageFactory.initElements(driver, FbSignUp.class);
        fbHome.setLastName();
    }

    @Test(priority = 3)
    public void inputemail() {
        FbSignUp fbHome = PageFactory.initElements(driver, FbSignUp.class);
        fbHome.setEmail();
    }
    @Test(priority = 4)
    public void inputReEmail(){
        FbSignUp fbhome = PageFactory.initElements(driver, FbSignUp.class);
        fbhome.setReEmail();
    }
    @Test(priority = 5)
    public void password(){
        FbSignUp fbhome = PageFactory.initElements(driver, FbSignUp.class);
        fbhome.setPassword();
    }
    @Test(priority = 6)
    public void month() {
        FbSignUp fbHome = PageFactory.initElements(driver, FbSignUp.class);
        fbHome.setSelectMonth();
    }

    @Test(priority = 7)
    public void days() {
        FbSignUp fbHome = PageFactory.initElements(driver, FbSignUp.class);
        fbHome.setDay();
    }

    @Test(priority = 8)
    public void year() {
        FbSignUp fbHome = PageFactory.initElements(driver, FbSignUp.class);
        fbHome.setyear();
    }
    @Test(priority = 9)
    public void female() {
        FbSignUp fbHome = PageFactory.initElements(driver, FbSignUp.class);
        fbHome.female();
    }

    @Test(priority = 10)
    public void createaccount() {
        FbSignUp fbHome = PageFactory.initElements(driver, FbSignUp.class);
        fbHome.createaccount();
    }
}
