package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class LogoutTest extends BaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginPage loginPage = new LoginPage();
    MenuSection menuSection = new MenuSection();
    String email = "llubilinares@gmail.com";
    String password = "lapaz2000" ;

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        mainPage.loginButton.click();
        loginPage.login(email,password);
        Thread.sleep(7000);
        Assertions.assertTrue(menuSection.profileInfoButton.isControlDisplayed(), "ERROR, no se pudo hacer el login");
    }
}