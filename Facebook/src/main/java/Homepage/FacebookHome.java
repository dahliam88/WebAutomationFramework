package Homepage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookHome extends CommonAPI {

    @FindBy(how = How.CSS, using = "#reg_pages_msg>a")
    WebElement createPage;

    @FindBy(how = How.ID, using = "email")
    WebElement emailorPhoneBox;

    @FindBy(how = How.ID, using = "pass")
    WebElement passwordBox;

    @FindBy(how = How.ID, using = "u_0_2")
    WebElement loginBtn;

    public void createCelebrityPage() {
        createPage.click();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void loginFB(String email, String password) {
        emailorPhoneBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }
}


