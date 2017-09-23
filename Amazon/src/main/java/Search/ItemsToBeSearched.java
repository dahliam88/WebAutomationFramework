package Search;

import Base.CommonAPI;
import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI {
    DataReader dr = new DataReader();

    public String[] getDataFromExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir") + "/data/file1.xls";
        String[] st = dr.fileReader(path);
        return st;
    }
    public void getDataFromExcelFileAndSearch()throws IOException, InterruptedException{

        //Create instance of Excel file reader class
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();

        //Page Factory class init
        Searchpage search = PageFactory.initElements(driver, Searchpage.class);

        //Read data from Excel File.
        String[] value = itemsToBeSearched.getDataFromExcelFile();
        //Running for each loop
        for (int i = 1; i < value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.clearSearchInput();
        }
    }

}
