# Strategy Pattern

## What? 

- Pattern that allows similar algorithms in a list to be available to children of a class

## When?

- When you want to allow children of a class to switch algorithms on the fly
- When you want to restrict the types of some particular behavior
- When children should choose behavior from a list of possibilities

## Why?
 
 - Allows clients (subclasses) to switch from one algorithm to the other
 - Easy to increment bumber of algorithms (behavior) in the list
 - Allows children to choose behavior
 - Reduces conditionals
 - Avoids duplicate code
 - Hides complicated code
 

## How?

1. Define a family of independent algorithms that are mutually exclusive
1. Encapsulate each algorithm and make them interchangeable (i.e. an interface)
1. By composition, allow a base class to have an instance of the interface
1. Allow subclasses to switch between algorithms on the fly
