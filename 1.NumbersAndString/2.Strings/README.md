# Strings in Java

Strings, which are widely used in Java programming, are a sequence of characters. In the Java programming language, strings are objects.

The Java platform provides the String class to create and manipulate strings.

The most direct way to create a string is to write:

```java
String greeting = "Hello world!";
```

## Topics Covered

-   Creating Strings

As with any other object, you can create String objects by using the new keyword and a constructor. The String class has different constructors that allow you to provide the initial value of the string using different sources, such as an array of characters:

```java
char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
String helloString = new String(helloArray);
System.out.println(helloString);
```

-   see [CreateExample.java](CreateExample.java)

-   Concatenating Strings : [ConcatExample](ConcatExample.java)

-   Creating Format Strings: [CreateFormatExample](CreateFormatExample.java)

-   Converting Strings to Numbers: [#convertStringsToNumbers](ConvertNumbersExample.java)

-   Converting Numbers to Strings:[#convertNumbersToString](ConvertNumbersExample.java)

-   Getting Characters and Substrings by Index: [GettingCharacter](GettingCharacter.java)

-   Comparing Strings and Portions of Strings: [ComparingString](ComparingString.java)
