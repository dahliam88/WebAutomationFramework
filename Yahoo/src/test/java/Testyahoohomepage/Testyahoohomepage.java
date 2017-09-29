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
    @Test
    public void searchbtn(){
        Yahoohomepage yahoopage = PageFactory.initElements(driver, Yahoohomepage.class);
        yahoopage.searchbtn();
    }
    @Test
     public void btnSignin(){
        Yahoohomepage page = PageFactory.initElements(driver, Yahoohomepage.class);
        page.btnsignin();
    }
    @Test
    public void notification(){
     Yahoohomepage yahoo = PageFactory.initElements(driver, Yahoohomepage.class);
     yahoo.notification();
    }
    @Test
    public void news(){
    Yahoohomepage newsyahoo = PageFactory.initElements(driver, Yahoohomepage.class);
    newsyahoo.news();
    }
    @Test
    public void finance(){
    Yahoohomepage financeyahoo = PageFactory.initElements(driver, Yahoohomepage.class);
    financeyahoo.Finance();
    }
    @Test
    public void sports(){
    Yahoohomepage sportsyahoo = PageFactory.initElements(driver, Yahoohomepage.class);
    sportsyahoo.sports();
    }
    @Test
    public void politics(){
        Yahoohomepage politicsyahoo = PageFactory.initElements(driver, Yahoohomepage.class);
        politicsyahoo.politics();
    }
    @Test
    public void entertainment(){
    Yahoohomepage entertainmentyahoo = PageFactory.initElements(driver, Yahoohomepage.class);
    entertainmentyahoo.Entertainment();
    }
    @Test
    public void Lifestyle(){
    Yahoohomepage lifestyleyahoo = PageFactory.initElements(driver, Yahoohomepage.class);
    lifestyleyahoo.Lifestyle();
    }
    @Test
    public void more(){
     Yahoohomepage morebtn = PageFactory.initElements(driver, Yahoohomepage.class);
     morebtn.more();
    }
    @Test
    public void searchbox(){
     Yahoohomepage search = PageFactory.initElements(driver, Yahoohomepage.class);
     search.searchbox();
    }
}

