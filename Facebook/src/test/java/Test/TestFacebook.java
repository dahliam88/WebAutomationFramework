package Test;

import Base.CommonAPI;
import Homepage.FacebookHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFacebook extends CommonAPI {

    @Test(priority = 1)
    public void verifyTitle (){
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Facebook"));
        System.out.println("We are on the right page. Title is: "+driver.getTitle());
    }
    @Test(priority = 2)
    public void createPage () {
        FacebookHome fbHome = PageFactory.initElements(driver, FacebookHome.class);
        fbHome.createCelebrityPage();
    }
    @Test(priority = 3)
    public void navigateB () {
        FacebookHome fbHome = PageFactory.initElements(driver, FacebookHome.class);
        fbHome.navigateBack();
    }
    @Test(priority = 4)
    public void loginFB(){
        FacebookHome fbHome = PageFactory.initElements(driver, FacebookHome.class);
        fbHome.loginFB("sami@yahoo.com","sami786");
    }
}
