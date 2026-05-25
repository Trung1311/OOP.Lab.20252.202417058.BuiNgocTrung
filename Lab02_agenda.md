# Lab02_agenda

## Page 1

Lab02: Problem Modeling and Encapsulation
In this lab, you will practice with: 
● Working with release flow
● Installing a design tool for UML diagrams: Astah
● Problem Modeling with Use-case diagram
● Encapsulation and different techniques for encapsulation
● Class design for use cases related to cart management
● Java Implementation: Creating classes, constructors, getters and setters, creating instances of classes
● Method overloading 
● Parameter passing
● Classifier member vs. Instance member

## Page 2

Outline
1. OOP Lab branching policy
2. How to make a pull request (or merge request)
3. Install Astah UML
4. Generate getters and setters
5. Understanding Instance and Class Members

## Page 3

Release flow
Day after day, your repository becomes more and more sophisticated, which makes your 
codes harder to manage. 
Luckily, a Git workflow can help you tackle this. A Git workflow is a recipe for how to use 
Git to control source code in a consistent and productive manner. Release Flow is a 
lightweight but effective Git workflow that helps teams cooperate with a large size and 
regardless of technical expertise
https://learn.microsoft.com/en-us/azure/devops/repos/git/git-branching-guidance?view=az
ure-devops 

## Page 4

OOP Lab branching policy
Branch Naming 
convention
Origin Merge to Purpose
feature 
or topic
+ feature/feature-name
+ feature/feature-area/feature-name
+ topic/description
main main Add a new feature or a 
topic
bugfix bugfix/description main main Fix a bug
feature feature
hotfix hotfix/description release release 
& 
main[1]
Fix a bug in a 
submitted assignment 
after deadline
refactor refactor/description main main Refactor
feature feature
release release/labXX main none Submit assignment [2]

## Page 5

release/Lab01
feature/ description
topic/ description
bugfix/ description
main
release/Lab02
Lab01 commits
hotfix/ description

## Page 6

OOP Lab branching policy
Applying Release Flow is required from this lab forward.
Latest versions of projects in release branch serve as the submitted assignment.

## Page 7

How to make a pull request
- Step 1. Update local repository . 
Issue the following command and resolve conflicts if  any .
(main) $ git pull
- Step 2. Create and switch to a new branch in the local repository .
(main) $ git checkout -b feature/demonstrate-release-flow
- Step 3. Make modifications in the local repository .
- Step 4. Add all changes in the current directory and its subdirectories to the staging area
(feature/demonstrate-release-flow) $ git add .
- Step 5. Commit the change in the local repository .
(feature/demonstrate-release-flow) $ git commit -m “Change files in assignment folder”
- Step 6. Push the local branch to the remote branch
(feature/demonstrate-release-flow) $ git push origin feature/demonstrate-release-flow
- Step 7. Create a pull request in GitHub GUI (for team collaboration)
You can skip this step if working alone
-  Step 8. Merge the new remote branch to the main branch.
Guide 1
Guide 2

## Page 8

Install Astah UML
Astah is a design tool which supports UML.
1. To get Astah UML, go to http://astah.net/student-license-request, fill the form, and 
send the request.
2. Install Astah UML and set licence: https://astah.net/support/set-student-license/ 
3. Atash User Guide: https://astah.net/support/astah-pro/user-guide/ 


## Page 9

Generate getters and setters | IntelliJ | VSC


## Page 10

Understanding Instance and Class Members | Read
Instance member (non-static) Class member (static)
Instance variables: each object has its own copy
Instance methods:
● operate on the current object’s data
● can access both instance and class variables
Must create an object to use them
Class variables (static):
● only one shared copy for the entire class
Class methods (static):
● can only access static variables
● cannot directly access instance variables
AnIntegerNamedX a = new AnIntegerNamedX();
AnIntegerNamedX b = new AnIntegerNamedX();
a.setX(1);
b.setX(2);
→ each object stores its own value
static int x;
→ shared across all objects
Note:
● By default, members are instance members (no static)
● Static methods cannot use instance variables → causes compile error

## Page 11

Assignments and deadline | repo structure
Apply the release flow to your work. Example:
1. Create a branch topic/use-case-diagram for the Use Case diagram you completed in Section 5.
2. Create a branch topic/class-diagram for the UML Class diagram you completed in Section 6.
3. Create a branch feature/initial-aims for the implementation of Sections 7, 8, 9, and 10.
4. Create a branch feature/manage-cart for the implementation of Sections 11, 12, and 13.
5. Create a branch topic/reading-assignment for your response to the reading assignment.
6. Create a branch topic/method-overloading for the implementation of Section 14.
7. Create a branch topic/passing-parameters for the implementation of Section 15.
8. Create a branch topic/classifier-and-instance-member for the implementation of Section 16.
9. Follow the branching policy and merge your branches into main.
10. Create a release branch release/lab02.
The latest versions of your projects in the release branch will serve as the submitted assignment.
Deadline: 23:59 - 10/04/2026

