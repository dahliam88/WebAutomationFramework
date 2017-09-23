package Homepage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbAccount extends CommonAPI{

    @FindBy(how = How.CSS, using = "#u_0_9")
    WebElement firstName;

    @FindBy (how = How.CSS, using = "#u_0_b")
    WebElement  lastName;

    @FindBy (how = How.CSS, using = "#u_0_e")
    WebElement email;

    @FindBy (how = How.CSS, using = "#month")
    WebElement selectMonth;

    @FindBy(how = How.CSS, using= "#day")
    WebElement selectdays;

    @FindBy(how = How.CSS, using = "#year")
    WebElement selectyear;

    @FindBy(how = How.ID, using = "u_0_6")
    WebElement femailoption;

    @FindBy(how = How.CSS, using = "._58mt")
    WebElement maleoption;

    @FindBy(how = How.CSS, using = "#u_0_r")
    WebElement createact;

    public void setFirstName (){
        firstName.sendKeys("sama");
    }
    public void setLastName (){
        lastName.sendKeys("akbar");
    }
    public void setEmail (){
        email.sendKeys("akbar.gamil.com");
    }
    public void setSelectMonth() {
        selectMonth.sendKeys("01");
    }
    public void setDay (){
        selectdays.sendKeys("07");
    }
    public void setyear(){
        selectyear.sendKeys("1998");
    }
    public void male(){
        maleoption.click();
    }
    public void female(){
        femailoption.click();
    }
    public void createaccount(){
        createact.click();
    }
}