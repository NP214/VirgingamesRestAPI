package com.virgingames.virginGamesInfo;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class VirginGamesStep {
    @Step("get all virgin games data")
    public ValidatableResponse getAllData(){
        return SerenityRest.given().log().all()
                .when()
                .get()
                .then();
    }
}
