package Datasource;

import Base.CommonAPI;
import Reporting.TestLogger;
import Search.Searchpage;
import org.openqa.selenium.support.PageFactory;
import utility.ConnectDB;

import java.util.List;

public class DatabasedataReader extends CommonAPI {



        public void dataFromDatabase()throws Exception,InterruptedException{
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            Searchpage searchPage = PageFactory.initElements(driver, Searchpage.class);
            ConnectDB connectDB = new ConnectDB();
            List<String> list = connectDB.readDataBase();
            for(String data:list){
                searchPage.searchFor(data);
                sleepFor(2);
                searchPage.clearSearchInput();
            }
        }
    }
