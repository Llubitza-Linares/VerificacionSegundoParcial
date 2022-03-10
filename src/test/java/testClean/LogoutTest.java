package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginModal;
import pages.UserMenuPage;

public class LogoutTest extends BaseTodoIst{
    HomePage homePage = new  HomePage ();
    LoginModal loginModal = new LoginModal();
    UserMenuPage userMenuPage = new UserMenuPage();
    String email="llubi@gmail.com";
    String password="lapaz2000";

    @Test
    public void verifyLogOut() throws InterruptedException {
        //Log in A TODOIST
        Thread.sleep(2000);
        homePage.loginButton.click();
        loginModal.email.setText(email);
        loginModal.password.setText(password);
        loginModal.loginSubmit.click();
        userMenuPage.userImg.click();
        Thread.sleep(2000);
        Assertions.assertTrue(userMenuPage.logoutButton.isControlDisplayed(),"ERROR, no se hizo log in");

        //Log out TODOIST
        userMenuPage.logoutButton.click();
        Thread.sleep(3000);
        Assertions.assertTrue(homePage.loginButton.isControlDisplayed());

    }
}