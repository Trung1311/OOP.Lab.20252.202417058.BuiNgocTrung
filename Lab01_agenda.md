# Lab01_agenda

## Page 1

Lab01: Environment Setup and Java Basics
In this lab, you will practice with:
● Set up development environment 
● Writing some Java’s code and compile it with Java JDK on the IDE
● Using Git and GitHub for version control and assignment submission

## Page 2

Part 1: Java Development Kit (JDK)
Part 2: Git & Github
Part 3: Create a Java Project

## Page 3

Java conceptual diagram


## Page 4

JDK installation
Check JDK Installation:
javac -version
If version appears → OK
If not → install JDK
Install JDK:
1. Download JDK    
(8 or newer)
2. Install
Environment configuration:
Windows:
1. Set JAVA_HOME
2. Add to PATH: 
%JAVA_HOME%\bin
Installation guide for Windows, Linux, and MacOS

## Page 5

Text editor
1. Open Notepad, create a file with the following content, and save it as HelloWorld.java
Make sure file name = class name
2. Open command prompt / terminal and navigate to file location: cd path/to/your/file
3. Compile the program using JDK: javac HelloWorld.java
4. Execute compiled program: java HelloWorld
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

## Page 6

IDE installation
Eclipse:
- Download from: https://www.eclipse.org/downloads/packages/ 
- Video: https://youtu.be/YyZ3SHlJifc?si=6SEOSyHrQul_gktN 
IntelliJ:
- Download from: https://www.jetbrains.com/idea/download/ 
- Video: https://youtu.be/MBbRyXIQ89Q?si=E2s9PYKIWxJa1g0z&t=189 
Visual Studio Code:
- Download from: https://code.visualstudio.com/Download
- Video: https://youtu.be/VUcI3Y1Nnak?si=YtTr3RdcIeu2ZZm9&t=186 


## Page 7

Part 1: Java Development Kit (JDK)
Part 2: Git & Github
Part 3: Create a Java Project

## Page 8

Git introduction
What is Git?
Git is a free and open source distributed version control system designed to handle everything from small to 
very large projects with speed and efficiency.
What is Github?
GitHub is the largest host of source code in the world, and has been owned by Microsoft since 2018.
GitHub = Git server + collaboration platform
Git tutorial:
- Slide: https://itp.uni-frankfurt.de/~hees/transport-meeting/ss19/talk-Staudenmeier.pdf 
- Video: https://youtu.be/HVsySz-h9r4?si=Q-bSrIM-XbEJdUjB 
- Cheat Sheet: https://git-scm.com/cheat-sheet 

## Page 9

Git installation
1. Download from: https://git-scm.com/install/windows
2. Install Git: https://youtu.be/t2-l3WvWvqg?si=PfxzTHa6bvaSBS-M
3. Go to GitHub and sign up for an account (if you don’t already have one).
4. Click New repository → Enter a repository naming “OOP.Lab.20252.StudentID.StudentName” → 
Choose Private → Click Create repository
5. Add anhttl@soict.hust.edu.vn as a member of your repository
6. Generate a Personal Access Token (PAT): Go to Settings → Developer settings → Personal access 
tokens → Click “Generate new token” → Select required scopes → Generate and copy the token 
(you won’t be able to see it again)
7. Configure git
git config --global user.name "Your Name"
git config --global user.email "your-email@example.com"

## Page 10

Git workflow
Save changes locally:
git add .
git commit -m "message"
Git connect to Github and upload code to remote:
git remote add origin <repo_url>
git push origin main
Create release branch:
git checkout -b release/lab01
Switch back to main branch:
git checkout main

## Page 11

Part 1: Java Development Kit (JDK)
Part 2: Git & Github
Part 3: Create a Java Project

## Page 12

Assignments and deadline
Submit via GitHub:
1. Folder: Lab01
2. Include:
a. Programs: 2.2.5, 2.2.6
b. Exercises: 6.1 → 6.6
c. Answers.txt
3. Create a release branch release/lab01.
The latest versions of your projects in the release branch will serve as the submitted assignment.
Deadline: 23:59 - 30/03/2026

