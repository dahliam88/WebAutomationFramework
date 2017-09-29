package Home;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FirstPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#logo")
    public static WebElement logo;
    public void CNN(){
        logo.click();
    }
    @FindBy(how = How.ID, using = "nav-mobileTV")
    public static WebElement USbutton;
    public void US(){
        USbutton.click();
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a[2]")
     public static WebElement Worldbutton;
      public void World(){
        Worldbutton.click();
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a[3]")
    public static WebElement politicsbutton;
      public void politics(){
          politicsbutton.click();
      }
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a[4]")
    public static WebElement moneybutton;
      public void money(){
          moneybutton.click();
      }
    @FindBy(how = How.CSS, using = ".nav-menu-links__link")
      public static WebElement opinionbutton;
      public void opinion(){
          opinionbutton.click();
      }
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a[6]")
    public static WebElement Healthbutton;
      public void Health(){
          Healthbutton.click();
      }
    @FindBy(how = How.CSS, using = ".nav-menu-links__link")
    public static WebElement Entertainmentbtn;
      public void entertainment(){
          Entertainmentbtn.click();
      }
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a[8]")
    public static WebElement Techbtn;
      public void Teach(){
          Techbtn.click();
      }
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a[9]")
    public static WebElement Stylebtn;
      public void Style(){
          Stylebtn.click();
      }
    @FindBy(how = How.CLASS_NAME, using = "nav-menu-links")
    public static WebElement Travelbtn;
      public void Travel(){
          Travelbtn.click();
      }
    @FindBy(how = How.ID, using = "nav-mobileTV")
    public static WebElement Sportsbtn;
      public void Sports(){
          Sportsbtn.click();
      }
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a[12]")
    public static WebElement videosbtn;
      public void Video(){
          videosbtn.click();
      }
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/div[2]/a[13]")
    public static WebElement VRbtn;
      public void VR(){
          VRbtn.click();
      }
}
