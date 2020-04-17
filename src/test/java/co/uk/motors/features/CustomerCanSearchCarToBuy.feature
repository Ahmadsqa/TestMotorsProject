Feature: Search for cars
  as a customer
  i want the ability to search for cars for sales
  so that i can review details features about the car

  Scenario Outline: Customer can search for cars to buy lum sum cash only
    Given i navigate to motors.co.uk homepage
    When  i enter post code as "<postCode>"
    And   i select car make as "<carMake>"
    And   i select care model as "<carModel>"
    And   i select minimum price as "<minPrice>"
    And   i select maximum price as "<maxPrice>"
    And   i click on search button
    Then  the search reusults based on above criteria are displayed

    Examples:
      |postCode|carMake|carModel|minPrice|maxPrice|
      |B33 8AE |Bentley|Azure   |£1,000  |£100,000 |
      |B10 0US |BMW    |5 Series|£500    |£5,000 |

