package com.co.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DummyStepDefinition {

    @Given("un precondición")
    public void givenUnPrecondicion() {
        System.out.println("Dado un precondición");
    }

    @When("se realiza una acción")
    public void whenSeRealizaUnaAccion() {
        System.out.println("Cuando se realiza una acción");
    }

    @Then("se verifica el resultado")
    public void thenSeVerificaElResultado() {
        System.out.println("Entonces se verifica el resultado");
    }
}
