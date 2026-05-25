# Lab04_agenda

## Page 1

Lab04: GUI programming with Swing
In this lab, you will move from console programming to GUI programming:
● Learn basic Swing components
● Handle user interactions (button clicks, text input)
● Organize GUI layouts
● Convert the AIMS project into a graphical application

## Page 2

Java APIs for GUI programming
1. Abstract Window Toolkit
- Part of java.awt package
- Integrate into core Java since JDK 1.0
2. Swing
- Java Swing is the advanced and optimized version of AWT
- Part of javax.swing package
- Integrate into core Java since JDK 1.2
3. JavaFX
- The JavaFX library is written in Java and is available for the languages that can be executed on a JVM.
- JavaFX applications can run on multiple platforms: desktop, mobile and embedded systems built on Java. 

## Page 3

Java conceptual diagram


## Page 4

Part 1: AWT
Part 2: Swing

## Page 5

Example 1: UI elements
import java.awt.*;
public class AWTExample {
   public static void main (String[] args) {
       Frame frame = new Frame("OOP class - Lab04");
       frame.setSize(500, 300);
       Label label = new Label("AWT Example");
       frame.add(label);
       frame.setVisible(true);
   }
}


## Page 6

AWT hierarchy of elements
Docs:
https://docs.oracle.com/javase/7/docs/api/in
dex.html?java/awt/package-summary.html 
https://docs.oracle.com/javase/8/docs/api/ja
va/awt/package-frame.html 


## Page 7

Example 2: Layout
import java.awt.*;
public class AWT_Example2 {
   public static void main(String[] args) {
       Frame frame = new Frame("OOP class - Lab04");
       Label label = new Label("AWT Example");
       Button button = new Button("Submit");
       frame.setLayout(new FlowLayout());
       frame.add(label);
       frame.add(button);
       frame.setSize(500, 300);
       frame.setVisible(true);
   }
}


## Page 8

AWT layouts


## Page 9

Example 3: Events
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT_Example3 {
   public static void main(String[] args) {
       Frame frame = new Frame("OOP class - Lab04");
       Label label = new Label("AWT Example");
       Button button = new Button("Submit");
       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               label.setText("Button Clicked!");
           }
       });
       frame.setLayout(new FlowLayout());
       frame.add(label);
       frame.add(button);
       frame.setSize(500, 300);
       frame.setVisible(true);
   }
}


## Page 10

AWT Event handling
Package java.awt.event: contains AWT 
event-handling classes
3 objects involved in the event-handling: 
source, listener, event
– source object interacts with the user to 
create an event object
– event object will be messaged to all the 
registered listener objects
– appropriate event-handler method of the 
listener(s) is called-back to provide the 
response
– subscribe - publish pattern: The listener(s) "subscribes" to an event of a source, and the source "publishes" the 
event to all its subscribers upon activation

## Page 11

Event Listeners As Observers
Using event listeners to handle an event is a 
three-step process: 
1. Defining the Listener: Define a class that 
implements the appropriate listener 
interface (this includes providing 
implementations for all the methods of the 
interface).
2. Create an instance of this listener. 
3. Register this listener to the component 
whose events you’re interested in. 
class AnActionListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
       System.out.println("I was selected.");
   }
}
ActionListener actionListener = new AnActionListener();
button.addActionListener(actionListener);

## Page 12

Part 1: AWT
Part 2: Swing

## Page 13

Introduction to Java Swing
As Java technologies became more popular, users realized AWT was extremely slow and unreliable, and 
you couldn’t really do much with the provided components…
With these new technologies came more and more widget sets, for the AWT component set itself was 
very basic. So, applet download times grew and grew, because these new widget sets weren’t part of the 
core Java platform, and Java archive (JAR) files were introduced to improve delivery time. Eventually, 
each of the major browser vendors added its favorite component library to its virtual machine—AFC, IFC, 
and WFC, to name just a few. Yet all the libraries used different design models, and there were no true 
cross-browser standards. 
Eventually, Sun Microsystems teamed up with Netscape Communication and other partners to create yet 
another library called the Java Foundation Classes, or JFC. Part of JFC is something called the Swing 
component set.
- The Definitive Guide to Java Swing, John Zukowski

## Page 14

Swing hierarchy of elements
AWT and Swing elements
containers components

## Page 15

Swing top-level and secondary-level containers: 
JFrame Top-level container 
used for the application's main window (with an icon, a title, 
minimize/maximize/close buttons, an optional menu bar, and a 
content pane) 
JDialog Top-level container used for a secondary pop-up window (with a title, a close button, 
and a content pane). 
JApplet Top-level container (old) used for the applet's display area (content pane) inside a 
browser’s window 
JPanel Secondary-level 
container 
used to group and layout relevant components
cannot run independently, placed inside JFrame/JDialog

## Page 16

AWT vs Swing example
import java.awt.*;
import java.awt.event.*;
public class AWTExample extends Frame {
   public AWTExample() {
       Label label = new Label("This is AWT");
       Button button = new Button("Click Me");
       setLayout(new FlowLayout());
       add(label);
       add(button);
       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               label.setText("AWT Button Clicked!");
           }
       });
       setTitle("AWT Example");
       setSize(300, 150);
       setVisible(true);
       addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {
               dispose();
           }
       });
   }
   public static void main(String[] args) {
       new AWTExample();
   }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingExample extends JFrame {
   private JLabel label;
   public SwingExample() {
       label = new JLabel("This is Swing");
       JButton button = new JButton("Click Me");
       setLayout(new FlowLayout());
       add(label);
       add(button);
       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               label.setText("Swing Button Clicked!");
           }
       });
       setTitle("Swing Example");
       setSize(300, 150);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
   }
   public static void main(String[] args) {
       new SwingExample();
   }
}


## Page 17

The Model-View-Controller architecture
The model part of the MVC holds the state of a component and serves as 
the Subject.
The view part of the MVC serves as the Observer of the Subject to 
display the model’s state.
The view creates the controller, which defines how the user interface 
reacts to user input
This architecture enabling modular development of each part 
independently, enhancing maintainability and scalability. 
Model-View-Controller (MVC) design pattern is widely used in Java 
applications for web development and user interface separation.
Example: https://github.com/ashiishme/java-swing-mvc 


## Page 18

Videos tutorials
AWT: 
https://youtube.com/playlist?list=PLCRogJ_v4BQUuRtS3t_s3TpGFHk8Rsraz&feature=sh
ared 
Swing:
https://youtube.com/playlist?list=PLjJmj2FyqToaShAsuiW57BFvAkgMpaaNk&feature=s
hared 

## Page 19

Assignments and deadline
GUIProject Section 1 + 2
AWTAccumulator, SwingAccumulator Problem 1.1 + Problem 1.2
NumberGrid Problem 2.2
StoreManagerScreen Problem 3.1
MediaStore Problem 3.1.4
Add item screens Problem 3.2
Event handling implementation Problem 3.2
Updated UML diagrams (.astah + .png) Problem 3.2
answers.txt Problem 1.3
Proper Git branches and release flow Deadline: 23:59 - 25/5/2026

