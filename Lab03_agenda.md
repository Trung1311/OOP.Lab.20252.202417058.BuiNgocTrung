# Lab03_agenda

## Page 1

Lab03: Object-oriented techniques
In this lab, you will practice with: 
● Re-organizing your project by creating packages to manage classes
● Debugging 
● Practicing memory management with String and StringBuffer and other cases
● Java Inheritance mechanism
● Abstract class and Interface
● Use the Collections framework ArrayList
● Polymorphism

## Page 2

Delete merged branches
1. Delete local branch
git branch -D branch-name
2. Delete remote branches
git push origin -d branch-name
Remote branches
Local branches

## Page 3

Reorganize your project
Structure of your repo after refactoring:
+ AimsProject
hust.soict.elitech.aims.disc.DigitalVideoDisc
hust.soict.elitech.aims.cart.Cart
hust.soict.elitech.aims.Aims
hust.soict.elitech.test.cart.CartTest
hust.soict.elitech.test.disc.TestPassingParameter
+ OtherProjects
hust.soict.elitech.lab01
hust.soict.elitech.lab02 
hust.soict.elitech.lab03 

## Page 4

Debugging
Debugging is the routine process of locating and removing bugs, errors or abnormalities from 
programs. Debug run allows you to run a program interactively while watching the source code and 
the variables during the execution.
It’s a must have skill for any Java developer because it helps to find subtle bugs that are not visible 
during code reviews or that only happen when a specific condition occurs.
 Breakpoint A marker where the program pauses execution so you can inspect variables and logic.
Step into Go inside a method/function to see how it works line by line.
Step over Execute the current line and move to the next line without entering methods.
Step return Finish the current method and return to the caller.
Resume Continue running the program until the next breakpoint.

## Page 5

Debug example
Output:
Before swap: a=10, b=20
Inside swap (before): o1=10, o2=20
Inside swap (after): o1=20, o2=10
After swap: a=10, b=20
Debug code with IDEs
Eclipse: Tutorial 
IntelliJ: Video, Tutorial 
VSC: Video1, Video2 

## Page 6

String, StringBuilder and StringBuffer | Read: 
https://redfin.engineering/java-string-concatenation-which-way-is-best-8f590a7d22a8
Example: 
Questions:
● Explain why using String with the + operator inside a loop can lead to performance issues.
● In what situations should you use StringBuilder instead of String?
String StringBuilder
String s = "Hello";
s = s + " World";
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");

## Page 7

ArrayList example | https://www.datacamp.com/doc/java/arraylist 
import java.util.ArrayList;
public class AnimalListExample {
   public static void main(String[] args) {
       // Create an ArrayList to store animal names
       ArrayList<String> animals = new ArrayList<>();
       // Add elements to the ArrayList
       animals.add("Lion");
       animals.add("Elephant");
       animals.add("Giraffe");
       // Remove an animal
       animals.remove("Elephant");
       // Check if an animal exists
       if (animals.contains("Lion")) {
           System.out.println("Lion is still in the list.");
       }
       // Get number of animals
       System.out.println("Total animals in list: " + animals.size());
   }
}

## Page 8

Assignments and deadline
Apply the release flow to your work. Example:
1. Create a branch refactor/lab03 for refactoring your project as described in section 3.
2. Create a branch topic/reading-assignment for your response to the reading assignment.
3. Create a branch feature/aims-project/add-cart for the implementation of section 4
4. Create a branch feature/aims-project/add-store for the implementation of section 5
5. Create a branch feature/other-projects/string-concat for the implementation of section 6
6. Create a branch feature/aims-project/add-requirements for the implementation of section 8 to 14
7. Create a branch topic/method-override for the implementation of Section 15
8. Create a branch topic/aims-project/update-class-diagram/lab03 to update UML class diagram.
9. On your own, create the necessary branches for implementing sections 16, 17, and 18.
10. Follow the branching policy and merge your branches into main.
11. Create a release branch release/lab03.
The latest versions of your projects in the release branch will serve as the submitted assignment.
Deadline: 23:59 - 10/5/2026

