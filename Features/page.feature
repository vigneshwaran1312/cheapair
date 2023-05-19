Feature: cheapair fligth booking

  @tag1
  Scenario: Search fligth
    Given Launch the website
    When Enter the from to locations and count of passengers
    And Select the lowest price fligth for depart and return
    And Enter the details of passengers
      | chinnaiyan   | V | Male   | June     | 06 | 1955 |
      | palayandi    | V | Male   | December | 13 | 1997 |
      | vijayakumar  | C | Male   | July     | 13 | 1972 |
      | Radha        | V | Female | March    | 06 | 1982 |
      | Vigneshwaran | V | Male   | December | 13 | 2000 |
      | Nivetha      | V | Female | June     | 06 | 2003 |
      | jeevana      | S | Female | August   | 24 | 2015 |
      | jeevitha     | S | Female | February | 21 | 2017 |
    And Enter the cerdit card details
      | 1234567891234567 | 04 - April | 2025 | 0606 | Vigneshwaran | India | kulithalai,karur,tamilnadu | Karur | 1234567891 |
    Then Click on purchase button
