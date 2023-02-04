## Quiz 4
#### Sunday, Jan. 22, 2023

1. What do we need in order to run a Java class?
  - psvm, a main method

2. Give an example in code of something that is invoked.
  - constructors, object methods, static (class) methods
  - `methodName(arg1, arg2, ..., arg_n)`
  - System.out.println("some string here")
  - calling any method
  - invoking = called by something else; calling = the user calling the method (let's come back to this)

3. What keyword would you use if you want the compiler to throw an error if an object is instantiated from a class?
  - abstract

4. Write out the syntax to instantiate a class.
  - `ClassName objectName = new ClassName(arg1, arg2, ..., arg_n)` if it's a parameterized constructor
  - `ClassName objectName = new ClassName()` if it's a no-args constructor

5. What access modifier would you use if you want the member to be accessible by all possible classes (AKA the world)?
  - public

6. What access modifier would you use if you want the member to have the least amount of access possible?
  - private

7. Where are these member(s) still accessible if you use the access modifier from the previous question (private)?
  - the class in which the member is declared

8. The part of the method that is surrounded by `{}` when you define the method is called what?
  - body, method body
  - are there functions in Java? Not really; functions are called methods in Java

9. What is the maximum number of superclasses a subclass can extend in Java?
  - one

10. You want to extend a subclass called `SubmarineClass` from a superclass called `SuperDuperClass` and also inherit from an interface called `Interfayce`. What is the correct syntax?
  - `public class SubmarineClass extends SuperDuperClass implements Interfayce {}`

11. What is the maximum number of interfaces a class can implement?
  - unlimited, as many as you please

12. Packages are grouped together into a ________.
  - library

13. What convention is used to write constants?
  - ALL CAPS
  - all caps for the variable name, e.g.: `public final dataType CONSTANT = <some value>;`
  - `public final int NUMBER_OF_DAYS_IN_A_WEEK = 7;`

14. What keyword should you use with constants?
  - final

15. What does the `this` keyword refer to?
  - refers to the current object in a method or constructor
  - the current object that is created by the constructor

16. Declare a string variable `dayOfTheWeek` and initialize `dayOfTheWeek` on two separate lines.
  `String dayOfTheWeek;` // declaration
  `dayOfTheWeek = "Sunday";` // initialization

17. Declare and initialize a boolean variable called `JavaIsAwesome` on the same line.
  `boolean JavaIsAwesome = true;` // declaration and initialization

###### Refer to https://github.com/GoogleCloudPlatform/training-data-analyst/blob/master/courses/java-microservices/spring-cloud-gcp-guestbook/5b-pubsub/guestbook-frontend/src/main/java/com/example/frontend/FrontendApplication.java for the following questions:
18. What is the name of the class?
  - `FrontendApplication`

19. What package is this class in?
  - `com.example.frontend`

20. How many import statements are there?
  - nine

21. How many annotations are there?
  - five

22. How many methods are *defined* in this class?
  - `main`, `messageSender`

23. What are their return types?
  - `main` returns nothing because it's void, and `messageSender` returns a new object of `MessageSender` type
  - generally, we define a method like so:
    `accessor dataType methodName(param1, param2, ..., param_n) {}`
      examples:
        `public String myNameIs() {}`
        `private int numberOfChildren() {}`
        `boolean hasCheese() {}`
        `public SylvesterClass sylMethod() {}`
  - long story short: a class defines a data type, and a method can return objects of that data type (i.e., of that class)
