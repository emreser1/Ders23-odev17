package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WebTables extends BasePage{

    public SelenideElement txtName = $("#firstName");
    public SelenideElement txtSurname = $("#lastName");
    public SelenideElement txtAge = $("#age");
    public SelenideElement txtEmail = $("#userEmail");
    public SelenideElement txtSalary = $("#salary");
    public SelenideElement txtDepartment = $("#department");
    public SelenideElement submitClick = $("#submit");
    public SelenideElement edit = $("span#edit-record-4");
    public SelenideElement newAge = $("div.rt-table > div.rt-tbody > div:nth-child(4) > div > div:nth-child(3)");
    public SelenideElement addButtonClick = $("#addNewRecordButton");
    public SelenideElement table =$("#registration-form-modal");
    public WebTables(String pageUrl) {
        super(pageUrl);
    }

    public void fillTable(String Name, String Surname, String Age, String Email, String Salary, String Department) {
        txtName.setValue(Name);
        txtSurname.setValue(Surname);
        txtAge.setValue(Age);
        txtEmail.setValue(Email);
        txtSalary.setValue(Salary);
        txtDepartment.setValue(Department);
    }
    public void clickAddButton(){
        addButtonClick.click();
    }
}
