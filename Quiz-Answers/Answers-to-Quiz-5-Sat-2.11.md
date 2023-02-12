## Quiz 5
#### Saturday, Feb. 11, 2023

1. What is a design pattern?
- blueprint solution to a common problem

2. Define the S in the SOLID principles and describe it in your own words.
- Single responsibility principle
  - a class should have just one responsibility/function.

3. Define the O in the SOLID principles and describe it in your own words.
- Open/closed principle
  - a class should be closed for modification but open to extension
  - once a class has been tested and it works as expected, make it final so that it can't be modified (it can be modified to fix bugs, however), and if it needs additional functionality, allow a child class to inherit it and add additional functionality there

4. Define the L in the SOLID principles and describe it in your own words.
- Liskov Substitution principle
  - subclasses should fulfill and not replace the behavior of the superclass
  - child classes should be able to substitute for parent classes without breaking the code
    - there are formal tests to ensure that child classes can substitute for parent classes

5. Define the I in the SOLID principles and describe it in your own words.
- Interface segregation principle
  - client should not be forced to depend on methods it doesn't use
  - don't put too many methods in one interface; instead, create several interfaces with a small number of methods and allow classes to implement as many of those interfaces that it needs
  - don't have too many methods in one interface because then any class that implements that interface must implement all those methods, including ones it does not want

6. Define the D in the SOLID principles and describe it in your own words.
- Dependency inversion principle
  - high-level modules should not depend on low-level modules; they both should depend on an abstraction
  - high-level classes often need lower-level classes as dependencies; instead of having the high-level classes depend on (or communicate with) the low-level classes directly, insert an interface between the high-level class and the low-level classes; then the high-level class depends on the interface, and the low-level classes also depend on the interface
    - if the low-level class changes in the future, it shouldn't affect/break the high-level class
    - inserting an interface between the high-level and low-level classes reduces coupling between the high-level classes and the low-level classes

7. Describe the DRY principle in your own words.
  - don't repeat yourself

8. Give two examples of practices in object-oriented design that conform to the DRY principle.
  - using methods
  - subclasses inheriting fields and methods from superclasses
