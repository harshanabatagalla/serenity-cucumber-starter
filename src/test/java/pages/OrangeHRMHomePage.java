package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrangeHRMHomePage extends PageObject {

    public void enterUname(){
        $(By.name("username")).type("Admin");
    }

    public void enterPassword(){
        $(By.name("password")).type("admin123");
    }

    public void clickLogin(){
        $(By.className("orangehrm-login-button")).click();
    }
}
