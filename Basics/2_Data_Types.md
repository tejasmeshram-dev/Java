## Variables and Data Types


1. **Variable**

A variable is a named storage location associated with a value.

`int age = 20;`

This contains three important pieces:

- int: the data type.
- age: the variable name.
- 20: the initial value.

The = operator assigns a value to the variable.

You can also declare a variable first and assign its value later.
```
int age;
age = 20;
```

Or update it:
```
int age = 20;
age = 25;
System.out.println(age);
```
Output: `25` 
The original value is replaced.

Declaration vs. initialization
```
int x;       // Declaration
x = 10;      // Assignment
int y = 20;  // Declaration and initialization
```

An uninitialized local variable cannot be read.
```
int x;
System.out.println(x); // Compilation error
```
Java does not automatically initialize local variables for you. However, fields in classes receive default values. 


2. Primitive Data Types

Java has eight primitive data types.

|Type	|Typical size	|Example	|Common use    |
|----    |----    |----    |----    |
|byte	|8 bits	byte |x = 100;	|Small integer ranges    |
|short	|16 bits	|short x = 1000;	|Smaller integer ranges    |
|int	|32 bits	|int x = 100;	|Most ordinary integers    |
|long	|64 bits	|long x = 10000000000L;	|Large integers    |
|float	|32 bits	|float x = 3.14f;	|Lower-precision decimals    |
|double	|64 bits	|double x = 3.14;	|Most ordinary decimal calculations    |
|char	|16 bits	|char x = 'A';	|A UTF-16 code unit    |
|boolean	|JVM-dependent representation	|boolean x = true;	|Logical true/false values    |

    
    **A. int**
    Used for most everyday integer calculations.
    ```
    int age = 20;
    int score = 100;
    int temperature = -5;
    ```
    The range is:
    
    `-2,147,483,648 to 2,147,483,647`
    
    Examples:
    ```
    int index = 0;
    int count = 10;
    int sum = 0;
    ```
    
    **B. long**
    `long` is used instead of `int` when your calculations might exceed the range of int.
    `long population = 10000000000L;`
    
    Notice the L at the end.     
    An integer literal such as 10000000000 is too large for the default int literal type. Adding L makes it a long literal.
    
    The range of long is approximately:
    
    `-9.22 × 10^18 to 9.22 × 10^18`
    
    For example:
    ```
    int a = 100000;
    int b = 100000;
    
    long result = (long) a * b;
    
    System.out.println(result);
    ```
    Output:
    
    `10000000000`
    
    - **Why cast before multiplying?**
    
        Because this is unsafe:
        
        `long result = a * b;`
        
        Both operands are int, so multiplication occurs using int arithmetic first. Overflow can happen before the result is assigned to the long.
        
        Casting one operand changes the arithmetic to long.
        
        **Rule**: If the problem involves large sums, products, prefix sums, or potentially large counts, examine the constraints before choosing your type.
    
    C. double
    Used for ordinary floating-point calculations. Integer arithmetic is common, but floating-point calculations appear in geometry, probability, and numerical problems.
    ```
    double price = 99.99;
    double average = 85.5;
    double pi = 3.1415926535;
    ```
    However, binary floating-point cannot represent every decimal value exactly.
    
    For example:
    
    `System.out.println(0.1 + 0.2);`
    
    You may see:
    
    `0.30000000000000004`
    
    This is normal floating-point behavior.
    
    D. boolean
    ```
    boolean found = false;
    boolean isValid = true;
    ```
    A boolean has only two possible values:
    ```
    true
    false
    ```
    It is useful for conditions, search results, and flags.
    
    Example:
    ```
    int[] nums = {2, 4, 6, 8};
    
    boolean found = false;
    
    for (int num : nums) {
        if (num == 6) {
            found = true;
            break;
        }
    }
    
    System.out.println(found);
    ```
    Output:
    
    `true`

    E. char
    ```
    char ch = 'a';
    char grade = 'A';
    char digit = '7';
    ```
    A char uses single quotation marks.
    ```
    char ch = 'a';       // Correct
    String text = "a";   // Also correct, but a different type
    ```
    A char represents one UTF-16 code unit, not necessarily one complete Unicode character.
    
    For standard English letters and digits, you can generally treat it as one character.
    
    Useful operations:
    ```
    char ch = 'a';
    
    System.out.println(ch + 1);
    System.out.println((char) (ch + 1));
    ```
    Output:
    
    ```98
    b```
    
    **Why?**
    
    - char is promoted to an integer in arithmetic.
    - 'a' has the numerical code-unit value 97.
    - 97 + 1 produces 98.
    - Casting the result to char produces 'b'.
    
    This becomes useful when solving certain character-based DSA problems.

3. **Reference Data Types: String and objects**

Consider:

`String name = "Zun";`

String is not a primitive data type. It is a class, and strings are objects.

Other common reference types include:
```
int[] nums = {1, 2, 3};
Scanner scanner;
ArrayList<Integer> list;
```
The latter examples involve an array, a class named Scanner, and a generic collection type named ArrayList.

### Primitive types vs. Reference types

Consider:
```
int a = 10;
int b = a;

b = 20;

System.out.println(a);
System.out.println(b);
```
Output:
```
10
20
```
The value stored in a was copied into b. Updating b does not change a.

Now consider an array:
```
int[] a = {1, 2, 3};

int[] b = a;

b[0] = 99;

System.out.println(a[0]);
System.out.println(b[0]);
```
Output:
```
99
99
```
**Why?**

- Both variables refer to the same array object.

- The assignment: `int[] b = a;` does not create a second array. It copies the reference. 


**NULL**

A reference variable can hold null, which means it does not currently refer to an object.
```
String name = null;

System.out.println(name);
```
Output:

`null`

But this causes a runtime error:
```
String name = null;

System.out.println(name.length());
```
The program throws a **NullPointerException** because there is no string object on which to call length().

You can check for null:
```
if (name != null) {
    System.out.println(name.length());
}
```
Important distinctions:
```
int x = 0;
boolean found = false;
String text = null;
```
These mean different things:

- 0 is an integer value.
- false is a boolean value.
- null indicates the absence of a referenced object.

**Note**: Primitive types such as int and boolean cannot hold null.

4. **Integer Division vs. Decimal Division**

`System.out.println(5 / 2);`

Output:

`2`

But:

`System.out.println(5.0 / 2);`

Output:

`2.5`

**Why?**

- In the first expression, both operands are integers. Java performs integer division, discarding the fractional part.

- In the second expression, one operand is a double, so Java performs floating-point division.

- Common mistake: calculating averages

Incorrect if you need the fractional part:
```
int a = 5;
int b = 2;

double average = (a + b) / 2;

System.out.println(average);
```
Output:

`3.0`

**The division happens before the result is assigned to average.**
```
Correct:

int a = 5;
int b = 2;

double average = (a + b) / 2.0;

System.out.println(average);
```
Output:

`3.5`

Alternatively:

`double average = (double) (a + b) / 2;`

**Remember: The type of the expression determines how the calculation happens, not the type of the variable receiving the result.**

**Bonus: Integer Overflow**

Consider:
```
int x = 2147483647;

System.out.println(x + 1);
```
Output:

`-2147483648`

- The result wraps around because the mathematical result is outside the range of int.

- Java does not automatically convert an overflowing int calculation to long.
