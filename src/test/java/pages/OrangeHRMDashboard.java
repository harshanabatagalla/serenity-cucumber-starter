package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class OrangeHRMDashboard  extends PageObject {

    public void loginVerify(){
        System.out.println(getDriver().getTitle());
//        String currentURL = getDriver().getCurrentUrl();
//        Assert.assertTrue(currentURL.contains("dashboard"));
    }
}
