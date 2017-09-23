package Homepage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbSignUp extends CommonAPI{

    @FindBy(how = How.NAME, using ="firstname")
    public static WebElement FirstNameBox;

    @FindBy(how = How.NAME, using = "lastname")
    public static WebElement LastNameBox;

    @FindBy(how = How.NAME,using = "reg_email__")
    public static WebElement Email;

    @FindBy (how = How.NAME,using = "reg_email_confirmation__")
    public static WebElement reEmail;

    @FindBy(how = How.NAME,using = "reg_passwd__")
    public static WebElement password;

    @FindBy(how = How.ID,using = "month")
    public static WebElement selectMotnth;

    @FindBy(how = How.ID,using = "day")
    public static WebElement selectDay;

    @FindBy(how = How.ID,using = "year")
    public static WebElement selectYear;

    @FindBy(how = How.XPATH,using = ".//*[@id='u_0_6']")
    public static WebElement FemaleBtn;

    @FindBy(how = How.NAME,using = "websubmit")
    public static WebElement createAcc;

    public void setFirstName (){
        FirstNameBox.sendKeys("Israt");
    }
    public void setLastName (){
        LastNameBox.sendKeys("Eva");
    }
    public void setEmail (){
        Email.sendKeys("IsratEva@gamil.com");
    }
    public void setReEmail(){
        reEmail.sendKeys("IsratEva@gmail.com");
    }
    public void setPassword(){
        password.sendKeys("xyz@1234");
    }
    public void setSelectMonth() {
        selectMotnth.sendKeys("01");
    }
    public void setDay (){
        selectDay.sendKeys("09");
    }
    public void setyear(){
        selectYear.sendKeys("1994");
    }

    public void female(){
       FemaleBtn.click();
    }
    public void createaccount(){
        createAcc.click();
    }
}
