package common;

import driver.DriverFactory;
import pages.Elements;
import pages.WebTables;

public class PageManager {
    public WebTables WebTablesPage;

    private Elements ElementsPage;

    public PageManager() {

        DriverFactory.initDriver();

        WebTablesPage = PageFactory.buildWebTablesPage();
        setElementsPage(PageFactory.buildElementsPage());

    }

    public Elements getElementsPage() {
        return ElementsPage;
    }

    public void setElementsPage(Elements elementsPage) {
        ElementsPage = elementsPage;
    }
}
