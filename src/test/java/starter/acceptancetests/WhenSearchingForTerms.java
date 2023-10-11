package starter.acceptancetests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.NavigateSteps;
import starter.actions.SearchSteps;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {

    @Steps
    NavigateSteps navigate;

    @Steps
    SearchSteps search;

    @Test
    @DisplayName("Should be able to search for red things")
    void searchForRedThings() {
        navigate.opensTheHomePage();

        search.searchForTerm("red");

        assertThat(search.getSearchResults()).anyMatch(title -> title.toLowerCase().contains("red"));
    }

    @Test
    @DisplayName("Result page title should mention the search term")
    void searchForGreenThings() {
        navigate.opensTheHomePage();

        search.searchForTerm("green");

        assertThat(search.getTitle()).containsIgnoringCase("green");
    }

}
