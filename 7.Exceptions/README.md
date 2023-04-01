# Exceptions in Java

The Java programming language uses exceptions to handle errors and other exceptional events. This section describes when and how to use exceptions.

### Description

In Java, an exception is an event that interrupts the normal flow of program execution. It occurs when the program encounters an error, such as an incorrect input or a resource that cannot be found, and the error cannot be handled by the program.

Exceptions in Java are objects that belong to a class that extends the Throwable class.

### Types of exceptions in Java

-   **Checked exceptions**: These are the exceptions that must be handled by the programmer in their code.

    > Examples of checked exceptions include

    -   IOException,
    -   SQLException, and
    -   ClassNotFoundException.

-   **Unchecked exceptions**: These are the exceptions that do not need to be handled explicitly by the programmer. They are usually caused by programming errors.

### Catching and Handling Exceptions

This section describes how to use the three exception handler components — the `try`, `catch`, and `finally` blocks — to write an exception handler.

### The Try Block

The first step in constructing an exception handler is to enclose the code that might throw an exception within a try block. In general, a try block looks like the following:

```java
try {
    code
}
catch and finally blocks . . .
```

### The Catch Blocks

You associate exception handlers with a try block by providing one or more catch blocks directly after the try block. No code can be between the end of the try block and the beginning of the first catch block.

```java
try {

} catch (ExceptionType name) {

} catch (ExceptionType name) {

}
```

Each catch block is an exception handler that handles the type of exception indicated by its argument. The argument type, ExceptionType, declares the type of exception that the handler can handle and must be the name of a class that inherits from the Throwable class.

### Multi-Catching Exceptions

You can catch more than one type of exception with one exception handler, with the multi-catch pattern.

In the catch clause, specify the types of exceptions that block can handle, and separate each exception type with a vertical bar (|):

```java
catch (IOException|SQLException ex) {
    logger.log(ex);
    throw ex;
}
```

### The Finally Block

The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs. But finally is useful for more than just exception handling — it allows the programmer to avoid having cleanup code accidentally bypassed by a return, continue, or break. Putting cleanup code in a finally block is always a good practice, even when no exceptions are anticipated.

```java
finally {
    if (out != null) {
        System.out.println("Closing PrintWriter");
        out.close();
    } else {
        System.out.println("PrintWriter not open");
    }
}
```

### The Try-with-resources Statement

The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it.

### Throwing Exceptions

All methods use the throw statement to throw an exception. The throw statement requires a single argument: a throwable object. Throwable objects are instances of any subclass of the Throwable class. Here's an example of a throw statement.

```java
throw someThrowableObject;
```

### Conclusion

A program can use exceptions to indicate that an error occurred. To throw an exception, use the throw statement and provide it with an exception object — a descendant of Throwable — to provide information about the specific error that occurred. A method that throws an uncaught, checked exception must include a throws clause in its declaration.

A program can catch exceptions by using a combination of the try, catch, and finally blocks.

-   The try block identifies a block of code in which an exception can occur.
-   The catch block identifies a block of code, known as an exception handler, that can handle a particular type of exception.
-   The finally block identifies a block of code that is guaranteed to execute, and is the right place to close files, recover resources, and otherwise clean up after the code enclosed in the try block.
