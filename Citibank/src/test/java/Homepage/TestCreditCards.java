package Homepage;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class TestCreditCards extends CommonAPI {
    @Test
    public void clickcreditcardTag() {
        clickbuttonbyCSS("#creditCards>a");
        waitTime();
    }
    @Test
    public void searchByCSS() {
        searchByCSS("#cA-cardsUseridMasked","UserID");
        waitTime();
    }
    @Test
    public void searchByXpath(){
        searchByXPath(".//*[@id='PASSWORD']","password");
        waitTime();
    }
    @Test
    public void clickButtonByXpath(){
        clickbuttonbyXpath(".//*[@id='logon']/div[6]/input");
        waitTime();
    }
}
