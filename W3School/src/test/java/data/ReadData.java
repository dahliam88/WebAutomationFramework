package data;

import Base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import table.Data;


public class ReadData extends CommonAPI {
    @Test
    public void headerVerification(){
        Data tablePage = PageFactory.initElements(driver, Data.class);
        tablePage.verifyHeader();
    }

    @Test
    public void readingTableCellData(){
        Data tableData = PageFactory.initElements(driver, Data.class);
        tableData.table();
    }
}

