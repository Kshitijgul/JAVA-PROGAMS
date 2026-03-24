

# JAVA-BASICS- WITH DSA STRIVER

## Java Program to Count Digits of a Number

This Java program demonstrates two methods to count the digits of a number:

1. **Using Logarithms (`Log_count`)**: This method calculates the number of digits by applying the logarithm base 10 (`log10`) function. This approach is efficient for large numbers.
   
2. **Using Iteration (`count_digits`)**: This method counts the digits by iterating through the number, repeatedly dividing by 10 until the number becomes zero.

## Program Explanation

### Methods

1. **`Log_count(int n)`**:
   - Uses the `Math.log10()` function to find the logarithm base 10 of the absolute value of the number.
   - The number of digits is calculated as `floor(log10(n)) + 1`.
   - Handles the special case when `n = 0` by returning 1 directly, as 0 has exactly 1 digit.

2. **`count_digits(int n)`**:
   - This method works by using a loop to extract the last digit of the number using the modulus operation (`n % 10`).
   - It increments the digit count on each iteration and divides the number by 10 to remove the last digit.

### Code

```java
import java.lang.Math;

class HelloWorld {
  
  // Method to count digits using logarithm
  public static int Log_count(int n) {
    if (n == 0) {
        return 1; // Special case for 0
    }
    return (int) Math.floor(Math.log10(Math.abs(n))) + 1;
  }

  // Method to count digits using iteration
  public static int count_digits(int n){
      int count = 0;
      while(n != 0){
          count++;
          n = n / 10;
      }
      return count;
  }

  // Method to reverse a number
  public static int reverseNumber(int n) {
      int reversed = 0;
      while(n != 0) {
          int last_digit = n % 10;
          reversed = reversed * 10 + last_digit;
          n = n / 10;
      }
      return reversed;
  }

  // Main method to test all methods
  public static void main(String[] args) {
      int n = 8977;  // Example number to test
      System.out.println("Digit Count (Iteration): " + count_digits(n));  // Output: 4
      System.out.println("Digit Count (Logarithm): " + Log_count(n));     // Output: 4
      System.out.println("Reversed Number: " + reverseNumber(n));         // Output: 7798
  }
}
```

## Program to Reverse a Number

The third method, `reverseNumber(int n)`, reverses the given number by following these steps:

1. Extract the last digit of the number using the modulus operation (`n % 10`).
2. Multiply the current reversed number by 10 and add the last digit to it.
3. Remove the last digit from the original number by dividing it by 10.
4. Repeat this process until the original number becomes zero.

### Code Explanation

- The method `reverseNumber` initializes a variable `reversed` to store the reversed number.
- It iterates over the digits of the number and constructs the reversed number by appending each extracted digit to the reversed result.
  
The output for the example number `8977` will be:

- **Digit Count (Iteration)**: 4
- **Digit Count (Logarithm)**: 4
- **Reversed Number**: 7798

This program covers the basic use of loops, modulus operations, logarithms, and reversing a number efficiently in Java.



# Java Program to Find Divisors of a Number

This Java program is designed to find and print all the divisors of a given number `n`. The program takes an integer input from the user and efficiently finds the divisors by iterating up to the square root of the number.

## Program Explanation

### Key Concepts

1. **Divisors**:
   - A divisor of a number `n` is any integer `i` that divides `n` without leaving a remainder, i.e., `n % i == 0`.
   - Divisors come in pairs. For example, if `i` is a divisor, then `n/i` is also a divisor.
   - To avoid duplicate printing for perfect squares (like 16 with divisors 4 and 4), the program checks if `i` is equal to `n/i`.

### Efficiency

Instead of iterating all the way from 1 to `n`, this program only iterates up to `sqrt(n)` (square root of `n`). For every divisor `i` found in this range, the corresponding divisor `n/i` is also calculated. This optimization reduces the time complexity from O(n) to O(sqrt(n)).

## Code

```java
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input the number
        
        // Loop from 1 to sqrt(n) to find divisors
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {  // Check if i is a divisor
                System.out.println(i);  // Print i
                if ((n / i) != i) {  // Avoid duplicate for perfect square divisors
                    System.out.println(n / i);  // Print the corresponding divisor n/i
                }
            }
        }
    }
}
```

### Example

**Input**:  
`n = 36`

**Output**:
```
1
36
2
18
3
12
4
9
6
```

### How It Works:
1. The program starts by reading an integer input `n` from the user.
2. It loops through numbers `i` starting from 1 and goes up to the square root of `n`.
3. For every `i` that divides `n` evenly, the program prints both `i` and `n/i` as divisors, ensuring that divisors are not duplicated for perfect squares.

