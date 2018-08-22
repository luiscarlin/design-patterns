# Strategy Pattern

## What? 

- Pattern that allows classes to use a single strategy (algorithm) fro a group of similar strategies

## When?

- When you want to allow children of a class to switch strategies on the fly
- When you want to restrict the types of some particular behavior
- When children should choose behavior from a group of possibilities

## Why?
 
 - Allows clients (subclasses) to switch from one strategy to others
 - Easy to increment number of algorithms (strategies) in the group
 - Allows children to choose behavior
 - Reduces conditionals
 - Avoids duplicate code
 - Hides complicated code
 

## How?

1. Define a family of independent strategies that are exclusive
1. Encapsulate each algorithm in classes and make them interchangeable (i.e. implement an interface)
1. By composition, allow a base class to have an instance of the interface
1. Allow subclasses to switch between strategies on the fly
