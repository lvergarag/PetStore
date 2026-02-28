Feature: PetStore

  Scenario: Validate Fish
    Given User navigates to Petstore homepage
    When User clicks on Fish
    Then Product code text should be "Fish"

  Scenario: Validate Dogs
    Given User navigates to Petstore homepage
    When User clicks on Dogs
    Then Product code text should be "Dogs"

  Scenario: Validate Cats
    Given User navigates to Petstore homepage
    When User clicks on Cats
    Then Product code text should be "Cats"

  Scenario: Validate Reptiles
    Given User navigates to Petstore homepage
    When User clicks on Reptiles
    Then Product code text should be "Reptiles"

  Scenario: Validate Birds
    Given User navigates to Petstore homepage
    When User clicks on Birds
    Then Product code text should be "Birds"

