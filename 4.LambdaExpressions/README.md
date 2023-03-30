# Lambda Expressions in Java

This section aims to refresh on the concept of Lambda Expressions in Java.

### Description

Lambda expressions are introduced in Java 8 they facilitate functional programming, and simplifies the development a lot.

### Why ?

Some points why lambda expressions

-   Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.

-   Optional parenthesis around parameter − No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.

-   Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

-   Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns a value.

### Importance

Following are the important points to be considered.

-   Lambda expressions are used primarily to define inline implementation of a functional interface, i.e., an interface with a single method only.

-   Lambda expression eliminates the need of anonymous class and gives a very simple yet powerful functional programming capability to Java.

### Lambda Expression Syntax

A lambda expression is composed of three parts:

| Argument List  | Arrow Token | Body  |
| -------------- | ----------- | ----- |
| (int x, int y) | ->          | x + y |

The body can be either a single expression or a statement block. In the expression form, the body is simply evaluated and returned. In the block form, the body is evaluated like a method body and a return statement returns control to the caller of the anonymous method.

### Common Use Case

-   Runnable Lambda: [RunnableExample](RunnableExample.java)
-   Comparator Lambda: [ComparatorExample](ComparatorExample.java)

### Summary

In this section we covered the basics of Lambda Expressions in Java
In the code examples we covered:

-   The correct syntax for lambda expressions.
-   Lambda expressions to replace anonymous inner classes.
-   Lambda expressions to implement functional interfaces.

---

Reference:

-   [https://www.oracle.com](https://www.oracle.com/)
