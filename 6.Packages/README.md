# Packages in Java

In Java, packages are a way to organize your code into logical groups. A package is a collection of related classes, interfaces, and sub-packages.

### Description

Packages in Java help you organize your code into logical groups based on functionality or purpose. By organizing your code into packages, you can improve the maintainability, reusability, and readability of your code.

### Creating a Package

To create a package, you choose a name for the package and put a package statement with that name at the top of every source file that contains the types (classes, interfaces, enumerations, and annotation types) that you want to include in the package.

The package statement for example:

```java
package graphics;
```

must be the first line in the source file. There can be only one package statement in each source file, and it applies to all types in the file.

### Using Package Members

The types that comprise a package are known as the package members.

To use a public package member from outside its package, you must do one of the following:

-   Refer to the member by its fully qualified name
-   Import the package member
-   Import the member's entire package

Each is appropriate for different situations.

### Referring to a Package Member

Refer to a package member by using the member's fully qualified name, which includes the package name. Here is an example:

```java
graphics.Rectangle
```

You could use this qualified name to create an instance of graphics.Rectangle:

```java
graphics.Rectangle myRect = new graphics.Rectangle();
```

### Importing a Package Member

To import a specific member into the current file, put an import statement at the beginning of the file before any type definitions.

```java
import graphics.Rectangle;
```

Now you can refer to the Rectangle class by its simple name.

```java
Rectangle myRectangle = new Rectangle();
```

### Importing an Entire Package

To import all the types contained in a particular package, use the import statement with the asterisk (\*) wildcard character.

```java
import graphics.*;
```

### Conclusion

To create a package for a type, put a package statement as the first statement in the source file that contains the type (class, interface, enumeration, or annotation type).

To use a public type that is in a different package, you have three choices:

-   use the fully qualified name of the type,
-   import the type, or
-   import the entire package of which the type is a member.

---

Reference:

-   [https://dev.java/learn/packages](https://dev.java/learn/packages)
-   [https://docs.oracle.com/javase/tutorial/java/package/packages.html](https://docs.oracle.com/javase/tutorial/java/package/packages.html)
