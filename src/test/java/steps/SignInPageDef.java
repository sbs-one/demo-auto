package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import pages.SignInPage;
import static app_context.RunContext.*;

public class SignInPageDef {

    SignInPage signInPage = new SignInPage();


    @Then("Input email")
    public void inputEmail() {
        String email = "Auto_" + RandomStringUtils.randomAlphabetic(5) + "@mail.com";
        signInPage.inputEmail(email);
        put("email", email);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Input First Name")
    public void inputFirstName() {
        String firstName = UserConfig.USER_FIRST_NAME;
        signInPage.inputFirstName(firstName);
        put("firstName", firstName);
    }

    @Then("Input Last Name")
    public void inputLastName() {
        String lastName = UserConfig.USER_LAST_NAME;
        signInPage.inputLastName(lastName);
        put("lastName", lastName);
    }

    @Then("Click agreement checkbox")
    public void clickAgreementCheckbox() {
        signInPage.clickAgreementCheckBox();
    }
}
