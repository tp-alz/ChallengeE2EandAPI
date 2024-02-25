# ChallengeE2EandAPI

This Repo contains two Test Automation excercies, one performing E2E purchase flow in the DemoBlaze website, the second part is an API testing excercise in the swagger Petstore.

## Table of Contents

- [E2E Testing](##E2E-Testing)
  - [Getting Started DemoBlaze](###Getting-Started-DemoBlaze)
  - [DemoBlaze Prerequisites](###DemoBlaze-Prerequisites)
  - [DemoBlaze Commands](###DemoBlaze-Commands)
- [API Testing](##API-Testing)
  - [Getting Started PetStore](###Getting-Started-PetStore)
  - [PetStore Prerequisites](###PetStore-Prerequisites)
  - [PetStore Commands](###PetStore-Commands)

## E2E Testing

### Getting Started Demoblaze

[DemoBlaze](https://www.demoblaze.com/) is a testing online store with support for signup, login and purchasing functionalities, the next scenario was fulfilled using Java, Selenium, Cucumber, and POM:

Scenario: Purchase flow test with two products
Given the user navigates to www.demoblaze.com
And adds first product to the cart
And adds second product to the cart
And views the cart
And completes the purchase form
Then the user completes the purchase successfully

### Demoblaze Prerequisites

Java v^21.0

```
gradlew clean build
```

### Demoblaze Commands

Run E2E demolaze test command

```
gradle test -Dcucumber.options="--tags @DemoBlaze"
```

## API Testing

### Getting Started Demoblaze

[Petstore](https://petstore.swagger.io/) is a petstore server with support for REST API, the next scenario was fulfilled using JS, Cypress, Faker-JS:

- Add a new pet
- Find a pet by ID
- Update pet name and status to 'Sold'
- Find pet by Status

### Demoblaze Prerequisites

NodeJS v^20.1\*
Cypress v^13.6

```
npm install
```

### Demoblaze Commands

Run API petstore test command

```
npm run test:petstore
```
