package genericMethods;

import org.openqa.selenium.WebDriver;

public class JQuerySliderPage {

    private final WebDriver driver;
    private jQuerySlider slider;

    public JQuerySliderPage(final WebDriver driver){
        this.driver = driver;
    }

    public void goTo(){
       this.driver.get("http://jqueryui.com/slider/");
       this.driver.switchTo().frame(0);
       this.slider = new jQuerySlider(driver);
    }

    public jQuerySlider getSlider() {
        return slider;
    }

}