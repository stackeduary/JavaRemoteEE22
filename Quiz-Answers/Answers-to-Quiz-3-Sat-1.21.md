## Quiz 3
#### Saturday, Jan. 21, 2023

1. What is a static method?
- method that is called by a class, not an object; e.g., `Math.pow(base, exponent)`
- you don't need to create an object in order to call the method
- doesn't have the `this` keyword available

2. How do you call a static method?
- `className.methodName(arguments)` from outside the class in which the static method is defined
- `methodName(arguments)` from inside the class in which the static method is defined

3. How do you turn a regular directory into a git repository?
- `git init`

4. What is another word for "invoke"?
- call

5. What do unit tests test?
- individual methods or classes (i.e., small units of code)

6. How do you show the current directory you're in in a Linux terminal (e.g., Bash)?
- `pwd`

7. How do you move to the parent directory in a Linux terminal (e.g., Bash)?
- `cd ..`

8. How do you show all the files and folders in the current directory, including hidden ones, and display them in a table form in a Linux terminal (e.g., Bash)?
- `ls -la`
- `ls -l -a`
- `ls -al`
- `ls -lah`
- (all the above are equivalent)

9. How do you add all the files in the current directory to your local git repository?
- `git add --all`
- `git add -A`
- `git add .`
- (all the above are equivalent)

10. What is a method's signature?
- `methodName(param1, param2, ..., param_n)`
- name of the method followed by the parameter list in parentheses

11. _______ _______ is the situation when a class has multiple methods with the same name. (two words)
- method overloading
- overload: lots of methods
- Java requires overloaded methods to have different method signatures, otherwise, it throws a compiler error
    - so that means that parameter lists are different between all the methods

12. What method must a subclass call to inherit from a superclass?
- `super(superclass parameters)`
    - note: there was some debate about whether `super` is just a keyword or also a method. See https://www.geeksforgeeks.org/difference-between-super-and-super-in-java-with-examples/ for more information. But I was just looking for `super(superclass parameters)`, which is a call to the superclass's constructor, which itself is a method. We didn't reach a consensus in the debate, but the goal was just to reinforce how the super keyword is used.

13. What keyword must you use for inheritance?
- `extends`

14. What keyword must you use for an interface?
- `implements`

15. Classes are grouped together into a ________.
- package

16. _______ _______ is the situation when a subclass has its own implementation of a method defined in the superclass. (two words)
- method overriding
  - override = replace
      - providing a new version
      - take the place of
      - supersede
- if the method is from an interface (without the `default` keyword) or an abstract class, it must be implemented, which means that it is overridden (replaced) by default

17. What does the word "member" refer to (as in, class members)?
    - (rephrase the question: what are the two categories of things in an object or class?)
- methods, fields
    - members is a more general, more encompassing term since it allows us to refer to both the methods and the fields with a single term
