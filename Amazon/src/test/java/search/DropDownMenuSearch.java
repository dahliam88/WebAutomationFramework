package search;

import Base.CommonAPI;
import Reporting.ApplicationLog;
import Search.DropDownMenuPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DropDownMenuSearch extends CommonAPI {
        @Test
        public void searchMenu()throws InterruptedException{
            ApplicationLog.epiclogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
            DropDownMenuPage dropDownMenuPage = PageFactory.initElements(driver, DropDownMenuPage.class);
            dropDownMenuPage.dropDownSearch();
        }
    }

