package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    @FindBy(xpath = "//*[@id=\"W0wltc\"]/div")
    private WebElement rejectAllButton;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    private WebElement searchBar;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
    private WebElement gmailButton;

    public GoogleSearchPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchItemInSearchBar(String searchTerm) {
        this.searchBar.sendKeys(searchTerm);
        this.searchButton.submit();
    }

    public void setRejectAllButton() {
        this.rejectAllButton.click();
    }

    public void clickOnGmailButton() {
        this.gmailButton.click();
    }
}
