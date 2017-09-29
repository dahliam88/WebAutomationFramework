package Search;

import Base.CommonAPI;
import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI {
    DataReader dr = new DataReader();

    public String[] getDataFromExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir") + "/data/file1.xls";
        String[] st = dr.fileReader(path);
        return st;
    }
}
