package pagesTodoLy;

import control.Button;
import org.openqa.selenium.By;

public class MenuLeft {
    public Button recyclerBinOptions = new Button(By.xpath("//div[@itemid=\"-3\"]//img"));
    public Button emptyRecycleBinButton = new Button(By.xpath("//a[@href='#emptyRecycle']"));
}