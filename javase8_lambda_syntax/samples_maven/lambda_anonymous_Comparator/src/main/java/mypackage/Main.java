package mypackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
   
    List<Person> personList = Person.createShortList();
  
    // Sort with Anonymous Inner Class
    Collections.sort(personList, new Comparator<Person>(){
      public int compare(Person p1, Person p2){
        return p1.getSurName().compareTo(p2.getSurName());
      }
    });
    
    System.out.println("=== Sorted Asc SurName ===");
    for(Person p:personList){
      p.printName();
    }
    
    // Use Lambda instead
    
    // Print in ascending order
    System.out.println("=== Sorted Asc SurName ===");
    Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

    for(Person p:personList){
      p.printName();
    }
    
    // Print in descending order
    System.out.println("=== Sorted Desc SurName ===");
    Collections.sort(personList, (p1,  p2) -> p2.getSurName().compareTo(p1.getSurName()));

    for(Person p:personList){
      p.printName();
    }
    
    // <For your own exercise>
    // - Create an list of Integers
    // - Sort them using anonymous inner class of Comparator 
    // - Sort them using Lambda comparator

  }
  
}
