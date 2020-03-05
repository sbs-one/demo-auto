package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginEmail = $(By.cssSelector("#form_email"));
    private SelenideElement passwordInput = $(By.cssSelector("#form_password"));
    private SelenideElement firstNameInput = $(By.cssSelector("#form_firstName"));
    private SelenideElement lastNameInput = $(By.cssSelector("#form_lastName"));
    private SelenideElement agreementCheckBox = $(By.cssSelector("#form_agreement"));


    public void inputEmail(String text) {  this.loginEmail.val(text);  }
    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

    public void inputFirstName(String text) {
        firstNameInput.val(text);
    }
    public void inputLastName(String text) {
        lastNameInput.val(text);
    }

    public void clickAgreementCheckBox() {
        agreementCheckBox.click();
    }

}
