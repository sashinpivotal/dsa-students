## Java questions 

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