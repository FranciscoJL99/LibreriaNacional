#Author: javiier.leoon15@gmail.com

Feature: Login successful and search library
  I as a user of the application
  I want to access the application with my username and password
  To make a purchase

  @Test_Successful
  Scenario Outline: Successful login
    Given that the User want do login in the application
    When he enter credentials
      | User   | Password   |
      | <User> | <Password> |
    Then he must access the homepage
    And search a book
      | Book   |
      | <Book> |
    Examples:
      | User                     | Password   | Book              |
      | zkohlerj_r116y@deypo.com | prueba123* | LA DIVINA COMEDIA |
      | zkohlerj_r116y@deypo.com | prueba123  | LA DIVINA COMEDIA |

  @Test_failed
  Scenario Outline: Failed login
    Given that the User want do login in the application
    When he enter credentials
      | User   | Password   |
      | <User> | <Password> |
    Then it should generate error message

    Examples:
      | User                     | Password |
      | zkohlerj_r116y@deypo.com | prueba   |

