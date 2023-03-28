# Generics in Java

This sections aims to provide some basic refresher to the concept of Generics in Java.

### Description

Java Generics are boxes that can hold any type of object, so you don't have to create a new box for each type of object. This makes it easier to write code because you can reuse the same box for lots of different things.

### Why Use Generics?

Code that uses generics has many benefits over non-generic code:

-   Stronger type checks at compile time. A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety. Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.

-   Elimination of casts. Without generics requires casting.

-   Enabling programmers to implement generic algorithms. By using generics, programmers can implement generic algorithms that work on collections of different types, can be customized, and are type safe and easier to read.

### Topic Covered

| Topic                    | Code Sample                                     |
| ------------------------ | ----------------------------------------------- |
| Single Type Parameters   | [SingleTypeExample](SingleTypeExample.java)     |
| Multiple Type Parameters | [MultipleTypeExample](MultipleTypeExample.java) |
| Raw Types                | [RawTypeExample](RawTypeExample.java)           |
| Bounded Type Parameters  | [BoundedType](BoundedType.java)                 |
| Generic Method           | [GenericMethod](GenericMethod.java)             |

### Conclusion

Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types, respectively.
Using Java Generic concept, we might write a generic method for sorting an array of objects, then invoke the generic method with Integer arrays, Double arrays, String arrays and so on, to sort the array elements.