### Special Cases:
- **For a perfect square (e.g., 36)**: It avoids printing the square root divisor twice (e.g., it prints `6` only once in the example above).
- **For input `n = 1`**: The program will print `1` as the only divisor.

## How to Run the Program

1. Compile the Java program.
2. Run the program.
3. Enter an integer when prompted. The program will output all divisors of that number.

### Example Execution

```
Input: 28
Output:
1
28
2
14
4
7
```

## Conclusion

This program efficiently finds all divisors of a number using an optimized approach, reducing unnecessary iterations. It's a great example of utilizing mathematical properties to improve performance.

---

# Java Program to Find GCD of Two Numbers

This Java program provides three different methods to calculate the **Greatest Common Divisor (GCD)**, also known as the **Greatest Common Factor (GCF)**, of two given numbers. The GCD is the largest number that divides both numbers without leaving a remainder.

## Program Overview

The program takes two integer inputs from the user and calculates the GCD using the following approaches:

1. **Brute Force Approach**: This method checks all numbers from `1` to the smaller of the two input numbers, and stores the largest number that divides both numbers.

2. **Optimized Iterative Approach**: This method iterates from the smaller of the two input numbers down to `1`, checking divisibility. As soon as it finds the largest common divisor, it breaks out of the loop.

3. **Euclidean Algorithm**: This efficient method repeatedly replaces the larger number by the remainder when the larger number is divided by the smaller number, until one of the numbers becomes zero. The non-zero number at the end is the GCD.

## Code Explanation

### Input

- The program prompts the user to input two integers, `n1` and `n2`.

### Output

- The program prints the GCD of the two numbers using each approach:
  1. **Brute Force Approach**
  2. **Optimized Iterative Approach**
  3. **Euclidean Algorithm**

### Code

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two integers
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = 0;

        // Brute Force Approach
        System.out.println("Brute Force Approach");
        for(int i = 1; i <= Math.min(n1, n2); i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);

        // Optimized Iterative Approach
        System.out.println("Second Approach");
        for(int i = Math.min(n1, n2); i > 1; i--) {
            if(n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;
            }
        }

        // Euclidean Algorithm
        System.out.println("Euclidean Approach");
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }

        // Output the result of the Euclidean approach
        if (n1 == 0) {
            System.out.print(n2);
        } else {
            System.out.print(n1);
        }
    }
}
```

### Program Breakdown

#### 1. **Brute Force Approach**:
   - The program iterates from `1` to the smaller of `n1` and `n2`.
   - For each number `i`, it checks if both `n1` and `n2` are divisible by `i`.
   - The largest `i` that divides both numbers is stored as the GCD.
   - **Time Complexity**: O(min(n1, n2)).

#### 2. **Optimized Iterative Approach**:
   - The program starts from the smaller of `n1` and `n2` and iterates downwards.
   - As soon as a divisor is found that divides both numbers, the loop breaks, and the GCD is printed.
   - **Time Complexity**: O(min(n1, n2)), but with early stopping once the GCD is found.

#### 3. **Euclidean Algorithm**:
   - This approach uses repeated division. It replaces the larger number with the remainder of dividing the larger number by the smaller one.
   - The process continues until one of the numbers becomes zero. The non-zero number is the GCD.
   - **Time Complexity**: O(log(min(n1, n2))), which is the most efficient method among the three.

### Example Execution

```
Input:
24
36

Output:
Brute Force Approach
12
Second Approach
12
Euclidean Approach
12
```

### How to Run the Program

1. **Compile and run the Java program**.
2. **Input two integers** when prompted.
3. The program will calculate and print the GCD using all three approaches.

### Example Input and Output

**Input**:
```
48
18
```

**Output**:
```
Brute Force Approach
6
Second Approach
6
Euclidean Approach
6
```

## Conclusion

This program provides three methods to find the GCD of two numbers, highlighting both brute-force and optimized approaches. The **Euclidean Algorithm** is the most efficient, especially for larger numbers, and is widely used in various applications.

---

---

# Recursion Tasks Program

This Java program demonstrates three tasks using recursion:

1. **Write a name `n` times**.
2. **Print numbers from 1 to `n`**.
3. **Print numbers from `n` to 1**.

## Table of Contents
- [Description](#description)
- [Program Structure](#program-structure)
- [Usage](#usage)
- [Code](#code)
- [How to Run](#how-to-run)
- [Output Example](#output-example)

## Description

This program uses recursion to complete three different tasks:
1. **Write a given name multiple times** – A function that prints the provided name `n` times using recursion.
2. **Print numbers from 1 to `n`** – A function that prints numbers in ascending order from 1 to `n`.
3. **Print numbers from `n` to 1** – A function that prints numbers in descending order from `n` to 1.

## Program Structure

### Functions:

1. **writeName(int n, String name):**
   - Recursively prints the `name` `n` times.

2. **printOneToN(int n):**
   - Recursively prints numbers from 1 to `n` in ascending order.

3. **printNToOne(int n):**
   - Recursively prints numbers from `n` to 1 in descending order.

## Usage

You can modify the integer `n` and the name string in the `main` method to customize the output.

- **writeName**: Call this function to print the name a certain number of times.
- **printOneToN**: Call this function to print numbers from 1 to `n`.
- **printNToOne**: Call this function to print numbers from `n` to 1.

## Code

```java
public class RecursionTasks {

