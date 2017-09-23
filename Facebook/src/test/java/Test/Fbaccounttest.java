package Test;


import Base.CommonAPI;
import Homepage.FbAccount;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Fbaccounttest extends CommonAPI {

    @Test(priority = 1)
    public void registerNewUser() {
      FbAccount fbHome = PageFactory.initElements(driver, FbAccount.class);
        fbHome.setFirstName();
    }

    @Test(priority = 2)
    public void inputlastname() {
        FbAccount fbHome = PageFactory.initElements(driver,  FbAccount.class);
        fbHome.setLastName();
    }

    @Test(priority = 3)
    public void inputemail() {
        FbAccount fbHome = PageFactory.initElements(driver,  FbAccount.class);
        fbHome.setEmail();
    }

    @Test(priority = 4)
    public void month() {
        FbAccount fbHome = PageFactory.initElements(driver,  FbAccount.class);
        fbHome.setSelectMonth();
    }

    @Test(priority = 5)
    public void days() {
        FbAccount fbHome = PageFactory.initElements(driver, FbAccount.class);
        fbHome.setDay();
    }

    @Test(priority = 6)
    public void year() {
        FbAccount fbHome = PageFactory.initElements(driver, FbAccount.class);
        fbHome.setyear();
    }

    @Test(priority = 7)
    public void male() {
        FbAccount fbHome = PageFactory.initElements(driver,  FbAccount.class);
        fbHome.male();
    }

    @Test(priority = 8)
    public void female() {
        FbAccount fbHome = PageFactory.initElements(driver, FbAccount.class);
        fbHome.female();
    }

    @Test(priority = 9)
    public void createaccount() {
        FbAccount fbHome = PageFactory.initElements(driver,  FbAccount.class);
        fbHome.createaccount();
    }
}