package Homepage;


import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Yahoohomepage extends CommonAPI{

        @FindBy(how = How.ID,using = "uh-search-button")
        public static WebElement searchbox;
        public void searchbox(){
                searchbox.click();
        }
        public void searchUp(String query){
            searchBtn.sendKeys(query);
        }
        @FindBy(how = How.CLASS_NAME, using = "rapid-noclick-resp")
        public static WebElement searchBtn;
        public void searchbtn(){
            searchBtn.click();
        }
        @FindBy(how = How.XPATH, using = ".//*[@id='uh-signin']")
        public static WebElement signinbtn;
        public void btnsignin(){
            signinbtn.click();
        }
        @FindBy(how = How.XPATH, using = ".//*[@id='yui_3_18_0_4_1506530508100_968']")
        public static WebElement notificationbtn;
        public void notification(){
            notificationbtn.click();
        }
        @FindBy(how = How.XPATH, using = ".//*[@id='yui_3_18_0_4_1506530767370_1042']")
        public static WebElement newsbutton;
        public void news(){
            newsbutton.click();
        }
        @FindBy(how = How.XPATH, using = ".//*[@id='yui_3_18_0_4_1506530767370_1384']")
        public static WebElement Financebtn;
        public void Finance() {
                Financebtn.click();
        }
        @FindBy(how = How.XPATH, using = ".//*[@id='yui_3_18_0_4_1506546315720_1138']")
        public static WebElement Sportsbtn;
        public void sports(){
         Sportsbtn.click();
        }
        @FindBy(how = How.XPATH, using = ".//*[@id='yui_3_18_0_4_1506546315720_1450']")
        public static WebElement Policticsbtn;
        public void politics(){
          Policticsbtn.click();
        }
        @FindBy(how = How.XPATH, using = ".//*[@id='yui_3_18_0_4_1506546315720_1728']")
        public static WebElement Entertainmentbtn;
        public void Entertainment(){
                Entertainmentbtn.click();
        }
        @FindBy(how = How.XPATH, using = ".//*[@id='yui_3_18_0_4_1506546315720_1858']")
        public static WebElement Lifestylebtn;
        public void Lifestyle(){
                Lifestylebtn.click();
        }
        @FindBy(how = How.XPATH, using = "")
        public static WebElement Morebtn;
        public void more(){
                Morebtn.click();
        }
        }







