# Arrays in Java

An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.
Each item in an array is called an element, and each element is accessed by its numerical index.

## Declaring a Variable to Refer to an Array

```java
// declares an array of integers
int[] anArray;
```

## Creating, Initializing, and Accessing an Array

One way to create an array is with the new operator.

```java
// create an array of integers
anArray = new int[10];
```

Assign values to each element of the array:

```java
anArray[0] = 100; // initialize first element
anArray[1] = 200; // initialize second element
anArray[2] = 300; // and so forth
```

Alternatively, you can use the shortcut syntax to create and initialize an array:

```java
int[] anArray = {
    100, 200, 300,
    400, 500, 600,
    700, 800, 900, 1000
};

```

## Copying Arrays

The System class has an arraycopy() method that you can use to efficiently copy data from one array into another:
