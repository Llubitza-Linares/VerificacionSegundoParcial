package pagesTodoLy;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailLogInTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox pwdLoginTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
}