    // Function 1: Write name n times
    static void writeName(int n, String name) {
        // Base case
        if (n == 0) {
            return;
        }
        // Print name
        System.out.println(name);
        // Recursive call
        writeName(n - 1, name);
    }

    // Function 2: Print numbers from 1 to n
    static void printOneToN(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Recursive call for smaller problem
        printOneToN(n - 1);
        // Print number after recursive call (ensures ascending order)
        System.out.print(n + " ");
    }

    // Function 3: Print numbers from n to 1
    static void printNToOne(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Print number before recursive call (ensures descending order)
        System.out.print(n + " ");
        // Recursive call for smaller problem
        printNToOne(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        String name = "John";

        System.out.println("Writing name " + n + " times:");
        writeName(n, name);

        System.out.println("\nNumbers from 1 to " + n + ":");
        printOneToN(n);

        System.out.println("\n\nNumbers from " + n + " to 1:");
        printNToOne(n);
    }
}
```

## How to Run

1. **Compile the program**:  
   Open your terminal/command prompt and navigate to the directory containing the Java file. Compile the program using:
   ```bash
   javac RecursionTasks.java
   ```

2. **Run the program**:  
   After successful compilation, run the program:
   ```bash
   java RecursionTasks
   ```

3. The output will display the name printed `n` times, numbers from 1 to `n`, and numbers from `n` to 1.

## Output Example

For `n = 5` and name = "John", the program will output:

```
Writing name 5 times:
John
John
John
John
John

Numbers from 1 to 5:
1 2 3 4 5 

Numbers from 5 to 1:
5 4 3 2 1
```

## License

This project is open-source and available under the [MIT License](LICENSE).

---



# SUM of n Numbers Recursion in Java

This Java program demonstrates two approaches to solving a problem using recursion: functional recursion and parameterized recursion. The goal of the program is to calculate the sum of the first `n` natural numbers using both techniques.

## Functional Recursion

In the **functional** recursion approach, we define a recursive function `functional` that directly returns the result of adding `n` to the sum of the first `n-1` numbers. The recursion terminates when `n` reaches 0.

### Code Example:

```java
public static int functional(int n) {
    if (n == 0) {
        return 0;
    }
    return n + functional(n - 1);
}
```

## Parameterized Recursion

In the **parameterized** recursion approach, we pass an additional argument (`sum`) to the recursive function. This argument keeps track of the accumulated sum. The recursion terminates when `n` reaches 0, and the final value of `sum` is returned.

### Code Example:

```java
public static int parameterized(int n, int sum) {
    if (n == 0) {
        return sum;
    }
    return parameterized(n - 1, sum + n);
}
```

## How to Run

1. **Input**: The program accepts an integer `n` from the user, representing the number up to which the sum of natural numbers will be calculated.
2. **Output**: The program prints the sum using both the functional and parameterized recursion methods.

### Sample Input:
```
5
```

### Sample Output:
```
15
15
```

## Explanation

For the input `n = 5`, both approaches will calculate the sum of numbers `1 + 2 + 3 + 4 + 5`, which equals `15`. The program prints the result twice: once using the functional approach and once using the parameterized approach.

---

# Array Reversal Using Recursion

This project demonstrates two approaches for reversing an array using recursion in Java. It contains two methods: 
- `reverse()`: Reverses the array by passing both the start and end indices.
- `reverse2()`: Reverses the array by passing only one value (the current index).

## Overview

This Java program provides two methods to reverse an array recursively. The program accepts a sample array, calls the `reverse2()` method to reverse the array, and prints the reversed array.

## Usage

You can choose between two approaches:

- **Method 1**: Uses two indices (start and end) to reverse the array.
- **Method 2**: Uses one index (current index) to reverse the array.

The code currently uses `reverse2()` for array reversal. To use `reverse()`, uncomment the relevant line in the `main()` method.

## How it Works

### Method 1: `reverse()`

- **Parameters**: Takes the array, a starting index (`l`), and an ending index (`r`).
- **Operation**: Swaps the elements at indices `l` and `r` and recursively calls itself by incrementing `l` and decrementing `r`. Stops recursion when `l >= r`.

### Method 2: `reverse2()`

- **Parameters**: Takes the array and the starting index (`l`).
- **Operation**: Swaps the element at index `l` with the corresponding element from the other end of the array (`n - l - 1`), where `n` is the length of the array. Recursively calls itself by incrementing `l` until `l` reaches the middle of the array (`n / 2`).

## Example Output

```
5
4
3
2
1
```



By default, `reverse2()` is used. If you want to test `reverse()`, simply comment out `reverse2()` and uncomment the `reverse()` line in the `main()` method.

## Code

```java
public class Main {
    // Method 1: Reverse array by passing two indices (l and r)
    public static void reverse(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1);
    }

