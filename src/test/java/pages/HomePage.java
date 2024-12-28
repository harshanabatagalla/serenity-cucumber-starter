package pages;

import net.serenitybdd.annotations.Step;

public class HomePage {

    OrangeHRMHomePage homePage ;

    @Step
    public void openApplication(){
        homePage.open();
    }

    @Step
    public void enterUsername(){
        homePage.enterUname();
    }

    @Step
    public void enterPassword(){
        homePage.enterPassword();
    }

    @Step
    public void clickOnLoginButton(){
        homePage.clickLogin();
    }
}
