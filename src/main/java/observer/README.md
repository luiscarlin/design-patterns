# Observer Pattern

## What?

- Pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them of any state changes
- It is mainly used to implement distributed event handling systems, in "event driven" software.

## When?

- Use it when you want multiple objects to receive updates when another object changes
- Ex: Subject (publisher) with updated stocks information needs to send stock updates to multiple objects (observers - subscribers)

## Why?

- Loose coupling (Publisher doesn't need to know anything about the observers)
- (Negative) the observers get all updates. Even on information that the object may not care about.

## How?

- Create Subject class (publisher) that knows how to: 
  - Register/ unregister an observer
  - Notify observers
- Create the Observer interface with the method `update()`
- Create multiple Observer classes that implement Observer interface
  