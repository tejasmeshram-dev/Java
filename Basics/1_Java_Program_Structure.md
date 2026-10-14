## Java Program Structure

What a Java program looks like. Consider program:

```
public class Main {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
    }
}
```

Output:

`10`

### Breakdown.

1. `public class Main {`
 
Java organizes code into classes. Think of a class as a container for related code. When a class is declared public, its name generally needs to match the   filename. This declares a class named Main. Therefore, this code belongs in Main.java.

2. `public static void main(String[] args)`

This is the standard entry point used to launch a typical Java application.
- public :	Allows the Java runtime to access the method
- static	: Lets the runtime invoke it without creating a Main object
- void	: The method does not return a value
- main	: The method name recognized as the entry point
- String[] args :	An array of strings containing command-line arguments

3. **Statements and semicolons** 

```
int x = 10;
System.out.println(x); 
```
Most Java statements end with a semicolon.

```
int x = 10;  // Correct
int x = 10   // Missing semicolon
```
The second example produces a compilation error.

4. **Comments**

Comments help explain your code and are ignored by the compiler.
- `// Single-line comment`

- ```
  /*
     Multi-line
     comment
  */
  ```


5. **Printing output**
```
String name = "Alice";
int age = 25;
double gpa = 7.8462;
System.out.println("Hello");
System.out.print("World");
System.out.println("!");
System.out.printf("Name: %s, Age: %d\n GPA: %.2f\n", name, age, gpa); 
```
Output:
```
Hello
World!
Name: Alice, Age: 25
GPA: 7.84
```
The difference:
- System.out.println() prints and moves to a new line.
- System.out.print() prints without automatically moving to a new line.
- System.out.printf() prints formatted output.

Note: %d represents an integer, %s represents a string, &.2f represents two digits after decimal, and \n represents a platform-appropriate newline.

