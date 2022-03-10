package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox email=new TextBox(By.id("email"));
    public TextBox password=new TextBox(By.id("password"));
    public Button loginSubmit=new Button(By.xpath("//button[text()=\"Log in\"]"));
}