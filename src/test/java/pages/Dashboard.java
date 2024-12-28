package pages;

import net.serenitybdd.annotations.Step;

public class Dashboard {

    OrangeHRMDashboard dashboard;

    @Step
    public void verifyAdmin(){
        dashboard.loginVerify();
    }
}
