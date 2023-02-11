Three categories of design patterns (CBS):
1. creational
  - Singleton
2. behavioral
3. structural


Singleton pattern:
1. private constructor
2. public creation method (we used `getInstance()` in our code example) that calls the private constructor
3. the creation method checks to see if the singleton object already exists; if it does, it just returns the existing singleton object; if it does not yet exist, then the creation method calls the constructor and the constructor creates the singleton object


Factory Method pattern:
- components:
  - abstract creator class
  - concrete creator classes that extend the abstract creator class
  - product interface
  - concrete products that implement the product interface
- factory method in the concrete creator classes (it also exists in the abstract creator class) that is responsible for calling the constructor of the concrete product classes

Mapping to the FactoryMethod package:
- concrete creator classes:
  - `WindowsDialog`
  - `HTMLDialog`
  - the concrete creator classes call the constructors to create the concrete products
- concrete product classes:
  - `HTMLButton`
  - `WindowsButton`
- product interface:
  - `Button` (interface)
- abstract base class:
  - `Dialog`
- client class:
  - `DemoClient`
    - creates the concrete creator classes
- factory method:
  - `createButton()`

DemoClient calls concrete creator class constructor (`WindowsDialog()` or `HTMLDialog()`); concrete creator class has a factory method called `createButton()` that calls the constructor of the concrete products (`HTMLButton` or `WindowsButton`)
