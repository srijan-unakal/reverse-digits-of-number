# Reversing a number using Java

A simple Java console program that reverses the digits of a number entered by the user.

## Description

This program asks the user to enter a number and prints the reversed form of that number.
After displaying the result, the program asks the user if they want to continue. The user can perform multiple reversals in a single run.

The program demonstrates basic Java concepts such as loops, user input, conditional statements, and arithmetic operations.

## Features

* Accepts a number from the user through the terminal.
* Reverses numbers of any length.
* Allows repeated execution without restarting the program.
* Simple and beginner-friendly implementation.

## Concepts Used

* `Scanner` for user input
* Infinite loop using `for(;;)`
* `while` loop
* Modulus operator `%` for extracting digits
* Integer division `/`
* Conditional statements (`if`)
* Character handling with `Character.toUpperCase()`

## Example Run

```
This program reverses the digits of a number

Enter a number: 1234
Entered number: 1234
Reversed number: 4321

Do you want to continue (Y/N): Y

Enter a number: 2001
Entered number: 2001
Reversed number: 1002

Do you want to continue (Y/N): N
Thank you!
```

## How to Run

1. Compile the program

```
javac reverse.java
```

2. Run the program

```
java reverse
```

## Author

### Srijan Unakal

https://github.com/srijan-unakal
