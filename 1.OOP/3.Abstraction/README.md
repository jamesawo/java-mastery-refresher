# Abstraction in Java

Abstraction is a fundamental concept in object-oriented programming (OOP). It allows you to create a simplified representation of a complex system, by hiding the unnecessary details and showing only the essential features.

In Java programming, abstraction is achieved through two mechanisms - interfaces and abstract classes.

## Abstract Classes

An abstract class is a class that cannot be instantiated, and is meant to be extended by other classes. It can contain both abstract and non-abstract methods, as well as instance variables.

To create an abstract class in Java, you use the abstract keyword followed by the class name. Here's an example:

```java
public abstract class Shape {
    int x;
    int y;

    public void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public abstract void draw();
}

```

This abstract class defines two instance variables x and y, as well as a non-abstract method moveTo() and an abstract method draw(). Any class that extends the Shape class must implement the draw() method.

```java
public class Circle extends Shape {
    int radius;

    public void draw() {
        // draw a circle
    }
}
```

## Interfaces

An interface is a collection of abstract methods and constants that define a contract for a set of classes to follow. It provides a way for unrelated classes to share common behavior, without sharing any implementation details.

To create an interface in Java, you use the interface keyword followed by the name of the interface. Here's an example:

```java
public interface Drawable {
    void draw();
}
```

This interface defines a single abstract method draw(), which any class that implements it must implement. To implement an interface, a class must use the implements keyword, like this:

```java
public class Circle implements Drawable {
    public void draw() {
        // draw a circle
    }
}
```

## Conclusion

Abstraction is a powerful concept in Java programming, and is essential to writing clean, maintainable, and flexible code. By using interfaces and abstract classes, you can create a simplified representation of a complex system, and expose only the essential features to the outside world.
