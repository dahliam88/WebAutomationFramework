package Homepage;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class Login extends CommonAPI {

    @Test
    public void inputuserid() {
       searchByCSS("#usernameMasked","sumaira7@citibank.com");
    }
    @Test
   public void inputpassword(){
        searchByCSS("#password" ,"12345Abc");
    }
    @Test
    public void clickSignin(){
       clickbuttonbyCSS("#signInBtn");
    }
    @Test
    public void clickforgotid(){
        clickbuttonbyXpath(".//*[@id='RequestUserIDReminder']");
    }
    @Test
    public void clickactivatecard(){
        clickbuttonbyCSS("#activate_card");
    }
    @Test
    public void clickforgotpas(){
        clickbuttonbyXpath(".//*[@id='RequestUserIDReminder-mobile']");
    }
    @Test
    public void clickregisterdonline(){
        clickbuttonbyXpath(".//*[@id='register_acc']");
    }
    @Test
    public void checkfacebookbutton(){
        clickbuttonbyXpath(".//*[@id='feedbackLink']");
    }
    @Test
    public void learnbutton(){
        clickbuttonbyXpath(".//*[@id='module-container']/section[1]/div/div/div/div/div[2]/div/a");
    }
    @Test
    public void getstatrted(){
        clickbuttonbyXpath(".//*[@id='module-container']/section[2]/div/div/div/div/div[2]/div/a");
    }
    @Test
    public void alertblock(){
        clickbuttonbyCSS(".row");
    }
    @Test
    public void openacount(){
        clickbuttonbyCSS(".pull-right>li>a");
    }

}
