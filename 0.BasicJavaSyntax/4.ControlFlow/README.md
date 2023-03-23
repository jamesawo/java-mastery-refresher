# Control Flow Statements

This section explores control flow statements in Java programming. In this section, you'll find examples and exercises that demonstrate how to use control flow statements in Java to make decisions, repeat code, and handle exceptions.

## Topics

-   The If-Then Statement
-   The If-Then-Else Statement
-   The While and Do-while Statements
-   The For Statement
-   The Break Statement
-   The Continue Statement
-   The Return Statement
-   The Yield Statement

### The If-Then Statement

The if-then statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to true.

```java
void applyBrakes() {
    // the "if" clause: bicycle must be moving
    if (isMoving){
        // the "then" clause: decrease current speed
        currentSpeed--;
    }
}
```

### The If-Then-Else Statement

The if-then-else statement provides a secondary path of execution when an "if" clause evaluates to false.

```java
void applyBrakes() {
    if (isMoving) {
        currentSpeed--;
    } else {
        System.err.println("The bicycle is not moving!");
    }
}
```

### The While and Do-while Statements

The while statement continually executes a block of statements while a particular condition is true. Its syntax can be expressed as:

```java
while (expression) {
     statement(s)
}

```

The Java programming language also provides a do-while statement, which can be expressed as follows:

```java
do {
     statement(s)
} while (expression);

```

### The For Statement

The for statement provides a compact way to iterate over a range of values. Programmers often refer to it as the "for loop" because of the way in which it repeatedly loops until a particular condition is satisfied. The general form of the for statement can be expressed as follows:

```java
for (initialization; termination; increment) {
    statement(s)
}
```

### The Break Statement

You can also use an unlabeled break statement to terminate a for, while, or do-while loop. see example in [BreakStatement.java](https://github.com/jamesawo/java-mastery-refresher/tree/main/0.BasicJavaSyntax/4.ControlFlow/BreakStatement.java)

### The Continue Statement

The continue statement skips the current iteration of a for, while, or do-while loop.

The [ContinueDemo.java](https://github.com/jamesawo/java-mastery-refresher/tree/main/0.BasicJavaSyntax/4.ControlFlow/ContinueDemo.java) steps through a String, counting the occurrences of the letter p. If the current character is not a p, the continue statement skips the rest of the loop and proceeds to the next character. If it is a p, the program increments the letter count.

### The Return Statement

The return statement exits from the current method, and control flow returns to where the method was invoked. The return statement has two forms: one that returns a value, and one that does not. To return a value, simply put the value (or an expression that calculates the value) after the return keyword.

```java
return ++count;
```

```java
return;
```

### The Yield Statement

The yield statement exits from the current switch expression it is in. A yield statement is always followed by an expression that must produce a value. This expression must not be void. The value of this expression is the value produced by the enclosing switch expression.

```java
class Test {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public String calculate(Day d) {
        return switch (d) {
            case SATURDAY, SUNDAY -> "week-end";
                default -> {
                    int remainingWorkDays = 5 - d.ordinal();
                    yield remainingWorkDays;
                }
            };
    }
}
```

---

Resources

-   [https://dev.java/learn/](https://dev.java/learn/)
-   [https://www.tutorialspoint.com/java/](https://www.tutorialspoint.com/java/)
