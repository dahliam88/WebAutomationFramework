package Test;

import Base.CommonAPI;
import Homepage.FBdiff;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FBdifftest extends CommonAPI {

    @Test(priority = 1)
    public void espaniol(){
        FBdiff fbdif = PageFactory.initElements(driver, FBdiff.class);
        fbdif.clickespaniol();
        waitTime();
    }

    private void waitTime() {
    }

    @Test(priority = 2)
    public void Arabic(){
        FBdiff fBdiff = PageFactory.initElements(driver, FBdiff.class);
        fBdiff.clickArabic();
        waitTime();
    }
    @Test(priority = 3)
    public void Showmorelanguage(){
        FBdiff fBdiff = PageFactory.initElements(driver, FBdiff.class);
        fBdiff.MoreSign();
        waitTime();
    }
    @Test(priority = 4)
    public void morehelp(){
        FBdiff fBdiff = PageFactory.initElements(driver, FBdiff.class);
        fBdiff.morehelp();
        waitTime();
    }
    @Test(priority = 5)
    public void setting() {
        FBdiff fBdiff = PageFactory.initElements(driver, FBdiff.class);
        fBdiff.setting();
        waitTime();
    }
    @Test(priority = 6)
    public void forgetaccount(){
        FBdiff fBdiff = PageFactory.initElements(driver, FBdiff.class);
        fBdiff.fgact();
        waitTime();
    }
    @Test(priority = 7)
    public void navigatorbar(){
        FBdiff fBdiff = PageFactory.initElements(driver, FBdiff.class);
        fBdiff.clickNaviagtorbar();
        waitTime();
    }
}
