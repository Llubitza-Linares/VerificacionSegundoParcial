package pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;
public class LeftMenu {


    public Button addProject= new Button(By.xpath("//button[@class=\"adder_icon\"]"));

    public Label lastListItem=new Label(By.xpath("//div[@class=\"reactist collapse collapse--entered\"]//li[last()]"));
    public Button projectMenuButton=new Button(By.xpath("//div[@class=\"reactist collapse collapse--entered\"]//li[last()]//button"));

    public Label lastName=new Label(By.xpath("//li[last()]//div[@data-sidebar-list-item]//span[text()]"));


}
