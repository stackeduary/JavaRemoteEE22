## Quiz 2
#### Sunday, Jan. 16, 2023

For the class located here: https://docs.oracle.com/javase/tutorial/essential/environment/examples/PropertiesTest.java

1. What is the name of this class?
- PropertiesTest

2. List the methods (7)
- `main(String[] args)`
- `FileInputStream("myProperties.txt")`
  - constructor
- `Properties(System.getProperties())`
- `System.getProperties()`
- `p.load(propFile)`
- `System.setProperties(p)`
- `System.getProperties()`
- `.list(System.out)`

3. List the objects (3)
- `propFile`
- `p`
- `args` (from `String[] args` in `main`)

4. List the fields (1)
- `System.out`
  - https://www.javatpoint.com/post/java-system
  - https://docs.oracle.com/javase/8/docs/api/java/lang/System.html
  
5. List the arguments ~~(6)~~ (5)
- `"myProperties.txt"`
- `System.getProperties()`
- `propFile`
- `p`
- `System.out`
- ~~`args`~~
  - turns out, `args` is not an argument; it's a parameter 
  - see the "Parameters" bullet point here: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html

6. What is the difference between parameters and arguments?
- parameters: method definition
  - placeholders when defining the method
  - part of the method signature
  - e.g., `myAwesomeMethod(String foodType, int price)`
    - `foodType`, `price` are the parameters
- arguments: method calls (invocations)
  - e.g., `myAwesomeMethod("Cheeseburger", 9)`
    - `"Cheeseburger"`, `9` are the arguments