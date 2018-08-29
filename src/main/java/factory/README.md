# Factory Pattern

## What?

- Pattern that creates instances of classes that have the same common interface (abstract base class, interface, etc)

## When?

- When you want to abstract instance creation
- When you don't want to use new operator
- When you have multiple related classes

## Why?

- It hides instantiation logic

## How?

- Create an abstract base class (cannot be instantiated)
- Create a factory class that returns the base class type
- Create method "make" in the factory that returns a new instance of the base class based on input arguments
