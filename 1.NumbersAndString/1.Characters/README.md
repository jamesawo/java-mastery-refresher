# Characters

Most of the time, if you are using a single character value, you will use the primitive char type. For example:

```java
char ch = 'a';
// an array of chars
char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

```

## Description

There are times, however, when you need to use a char as an object—for example, as a method argument where an object is expected.
The Java programming language provides a wrapper class that "wraps" the char in a Character object for this purpose.

```java
Character ch = new Character('a');
```

## Autoboxing Char

The Java compiler will also create a Character object for you under some circumstances. For example, if you pass a primitive char into a method that expects an object, the compiler automatically converts the char to a Character for you. This feature is called autoboxing or unboxing, if the conversion goes the other way.

## Some methods in Character class

-   boolean isLetter(char ch)
-   boolean isDigit(char ch)
-   boolean isWhitespace(char ch)
-   boolean isUpperCase(char ch)
-   boolean isLowerCase(char ch)
-   char toUpperCase(char ch)
-   char toLowerCase(char ch)
-   toString(char ch)
