what is a design pattern?
- blueprint of a solution to a common problem

3 types of design patterns:
- creational
- behavioral
- structural

What do we need to know:
- what a design pattern is: blueprint of a solution to a common problem
- the three categories: CBS, creational, behavioral, structural
- SOLID principles at a high level
- DRY, YAGNI, KISS, clean code, agile manifesto at a high level


Three major types of testing:
1. unit testing
  - tests classes or methods
  - JUnit
    - assertEquals(someValueAMethodReturns, some a priori value)
      - a priori believed beforehand
    - JUnit uses an assertion library
      - JUnit has its own out of the box
      - AssertJ can be used instead
  - done by developers
2. integration testing
  - tests that methods/classes work together without breaking
  - done by developers
3. system testing
  - testing the entire system
  - users/testing team


YAGNI
- you ain't gonna need it
- "lazy": don't write code before you actually need it
  - lazy evaluation: don't evaluate a statement/expression until you actually need the value


Central goals in software design:
- code reuse: flexible code that is easily reused
- modularity (lego building blocks); related to modules (building blocks)
- code extensibility: we can extend our working code to handle more use cases

base class:
- parent class
- abstract class

method overriding:
- providing a new implementation of a method inherited from a base (parent, abstract) class

abstract method:
- has no implementation, only a definition; child (inheriting) class has to provide the implementation

client code:
- any other piece of code using a class/program/package
- external to the class/program/code we're working on

UML:
- unified modeling language
- it models the entities (real-world objects) in the code graphically

abstraction:
- using interfaces
- using abstract classes
- hide away the details that don't concern us (or some client code)
  - e.g., we can use the String class to create new String objects but we don't need to know the technical details under the hood in the String class

persist:
- a fancy word for saving data to the disk (hard drive)

RAM:
- random access memory
- volatile: if the computer loses power, the contents of RAM are lost

hard drive:
- data are persisted (stored permanently) on the hard drive even when power is lost


**SOLID Principles**
1. Single Responsibility
2. Open/Closed principle:
  - open <==> extension
  - closed <==> modification
  - extend <==> inheritance
3. Liskov Substitution principle:
  - a child class can substitute for a parent class without breaking the code
  - we want the child class (subclass) to be able to substitute in for the parent class (superclass) and not break the code
    - there are several technical ways to test this, but go look them up later if you need to

*example 1:*
parent class contains `feed(Cat c)` method that takes a `Cat` object as a parameter
child class contains a `feed(Animal c)` method that takes an `Animal` object as a parameter
- this scenario would pass Liskov Substitution because the child class can substitute in for the parent and the code would not break

*example 2:*
parent class contains `feed(Cat c)` method that takes a `Cat` object as a parameter
child class contains a `feed(Lion c)` method that takes an `Lion` object as a parameter
- to feed a lion, cage, danger, large amounts of food
- violates Liskov because the child class has a very different implementation (way of doing things) to feed a lion vs. the parent that feeds a housecat in a much different way

4. Interface Separation principle
- in Java, we can implement as many interfaces as we want
  - reminder: we can only inherit from one superclass
- therefore, we don't want to have fat/bloated interfaces with lots of methods inside
- key fact: when a child class implements an interface, it must have the method bodies (implementations) for all the methods in the interface
- split one fat interface into several smaller interfaces, each with one or two methods, thereby giving the child class that implements the interface more choice about which methods it wants to take from the interface
  - interface only contains methods (behaviors)

5. Dependency Inversion principle
- before: high-level class depends on a low-level class for it (the HL class) to perform its tasks
  - this can be a problem if the low-level class changes, we could be forced to change the code in the high-level class as well because the HL class depends on the LL class
- after: (better) have the HL class interact with an interface and not any LL classes
  - instead, the LL classes will depend on the interface and the HL class will no longer depend on the LL classes
    - LL classes depending on interface means that the LL classes look to the interface to tell it what methods the LL class must have (or must implement)
- high-level class only talks to the interface; it does not talk to the low-level classes (concrete classes)
- the interface is what communicates with the low-level classes
- so if code in the low-level classes ever changes, we won't have to change the code in the high-level class


Dependency Inversion <==> class composition
Liskov <==> inheritance



only using inheritance can lead to combinatorial explosion:
N = number of classes
v = number of variables

car, truck
electric, gas
autopilot, manual
2*2*2 = 2^3 = 8 possible child classes

imagine: 20 classes, each with 6 values
6^20




Plan for the remaining two sessions:
- next Saturday, 2/11/2023
  - singleton
  - maybe builder
  - adapter
- next Sunday, 2/12/2023
  - template
  - decorator
