package Homepage;

import Base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage  extends CommonAPI{

    @Test
    public void CitiBankTitle() {
        String titleActual = "Banking with Citi | Citi.com";
        Assert.assertEquals(titleActual, driver.getTitle());
        System.out.println(driver.getTitle());
    }
    @Test
    public void Citibankurl(){
        String urlActual = "https://online.citi.com/US/login.do";
        Assert.assertEquals(urlActual,driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void Citibanklogo() {
        String logoActual = "https://online.citi.com/US/login.do";
        System.out.println(driver.getPageSource());
    }
    @Test
    public void clickcreditcardTag() {
        clickbuttonbyCSS("#creditCards>a");
        waitTime();
    }
    @Test
    public void CreditcardTitle(){
        String ActualTitle = "Banking with Citi | Citi.com";
        Assert.assertEquals(ActualTitle,driver.getTitle());
        System.out.println(driver.getTitle());
    }
    @Test
    public void clickBankingTab(){
        navigateback();
        clickbuttonbyCSS("#banking>a");
        waitTime();
    }
    @Test
    public void clicklandingTab() {
        navigateback();
        clickbuttonbyCSS("#lending");
        waitTime();
    }
    @Test
    public void clickinvestingTab() {
        navigateback();
        clickbuttonbyCSS("#investing");
        waitTime();
    }
    @Test
    public void clickcitigoldTab() {
        navigateback();
        clickbuttonbyCSS("#primary-nav>ul>li>a");
        waitTime();
    }
    @Test
    public void brokenlinksInHP(){
        brokenLinks();
    }
}
