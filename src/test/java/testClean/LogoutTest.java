package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.TopBarTools;


public class LogoutTest extends BaseTodoIst{
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    TopBarTools topBarTools = new TopBarTools();
    String email="llubilinares@gmail.es";
    String password="lapaz2000";

    @Test
    public void verifyLogOut() throws InterruptedException {
        //Log in
        Thread.sleep(2000);
        mainPage.loginButton.click();
        loginPage.emailTxtBox.setText(email);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();
        topBarTools.avatarMenuButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(topBarTools.logoutButton.isControlDisplayed(),"ERROR, no se hizo log in");

        //Log out
        topBarTools.logoutButton.click();
        Thread.sleep(3000);
        Assertions.assertTrue(mainPage.loginButton.isControlDisplayed());

    }
}