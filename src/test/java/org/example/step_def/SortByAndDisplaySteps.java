package org.example.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.SortByAndDisplayPage;

public class SortByAndDisplaySteps {
    SortByAndDisplayPage sortByPages= new SortByAndDisplayPage();
    @When("^I select sort by price low to high$")
    public void i_select_sort_by_price_low_to_high() throws InterruptedException {
        sortByPages.selectSortByWay();
    }

    @Then("^I should see items are sorted by price low to high$")
    public void i_should_see_items_are_sorted_by_price_low_to_high() throws Throwable {

    }
    @When("^I select display from (\\d+) to (\\d+)$")
    public void i_select_display_from_to(int arg1, int arg2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        sortByPages.displayByNoOfItems();
    }

    @Then("^I should see (\\d+) notebooks$")
    public void i_should_see_notebooks(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}
