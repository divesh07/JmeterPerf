package com.ts.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MyStepdefs {
    @Given("^user1 supply the following values for ThreadGroup$")
    public void user_supply_the_following_values_for_ThreadGroup(DataTable threadGroup) throws Throwable {
        System.out.println("Test projecct");
    }

}
