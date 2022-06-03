package mypackage;

public class Main {
   
    public static void main(String[] args) {

        // Set variables with lambda expressions
        Calculator multiply = (x, y) -> x * y;
        Calculator divide = (x, y) -> x / y;
        
        // Call methods of lambda expressions
        int product = multiply.calculate(50, 10);
        int quotient = divide.calculate(50, 10);

        System.out.println("product = " + product + " quotient = " + quotient);
       
        // Pass lambda expressions to a method as arguments
        someMethod (multiply, divide);
       
        // Pass lambda expressions to a method as arguments
        someMethod((x, y) -> x * y, (x, y) -> x / y);
        
        // <For your own exercise> 
        // - Create another functional interface called "MyGreetingInterface" 
        //   with "void sayHello(String name);" method
        // - Set a variable of MyGreetingInterface type called "myVar" here
        //   with lambda expression "(name) -> System.out.println("Hello " +name)"
        // - Call "sayHello" method of the "myVar", which results in "Hello Sang".
        
        MyGreetingInterface myVar = (name) -> System.out.println("Hello " +name);
        myVar.sayHello("Sang");
       
    }
   
    public static void someMethod(Calculator m, Calculator d){
        int product = m.calculate(60, 10);
        int quotient = d.calculate(60, 10);
        System.out.println("product = " + product + " quotient = " + quotient);
    }
    
}