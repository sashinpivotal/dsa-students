## Java resources (in addition to class provided ones)

- [Sang Shin's Java presentations](https://github.com/sashinpivotal/java-presentations)

## Java questions (Sang asked these questions to guage students' Java knowledge)

- When do you want to use Java interface?
- When is a static method?  Why do you want to create a method as a static method? Is it a good idea to create a static method which maintains a state?
- What is encaptulation? What is abstraction?
- What is Polymorphism? What are the examples of polymorphism?
- What are the major differences between Set vs List?
- What is difference between "protected" vs "pacakge private or default" access modifier?
- What is "Single responsibility principle"? Why should we use it?
- What is depdency injection and why it is such an important software design concept?
- What is a functional interface in Java?
- What is Lambda expression? Where do you want use it?
- What is Generics and why you want to use it in your code?
- What is the difference between Java Collection vs Java Streams? (We are NOT talking about Java I/O Stream.)
- What is Optional class for in Java?
- What is a design pattern? What "Strategy" pattern?
- What is dependenccy management?
- What is "Open for extension Closed for modification" design principle?
- SOLID Design principles

## .gitignore example file

```
# Operating System Files

*.DS_Store
Thumbs.db
*.sw?
.#*
*#
*~
*.sublime-*

# Build Artifacts

.gradle/
build/
target/
bin/
out/
dependency-reduced-pom.xml

# Eclipse Project Files

.classpath
.project
.metadata
.loadpath
bin/
.settings/

# IntelliJ IDEA Files

*.iml
*.ipr
*.iws
*.idea

.vscode/
README.html
```

## IntelliJ Shortcut keys

### IntelliJ Shortcut keys for Mac:

- Run app and test
  - CTRL+SHIFT+R (run the app/test)
  - CTRL+R(rerun the app/test)
- Editing
  - CMD+B (go to the source code of a class or method)
  - ALT+Return (Quick fix for compiler error)
  - CMD+SHIFT+Return (Complete current statement)
  - CMD+N (Generate)
  - SHIFT+F6 (Rename)
  - CMD+ALT+V (extract return value into a local variable)
  - F2, SHIFT+F2 (Go to next/previous error)
  - CMD+Left (navigate back)
  - CMD+Right (navigate forward)
- Window management
  - CMD+SHIFT+F12 (maximize/minimize editor window)
  - CMD+SHIFT+' (Maximize/minimize tool window)
- Testing
  - CMD+SHIFT+T (go to target/test code)
- File search
  - CMD+O (find class)
  - CMD+SHIF+O (find file)
- String search
  - CMD+F (search within a file)
  - CMD+SHIFT+F (search within the project)

### IntelliJ Shortcut keys for Windows:

- Run app and test
  - CTRL+SHIFT+F10 (run the app/test)
  - SHIFT+F5 (rerun the app/test)
  - SHIFT+F10 (rebuild/rerun)
- Editing
  - CTRL+B (go to the source code of a class or method)
  - ALT+Enter (quick fix for compiler error)
  - CTRL+SHIFT+Enter (complete current statement)
  - Alt+Ins (generate)
  - Shift+F6 (rename all instances of a variable)
  - CTRL+ALT+V (extract return value into a local variable)
  - F2, SHIFT+F2 (go to next/previous error)
  - Alt+Left (navigate back between classes)
  - Alt+Right (navigate forward between classes)
- Window management
  - CTRL+SHIFT+F12 (maximize/minimize editor window)
  - CTRL+SHIFT+F12 (maximize/minimize tool window)
  - Alt+F12 (open/close terminal window)
- Testing
  - CTRL+SHIFT+T (go to target/test code)
- File search
  - CTRL+N (find class)
  - CTRL+SHIFT+F (find file)

## Binary and Octal Conversion

- [Number system youtube intro](https://www.youtube.com/watch?v=FFDMzbrEXaE&ab_channel=TheOrganicChemistryTutor)

- Decimal number system

```
Possible numbers: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
324 = 3*100 + 2*10 + 4 * 1
```

- Binary number system

```
Possible numbers: 0, 1
101 = 1 * 4 + 0 * 2 + 1 * 1 
```

- Octal number system

```
Possible numbers: 0,1,2,3,4,5,6,7
10 = 1 * 8 + 0 * 1 = decimal 8
17 = 1 * 8 + 7 = decimal 15
217 = 2 * 64 + 1 * 8 + 7 = decimal 128+15=143
```

- Hexadecimal number system

```
Possible numbers: 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
A = decimal 10
1F = 1 * 16 + F = decimal value 31
```

- [int value range](https://www.i-programmer.info/ebooks/modern-java/5423-java-data-types-numeric-data.html#:~:text=128%20to%20127-,short%202%20bytes%20%2D32%2C768%20to%2032%2C767,4%20bytes%207%20decimal%20digits) 


## Lab 1.3 Test plans

- Positive tests
  - normal cases
    - it should return valid decimal value given valid number array
    - it should return valid decimal value given valid number array with duplicates
  - edge cases
    - null array
      - it should throw InvalidParameterException given null array
    - empty array
      - it should throw InvalidParameterException given empty array

- Negative tests
  - the input string has non numeric value
    - it should throw MyNumberFormatException given an array that contains non-numeric characters
  - the resulting number is not in the range of 4 byte int

- Two different ways of testing if your code generates an exception correctly

```
    @Test(expected = MyNumberFormatException.class)
    public void _convertFromOctal_should_throw_MyNumberFormatException_given_octal_string_with_non_number_chars() throws MyNumberFormatException {
        BinaryConvert.convertFromOctal("17a");
    }

    @Test
    public void _convertFromOctal_should_throw_MyNumberFormatException_given_octal_string_with_non_number_chars2() {
        String badOctalStr = "17a";
        try {
            BinaryConvert.convertFromOctal(badOctalStr);
            fail("Didn't throw exception");
        } catch (MyNumberFormatException ipe) {
            assertEquals(badOctalStr, ipe.getMessage());
        }
    }
```
- Example custom exception class

```
public class MyNumberFormatException extends RuntimeException {

    public MyNumberFormatException(String message) {
        super(message);
    }
}
```

- [Java Exception presentation](https://github.com/sashinpivotal/java-presentations/blob/main/javase_exceptions.pdf)

## Lab 1.4 corrected 


Steps for Completion
1. Assume that we have a way to sort the inputs in O(n log n). This is provided in the following method:
            public void mergeSort(int[] input) {
              Arrays.sort(input);
}
We can use this method to sort one input array, or both, and make the intersection easier.
2. To sort one input array, we can use a binary search on it. The runtime complexity is O(n log n) for the merge sort plus **O(log n)** for the binary search
per item in the first list. This is **O(n log n) + O(log n)** which results in a final O(n log n).
3. Sort both arrays, and have two pointers, one for each array.
4. Go through the input arrays in a linear fashion.
5. Advance a pointer if the other pointer is pointing to a larger value.
6. If the values at both pointers are equal, both pointers are incremented. The runtime complexity for this algorithm is 2 * (n log n) for the two merge sorts plus the n for the linear pass after the sorting. This results in 2 * (n log n) + n with a final O(n log n).


## Binary Search

- Assumed the numbers are already sorted
- Example

```
sorted array: [1, 2, 3, 4, 7, 8, 9, 11, 14, 17, 20]
target: 4

- 1st phase [1, 2, 3, 4, 7]
- 2nd phase [3, 4, 7]
- 3rd phase [4]
```

## Intersection Fast

- Assume both array's are sorted

```
sorted array1: [12, 22, 24, 66, 75, 87]
sorted array2: [24, 32, 39, 41, 66, 98]
```

## Steps of recursive programs

Every recursive program follows the same basic sequence of steps:

1. Initialize the algorithm. Recursive programs often need a seed value to start with. This is accomplished either by using a parameter passed to the function or by providing a gateway function that is nonrecursive but that sets up the seed values for the recursive calculation.
2. Check to see whether the current value(s) being processed match the base case. If so, process and return the value.
3. Redefine the answer in terms of a smaller or simpler sub-problem or sub-problems.
4. Run the algorithm on the sub-problem.
5. Combine the results in the formulation of the answer.
6. Return the results.