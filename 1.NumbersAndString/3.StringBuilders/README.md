# String Builders in Java

String objects are like StringBuilder objects, except that they can be modified.

## Description

Internally, these objects are treated like variable-length arrays that contain a sequence of characters. At any point, the length and content of the sequence can be changed through method invocations.

Unlike strings, every string builder also has a capacity, the number of character spaces that have been allocated. The capacity, which is returned by the capacity() method, is always greater than or equal to the length (usually greater than) and will automatically expand as necessary to accommodate additions to the string builder.

## StringBuilder Constructors

-   **StringBuilder()**: Creates an empty string builder with a capacity of 16 (16 empty elements).
-   **StringBuilder(CharSequence cs)**: Constructs a string builder containing the same characters as the specified CharSequence, plus an extra 16 empty elements trailing the CharSequence.
-   **StringBuilder(int initCapacity)**: Creates an empty string builder with the specified initial capacity.
-   **StringBuilder(String s)**: Creates a string builder whose value is initialized by the specified string, plus an extra 16 empty elements trailing the string.

## StringBuilder Methods

-   **length()**: returns the length of the character sequence in the builder.
-   **capacity()**: returns the number of character spaces that have been allocated.

## StringBuilder Operations

Here are a number of the methods of the StringBuilder class.

-   **append()**: append any primitive type or object to a string builder
-   **delete(int start, int end)**: deletes the subsequence from start to end
-   **insert(int offset)**: take the element to be inserted as a second argument.
-   **replace(int start, int end, String s)**:
-   **setCharAt(int index, char c)**:
-   **reverse()**: reverse the sequence of characters in this string builder.
-   **toString()**: return a string that contains the character sequence
