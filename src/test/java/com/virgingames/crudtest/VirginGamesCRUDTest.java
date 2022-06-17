package com.virgingames.crudtest;

import com.virgingames.testbase.TestBase;
import com.virgingames.virginGamesInfo.VirginGamesStep;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class VirginGamesCRUDTest extends TestBase {
@Steps
    VirginGamesStep virginGamesStep;

@Title("get the data")
    @Test
    public void test001(){
    ValidatableResponse response = virginGamesStep.getAllData().log().all().statusCode(200);
}


}
