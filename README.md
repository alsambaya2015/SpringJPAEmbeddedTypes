# SpringJPAEmbeddedTypes
Sample of JPA / Hibernate @Embeddable and @Embedded Example with Spring Boot


Usage of  Embeddable types in hibernate to map a linear database table into an Entity class composed of various value types.

This example allows you to use the @Embedded feature of hibernate:
Let suppose that you have a Customer information made of:
  1.  Name ( First_name, Middle_name, Last_name, Email)
  2. Address (House_number, Street, City, State, Country, Zip_code)
  
All this information could be built in the same table.

While mapping this table into an entity class in an application, we might want to separate Name & Address details into separate classes for re-usability. 

An example is using Address for two differents entities: Customers and Companies.


