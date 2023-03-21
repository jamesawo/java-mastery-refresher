# Operators in Java

Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.

## The Simple Assignment Operator

One of the most common operators that you'll encounter is the simple assignment operator =. It assigns the value on its right to the operand on its left:

```java
int cadence = 0;
int speed = 0;
int gear = 1;
```

This operator can also be used on objects to assign object references.

## The Arithmetic Operators

Arithmetic Operators in Java programming language provides operators that perform addition, subtraction, multiplication, and division.

| Operator | Description                                            |
| -------- | ------------------------------------------------------ |
| +        | Additive operator (also used for String concatenation) |
| -        | Subtraction operator                                   |
| \*       | Multiplication operator                                |
| /        | Division operator                                      |
| %        | Remainder operator                                     |

## The Unary Operators

The unary operators require only one operand; they perform various operations such as incrementing/decrementing a value by one, negating an expression, or inverting the value of a boolean.

| Operator | Description                                                 |
| -------- | ----------------------------------------------------------- |
| +        | Unary plus operator; indicates positive value               |
| -        | Unary minus operator; negates an expression                 |
| ++       | Increment operator; increments a value by 1                 |
| --       | Decrement operator; decrements a value by 1                 |
| !        | Logical complement operator; inverts the value of a boolean |

## The Equality and Relational Operators

The equality and relational operators determine if one operand is greater than, less than, equal to, or not equal to another operand. Keep in mind that you must use ==, not =, when testing if two primitive values are equal.

| Operator | Description              |
| -------- | ------------------------ |
| ==       | equal to                 |
| !=       | not equal to             |
| >        | greater than             |
| >=       | greater than or equal to |
| <        | less than                |
| <=       | less than or equal to    |

## The Conditional Operators

The && and || operators perform Conditional-AND and Conditional-OR operations on two boolean expressions. These operators exhibit "short-circuiting" behavior, which means that the second operand is evaluated only if needed.

| Operator | Description     |
| -------- | --------------- |
| &&       | Conditional-AND |
| \|\|     | Conditional-OR  |

## The Type Comparison Operator Instanceof

The instanceof operator compares an object to a specified type. You can use it to test if an object is an instance of a class, an instance of a subclass, or an instance of a class that implements a particular interface.

```java
boolean isInstance = obj1 instanceof Parent;
```

## The Bitwise and Shift Operators

In Java, bitwise operators perform operations on integer data at the individual bit-level. Here, the integer data includes byte, short, int, and long types of data. The operators discussed in this section are less commonly used. Therefore, their coverage is brief; the intent is to simply make you aware that these operators exist.

There are 7 operators to perform bit-level operations in Java.

| Operator | Description          |
| -------- | -------------------- |
| \|       | Bitwise OR           |
| `&`      | Bitwise AND          |
| `^`      | Bitwise XOR          |
| `~`      | Bitwise Complement   |
| `<<`     | Left Shift           |
| `>>`     | Signed Right Shift   |
| `>>>`    | Unsigned Right Shift |
