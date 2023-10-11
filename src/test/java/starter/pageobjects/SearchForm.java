package starter.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://duckduckgo.com/")
public class SearchForm extends PageObject {
    public static final By SEARCH_FIELD = By.name("q");
    public static final By SEARCH_BUTTON = By.cssSelector("[aria-label='Search']");
    public static final By ARTICLE_HEADINGS =  By.cssSelector("[data-testid=result] h2");
}
