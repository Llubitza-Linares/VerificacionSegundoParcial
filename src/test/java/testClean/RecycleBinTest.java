package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoLy.*;

public class RecycleBinTest {
    MainMenuPage mainMenuPage = new MainMenuPage();
    MainSectionPage mainSectionPage = new MainSectionPage();
    LoginModal loginModal = new LoginModal();
    MenuLeft menuLeft = new MenuLeft();
    RecycleConfirmationMessage recycleConfirmationMessage = new RecycleConfirmationMessage();
    String email="llubylinares@gmail.com";
    String password ="lapaz2000";

    @Test
    public void verifyRecyclerBinEmpty() throws InterruptedException {
        mainMenuPage.loginImage.click();
        loginModal.emailLogInTxtBox.setText(email);
        loginModal.pwdLoginTextBox.setText(password);
        Thread.sleep(2000);
        loginModal.loginButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(mainSectionPage.logoutButton.isControlDisplayed());

        //Recycler Bin
        menuLeft.recyclerBinOptions.click();
        Thread.sleep(2000);
        menuLeft.emptyRecycleBinButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(recycleConfirmationMessage.emptyRecyclerBinMessage.isControlDisplayed());
    }
}
