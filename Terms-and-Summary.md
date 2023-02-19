# Git

The 80/20 major commands:
- git status
- git add .
  - adds all files and folders in the current directory
- git commit -m "a descriptive commit message goes here"
- git push

background about Git:
https://latesthackingnews.com/wp-content/uploads/2018/06/Distributed-Version-Control-System-Workflow-What-Is-Git-Edureka.png

local = your computer

remote = GitHub.com (could also be Gitlab, Bitbucket)
- remote = far away

working copy:
- any directory on your local computer that has not been turned into a git repository
- we can turn a local directory into a git repository using the `git init` command

local repository:
- is a directory that has been initialized via `git init` as a local repository

remote repository:
- exists on github.com
- github.com/repositories > New
  - to create a new repository

we connect the local repository to the remote repository (AKA the github.com server) via the following commands:
<br>
`git remote add origin git@github.com:Stackeduary/this-is-just-an-example.git`
<br>
<br>
`git clone <repository URL (SSH preferred)>`

example:
<br>
`git clone git@github.com:RandoAigro/MilitaryTime.git`
- this creates a copy (clone) of Rando's repository called "MilitaryTime" in your local environment


Common pitfalls:
- you are very likely going to see the following error when trying to push to a repo with multiple collaborators:
```
 ! [rejected]        main -> main (fetch first)
error: failed to push some refs to 'github.com:SyncMaster7/git-exercise.git'
```
- this is caused by your local repository not having the latest changes (i.e., code) from the remote repository (i.e., the server)
- YOU CAN PREVENT THIS by always running `git pull` in a shared repository BEFORE you try to push your new changes
- it's basically a refresh of the remote repository (server)


# Java Object-Oriented Programming

implement:
- to write it in code
    - (Part wants to add that implementing means writing code according to a specification)
- in common language: put into practice, or use
  - The revered King implemented a new tax cut for all his people


class:
- made up of fields and methods (including constructor)
- blueprint for creating objects


package:
- set of classes


library:
- set of packages


instance:
- object


object = instance (noun)


instantiate (verb):
- creating an object
- creating an instance


initialize:
- give something an initial value
- give something its first value


declare:
- "hey, this thing exists"
- to make it "exist" in Java
- declaration (noun)


operator:
- examples: 
  - addition, string concatenation: +
  - subtraction: -
  *
  <br>
  %
  <br> /


operand:
- the thing that an operator is applied to
e.g., statement: int price + String restaurant;
operands: price, restaurant
operator: + (concatenation)

`double age = 40.0;`
`int salary = 40000000;`
age + (addition) salary;


parameters vs. arguments:
- parameters (price, restaurant) are the placeholders when defining the method
  - variables
  - placeholders
  - containers/boxes in memory
- arguments are the actual values ("BurgerEmperor", 12) when the method is called
  - argument <==> actual


invoke a method:
- call a method
- e.g., billObj.doubleSalary(startingSalary);
  - objectName.methodName(arguments);


capitalization conventions in Java:
- object names start with a lowercase letter, e.g., myDogObject
- class names start with an uppercase letter, e.g., Dog, Math, String
- all caps represent constants that don't/won't change in other parts of the program


superclass:
- another word for parent class


subclass:
- another word for child class




### Principles

- DRY
  - don't repeat yourself
  - if you find yourself copying and pasting a lot to comply with the DRY principle, then rethink your architecture

- YAGNI
  - you ain't gonna need it

<hr>


