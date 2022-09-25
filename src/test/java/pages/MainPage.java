package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='new-todo']")
    public WebElement todoField;

    @FindBy(xpath = "//span[@class='todo-count']")
    public WebElement todoCounter;

    @FindBy(xpath = "//a[@href='#/all']")
    public WebElement allListLink;

    @FindBy(xpath = "//a[@href='#/active']")
    public WebElement activeListLink;

    @FindBy(xpath = "//a[@href='#/completed']")
    public WebElement completedListLink;

    @FindBy(xpath = "//button[@class='clear-completed']")
    public WebElement clearCompletedButton;

    @FindBy(xpath = "//button[@class='destroy']")
    public WebElement deleteButton;

    @FindBy(xpath = "//label[@for='toggle-all']")
    public WebElement markAllCompletedToggle;

    @FindBy(xpath = "//li[@class='todo']")
    public List<WebElement> taskList;

    @FindBy(xpath = "//li[@class='todo completed']")
    public List<WebElement> completedTaskList;

    @FindBy(xpath = "//li[@class='todo editing']//label")
    public WebElement editFieldTextLabel;

    @FindBy(xpath = "//input[@class='edit']")
    public WebElement editedTaskField;

}
