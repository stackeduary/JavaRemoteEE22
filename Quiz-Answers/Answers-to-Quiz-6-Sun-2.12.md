## Quiz 6
#### Sunday, Feb. 12, 2023

1. Name the three categories of design patterns.
- creational
- behavioral
- structural

2. Name at least two patterns in one of the categories.
- creational:
  - Singleton
  - Factory Method
- behevioral
  - Iterator
  - Command
- structural
  - Adapter
  - Decorator

Bonus: Describe the Singleton pattern in 1-2 sentences.
- class only one instance that globally accessible
- private constructor
- public static `getInstance()` method that checks if the instance exists, returns the instance; and if it doesn't, calls the private constructor to create (instantiate) this object
