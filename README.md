# java-Jan2022
Mask E-comm projects

1. Maintain list of products - face masks
  - catalog : Database
  - WebService to list the products from catalog (REST API)
  - Web UI to display the products - by calling service
2. Quantities of the products
3. Payment system
4. Shipping
5. Checkout - select products, shipping address and pay


Jan31:
Offline work: 
  - read about HTTP methods 
  - sign up on https://trello.com/en-US
  - Read about agile, project plan and user story board, sprints etc.
  - One of you create the project and define user stories and add others
  - Discussed Private and public. Also read about default and protected.
  - Read about bean methods (getters and setters)

Feb2:
  - Change default JSON format to XML in your sprigboot application.
  - Add more fields to product and test productController
  - Object oriented programming principles - Encapsulation 
  - Source actions -> Generate Getter/Setters for private members of a class.
  - Postman to test post request (REST API)  (Note: SOAPUI tool to test SOAP API)
  - 2 main types of web services : REST and SOAP
  - do "git pull" on this repo in your laptop to get latest code

Feb 9:
  - Service layer
  - read about IOC (Spring Core module)
  - Read about Dependency Injection
  - TODO: create PaymentService and add CC functions to be called from OrderController
  - TODO: Just like services sub package move all model classes (eg. Order, Address etc) to its own sub packge(model). Also move controllers to its own sub package.

Feb 10:
  - Client side rendering VS Server side rendering.
  - Single Page Application vs Multi page application

Feb 13: 
  - setup database and use of other Spring module
  - H2 database setup. Access console at http://localhost:8080/h2-console to see the Database tables and data.

Feb-16:
  - Annotation guide (https://www.baeldung.com/java-custom-annotation)
  - Access modifiers (public, default, protected, private) and Inheritance (https://www.w3schools.com/java/java_modifiers.asp)
  - Conditions(if-else, ternary, switch-case) and loops (while, for, do-while)
    (https://www.w3schools.com/java/java_conditions.asp)
  - Exceptions