IntelliJ:
- right click in the editor > Generate > choose the boilerplate (very standard and doesn't change a lot) code that you want IntelliJ to create for you
- examples:
  - getters
  - setters
  - constructors
  - toString() methods
- keyboard shortcut: alt + insert
- if you see an error in IntelliJ, have your cursor in/around the error and alt + enter to get help/correction

<hr>

Inheritance:
- to avoid repeating one's self
- subclass = child class
- superclass = parent class
- method overriding:
  - code in subclass is written differently from how it is written in superclass
  - the subclass method replaces the method from the superclass
- Java only supports single inheritance
  - a subclass can only inherit from *one* superclass


Interface:
- the interface declares the "contract" that there are certain methods that the class must implement (that the class must provide code for)
- keyword: "implements"
  `className implements InterfaceName`
- in the interface, list the methods without method bodies followed by a semicolon:
  `void sayExcuseMe();`
    - the exception is default methods defined inside an interface because default methods actually *do* have an implementation (and hence, a method body)   
- Interfaces do not contain state (for now)
  - if you want a subclass (child) to inherit state, use a superclass (parent)
- a class that implements an interface MUST IMPLEMENT THE METHODS IN THE INTERFACE


modular:
- adjective form of module
- module ≈ Lego piece


Principles of object-oriented design:
- modular code
- flexible code
- reusable code
- code that's easy to test
- problems are very localized (in a very specific place)


method signature:
methodName(comma-separated list of parameters)


method overloading:
- when you have two or more methods inside a class with the same method name
- THEY MUST HAVE DIFFERENT METHOD SIGNATURES


UML:
- Unified Modeling Language
- a 1:1 mapping between the UML diagram and Java code


Abstract keyword:
- prevents the creation of an object from that class
- compiler will throw an error if we try to instantiate an abstract class


T-shaped developer:
https://www.youtube.com/watch?v=CMKEhqMnxTg

INSTANce (noun) and INSTANtiate (verb)?
- same root
- creating an object
- instance == object
- instantiate create an object (create an instance)

concrete:
- not abstract

abstract:
- cannot create an object from an abstract class
- an abstract class cannot be instantiated
- cannot have an abstract method in a concrete class
  - in other words, if you want to have an abstract method, the class must also be abstract

i.e.,
- that is to say
- that is

explicit:
- directly or specifically mentioned

implicit:
- implied
- not directly mentioned


Encapsulation:
- capsule
  - put private members "inside a capsule"
- hiding


Accessors
- getters
  - public methods that retrieve/get/return fields
  - naming convention: `getFieldName()`
    - e.g., `getOwnerName()`
    - take no arguments
    - return a specific type
      - `return` keyword
- setters
  - public methods that set/modify fields
  - naming convention: `setFieldName()`
    - e.g., `setOwnerName(String newOwnerName)`
  - take an argument, which is the new value you want to set the field to
  - no return type, i.e., `void` keyword
  - uses the `this` keyword on the field
    - e.g., `this.authorName`

Access modifiers
- public
  - any class anywhere can use public members
- private
  - only members inside the class can use private members
- protected
  - members in subclasses can use protected members
- default
  - only members inside the same package can use default members


ValidationExample:
- use if-statements to check that only valid inputs are allowed in methods
- prevents misuse, operator error, negligence


Information hiding:
- subclass and superclass have fields with the same name; the subclass hides the superclass's field


Reference data types vs. primitive data types:
- 8 primitive data types:
  - integer
  - boolean
  - float
  - double
  - char
  - long
  - short
  - byte
- reference data type:
  - anything that is not a primitive
    - object
      - collections (array, ArrayList, HashMap)
      - String


Constructors:
- parameterized (explicit) constructor vs. no-arguments (implicit) constructor
  - I was misusing a C++ term it appears: explicit and implicit are terms from C++
- 3 types of constructors:
  - parameterized constructor
    - `ConstructorMethod(dataType1 param1, dataType2 param2, ...)`
  - no-argument constructor
    - `ConstructorName()`
  - default
    - nothing is even written where the constructor normally is
  - see https://www.freecodecamp.org/news/default-constructor-in-java/ for another example

Abstraction:
- hiding implementation details
- zoom out so smaller, less significant details aren't visible
- common phrases: 
  - "abtract away the details"
  - "level of abstraction"
- don't need to know *how* it works, just how to use it
- key tools:
  - abstract classes and methods
  - interfaces


API:
- application programming interface
  - one piece of software communicating directly with another without there being a user in the middle facilitating the interaction

interface (verb):
- interact with something

examples of interfaces:
- GUI, graphical user interface
- CLI, command line interface


Composition:
- "has-a" relationship
  - "whole" component has a "part" component
  - whole cannot exist without its parts
  - if a whole is destroyed, then the parts are destroyed too
- check out https://www.digitalocean.com/community/tutorials/composition-in-java-example
  - the whole is the `Person` class
  - the part is the `Job` class
    - the `Job` class has no constructor (it inherits one from the `Object` class)
    - the `Person` constructor creates a new `job` object and initializes the `job`'s fields through setters only
- composition gives developers more flexibility than just having to use subclassing
  - allows the developer to use only the parts of the "part" class that are needed 
  - one class can change but the other doesn't need to change
    - can localize errors and refactoring


### Reference Equality vs. Value Equality

parameter vs. argument:


*primitives and reference values:*
  8 primitives in Java:
    - char
    - int
    - double
    - float
    - boolean
    - short
    - long
    - byte
  - reference variables are any variables that are not primitives


Two types of equality:
1. values
  - two objects have the same values
  - semantic
  - **it is the developer's responsibility to define what it means for two objects to be equal in value**
    - requires overriding the `.equals()` method that every class inherits from the `Object` class

2. memory reference (location in RAM)
  - whether two objects have the same place in your computer's memory
  - synonymous terms:
    - memory location
    - memory address
    - location in memory
  - the `==` operator checks to see if two objects have the same memory location

semantically:
- meaning
- "human language"

syntactically:
- computer syntax
  - order of symbols

sentence 1: "Let's eat grandma"
sentence 2: "Let's eat, grandma"

syntactically, they are almost identical
semantically, they are extremely different


everything in Java is an object
every class inherits from the Object class




### Exceptions in Java

*Background: Compile Time vs. Runtime*
- https://www.baeldung.com/cs/runtime-vs-compile-time

Reminder how to compile and run a Java program from the command line:
0. `cd` into the directory where your `.java` files are located
1. `javac <file name>.java`
2. `java <file name>`
  - this will automatically find and run the `.class` files


**Two major kinds of exceptions:**

1. *Checked exceptions*
  - ones that the developer is forced to handle
  - examples:
    - FileNotFoundException
    - IOException

2. *Unchecked exceptions*
  - AKA runtime exceptions
  - not forced to handle
    - i.e., don't have to have a try-catch exception
  - can be ignored
  - examples:
    - IndexOutOfBoundsException
    - IllegalStateException
    - EmptyStackException
    - NullPointerException
    - ArrayIndexOutOfBoundsException

**Two ways to handle exceptions in Java:**
1. Add the exception to the method signature
2. surround the potentially-erroring code with a try-catch block
  - try block:
    - there can only be one try block
  - catch blocks:
    - there can be as many as you like
  - finally block:
    - optional
    - can only have one
    - executes no matter what happened in the previous try-catch blocks

*side note: if you have errors in your program, alt + enter is your friend!*


### Anonymous Classes



### Inner Classes
