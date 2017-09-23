package Testyahoohomepage;

import Base.CommonAPI;
import Homepage.Yahoohomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Testyahoohomepage extends CommonAPI{
    @Test
    public void testSearchUp() {
        Yahoohomepage yahoopage = PageFactory.initElements(driver, Yahoohomepage.class);
        yahoopage.searchUp("mailbox");
    }
}

