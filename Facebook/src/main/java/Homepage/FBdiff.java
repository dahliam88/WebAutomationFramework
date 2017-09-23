package Homepage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBdiff extends CommonAPI {

    @FindBy(how = How.CSS, using = ".uiList.localeSelectorList._2pid._509-._4ki._6-h._6-j._6-i>li>a")
    WebElement espaniol;

    @FindBy(how = How.CSS, using = ".uiList.localeSelectorList._2pid._509-._4ki._6-h._6-j._6-i>li>a")
    WebElement Arabic;

    @FindBy(how = How.CSS, using = "._42ft._4jy0._517i._517h._51sy")
    WebElement Showmorelanguage;

    @FindBy(how = How.ID, using = "birthday-help")
    WebElement help;

    @FindBy(how = How.XPATH, using = ".//*[@id='js_116']/div/div/ul/li[13]/a/span/span")
    WebElement setting;

    @FindBy(how = How.CSS, using = ".login_form_label_field>div>a")
    WebElement forgetaccount;

    @FindBy(how = How.XPATH,using = ".//*[@id='userNavigationLabel']")
    WebElement naviagtorbar;


    public void clickespaniol() {
        espaniol.click();
    }
    public void clickArabic(){
        Arabic.click();
    }
    public void MoreSign(){
        Showmorelanguage.click();
    }
    public void morehelp(){
        help.sendKeys("why do i need to put my birthday");
    }
    public void setting(){
        setting.getText();
    }
    public void fgact(){
        forgetaccount.click();
    }
    public void clickNaviagtorbar(){
        naviagtorbar.click();
    }
}
