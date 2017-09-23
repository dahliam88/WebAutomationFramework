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
}
