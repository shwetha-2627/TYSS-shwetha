package genericMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iQueryTest {

    private WebDriver driver;
    private JQuerySliderPage sliderPage;

    @Test
    public void goTo() {
        this.driver = new ChromeDriver();
        this.sliderPage = new JQuerySliderPage(driver);
        this.sliderPage.goTo();
    }

    @Test(dependsOnMethods = "goTo")
    public void moveRightBy25() {
        sliderPage.getSlider().moveBy(25);
        Assert.assertEquals("25%", sliderPage.getSlider().getValue());
    }

    @Test(dependsOnMethods = "moveRightBy25")
    public void moveLeftBy20() {
        sliderPage.getSlider().moveBy(-20);
        Assert.assertEquals("5%", sliderPage.getSlider().getValue());
    }

    @Test(dependsOnMethods = "moveLeftBy20")
    public void moveRightBy50() {
        sliderPage.getSlider().moveBy(50);
        Assert.assertEquals("55%", sliderPage.getSlider().getValue());
    }

}