    // Method 2: Reverse array by passing only one index (l)
    public static void reverse2(int[] arr, int l) {
        int n = arr.length;
        
        // Base case: if the current index reaches the middle, stop recursion
        if (l >= n / 2) {
            return;
        }
        
        // Swap element at index l with element at index (n - l - 1)
        int temp = arr[l];
        arr[l] = arr[n - l - 1];
        arr[n - l - 1] = temp;
        
        // Recursive call with the next index
        reverse2(arr, l + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        // Uncomment to use Method 1: reverse with two indices
        // reverse(arr, 0, n - 1);
        
        // Using Method 2: reverse by passing only one index
        reverse2(arr, 0);
        
        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

---


By default, `reverse2()` is used. If you want to test `reverse()`, simply comment out `reverse2()` and uncomment the `reverse()` line in the `main()` method.

---
---

# Recursive Java Program for Fibonacci Sequence and Factorial Calculation

## Description
This Java program demonstrates the use of recursion to solve two classic mathematical problems:
1. **Fibonacci Sequence**: It generates the Fibonacci numbers up to a given number `n`.
2. **Factorial Calculation**: It calculates the factorial of a given number.

Recursion is a technique where a function calls itself in order to break down a problem into smaller instances of the same problem. Both the Fibonacci and factorial problems are well-suited to recursive solutions.

---

---

## Fibonacci Sequence

The Fibonacci sequence is a series of numbers where:
- The first two numbers are `1` and `1`.
- Each subsequent number is the sum of the previous two numbers.

### Formula:
```
F(n) = F(n-1) + F(n-2)
```
where `F(0) = 1` and `F(1) = 1`.

## Factorial Calculation

The factorial of a number `n` is the product of all positive integers less than or equal to `n`.

### Formula:
```
n! = n * (n-1)!
```
where `1! = 1` and `0! = 1`.

---

## Program Code

```java
public class Main{
    
    // Recursive method to calculate Fibonacci number at position 'n'
    public static int Fibbonacci(int n){
        if(n <= 1){
            return 1;
        }
        return Fibbonacci(n - 1) + Fibbonacci(n - 2);
    }
    
    // Recursive method to calculate the factorial of 'n'
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return factorial(n - 1) * n;
    }
    
    public static void main(String args[]){
        int n = 10; // The number of Fibonacci terms to print
        
        // Calculate the factorial of 4
        System.out.println("Factorial of 4: " + factorial(4));
        
        // Print Fibonacci sequence from 0 to n
        System.out.println("Fibonacci sequence up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println(Fibbonacci(i));
        }
    }
}
```

---



## Sample Output

```
Factorial of 4: 24
Fibonacci sequence up to 10:
1
1
2
3
5
8
13
21
34
55
89
```

---

## Explanation

### Fibonacci Sequence:
- The `Fibbonacci()` method uses recursion to calculate the Fibonacci number for a given index `n`.
- It starts from `n = 0` and continues to `n = 10`, printing each Fibonacci number.

### Factorial Calculation:
- The `factorial()` method is also recursive and calculates the factorial of `4`.
- The program prints the result: `24`, because `4! = 4 * 3 * 2 * 1 = 24`.

---

## Key Concepts:
- **Recursion**: A technique where a function calls itself to break down a problem.
- **Base Case**: A condition to stop the recursion. In the Fibonacci and factorial methods, it is when `n` is less than or equal to 1.
- **Efficiency Considerations**: The recursive Fibonacci function in its current form has a high time complexity due to repeated calculations. Optimizations like memoization can be applied for larger `n`.

---

## License
This project is free to use for learning and educational purposes.

---


