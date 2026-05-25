# Visualize-git-branch

## Page 1

Visualize git branch

## Page 2

Outline
1. What is git
2. Local repository
3. Git commit 
4. Git branch
5. Git merge, rebase 

## Page 3

What is git
Git is a technology that can be used to track changes to a project and to help multiple people 
to collaborate on a project. At a basic level, a project version controlled by Git consists of a 
folder with files in it, and Git tracks the changes that are made to the files in the project. This 
allows you to save different versions of the work you’re doing, which is why we call Git a 
version control system
- Look at different versions
- Compare and check what changed
- Combine the work

## Page 4

What is git
To check git in your computer:
Git version
git –-version
To install git
https://git-scm.com/downloads 

## Page 5

Local repository
A repository (also known as a repo) is how we refer to a project version controlled 
by Git. In reality, there are two types of repositories: 
• A local repository is a repository that is stored on a computer. 
• A remote repository is a repository that is hosted on a hosting service. 
A hosting service is a company that provides hosting for projects using Git.
To turn a project directory into a local repository you have to initialize, or create, 
the repository. When you initialize a repository, the .git directory is automatically 
created inside the project director

## Page 6

Git commit
A commit in Git is basically one version of a project. You can think of it as a 
snapshot of a project, or a standalone version of a project that contains references 
to all the files that are part of that commit. 
Every commit has a commit hash (sometimes called a commit ID). This is a 
unique 40-character hash composed of letters and numbers that acts like a name 
for the commit, providing a way to refer to it.
An example of a commit hash is 51dc6ecb327578cca503abba4a56e8c18f3835e1. 
In reality, you only need the first seven characters of a commit hash to refer to a 
commit. So, for the example hash just given, you can just use 51dc6ec to refer to 
the commit.

## Page 7

Git commit
Every time you make a commit, it is saved in the commit history
The commit history is where you can think of your commits existing. It is 
represented by the objects directory inside the .git directory


## Page 8

Modified file
When you add a new file (rainbowcolors.txt) to your project


## Page 9

Untracked file -> tracked file 
Since the rainbowcolors.txt file is not yet in your repository, it is an untracked file. 
An untracked file is a file in the working directory that Git is not version controlling. 
It has never been added to the staging area and it has never been included in a 
commit; therefore, it is not part of the repository. 
Once you add a file to the staging area and include it in a commit, the file 
becomes a tracked file.
git status: shows a list of modified files and tells you whether or not they have 
been added to the staging area

## Page 10

Git commit
Making a commit is a two-step process: 
1. Add all the files you want to include in the next commit to the staging area. 
This allows you to keep your commits more organized
2. Make a commit with a commit message.

## Page 11

Step 1: Git add
Git add command copies the file from the working directory into the staging area.


## Page 12

Step 2: Git commit
When a new file that was untracked is added to the staging area and included in a 
commit, it becomes a tracked file, because Git now knows about it. Therefore, the 
rainbowcolors.txt file is now a tracked file.


## Page 13

Git branch
What exactly are branches in git ?
Branches in Git are movable pointers to commit.
The default branch name in Git is main.
As you start making commits, you’re given a 
main branch that points to the last commit you 
made. Every time you commit, the main branch 
pointer moves forward automatically.


## Page 14

Next commit
When you make a new commit, the orange commit.
What to notice: 
• There is a second commit, the orange commit.
• The orange commit points back to the red commit. 
• The main branch points to the orange commit


## Page 15

Create a branch
At the moment, you only have one local branch, called main, in your rainbow 
repository. To list the branches in a local repository, you can use the git branch 
command. To create a new branch, you can pass the name of a branch that 
doesn’t exist yet to this command. Note that branch names cannot contain spaces.
Example:
git branch feature


## Page 16

Create a branch
There are now two arrows, representing the main and feature branches, 
pointing to the orange commit. A new branch will initially point to the commit that 
you were on when you made.


## Page 17

HEAD
HEAD is simply a pointer that tells you which branch you are on
The HEAD file contains ref: refs/heads/main, which is a reference to the main file 
that represents the main branch.
Now that you’ve created a new branch, you’re 
ready to start using it—but for the time being, 
you’re still on the main branch. Next, you will 
switch branches, moving the HEAD pointer to your 
new feature branch.

## Page 18

Switching branches
It changes the HEAD pointer to point to the 
branch you are switching onto.
git checkout feature
You can also create a branch and switch to 
it in one go
git checkout -b new_branch_name


## Page 19

Before After
HEAD HEAD
ref: refs/heads/nain ref: refs/heads/feature
FIGURE 4-2
The contents of the HEAD file before and after you switch from the main branch onto the
feature branch in the rainbow repository

## Page 20

Working on a separate branch
Make a new yellow commit in feature 
branch
- The feature branch points to the 
latest commit, the yellow commit
- The main branch still points to the 
orange commit
Summary: The concept of branches as 
movable pointers to commits


## Page 21

Merging
In Git, there are 2 ways to integrate changes from one branch into another:
1. Merge
There are 2 types of merges: 
+ Fast-forward merge
+ Three-way merge
2. Rebase

## Page 22

Merge
Merging in Git is one way you can integrate the changes made in one branch into 
another branch. In any merge, there is one branch that you are merging, called the 
source branch, and one branch that you’re merging into, called the target branch
Source branch: contain the changes
Target branche: receive the changes

## Page 23

Fast-forward merge
Fast-forward merge is a type of merge that occurs when the  development 
histories of the branches involved in the merge have not diverged—in other words, 
when it is possible to reach the target branch by following the parent links that 
make up the commit history of the source branch. During a fast-forward merge, Git 
takes the pointer of the target branch and moves it to the commit of the source 
branch

## Page 24

Fast-forward merge


## Page 25

Project drectony rinbow
Woring drectory Localrepostoy(gt)
Staging arez (ndex Commit istory (objects)
3
rainbowcolors.txt RKOKY
v3
rainbowcolors.txt main feoture
HEAD

## Page 26

Projetdirectony:rainbow
Working drectory Localrepostcry(gt)
Staging area(ndex) Commitfistory (objects)
v2
rainbowcolors.txt RHOKY
v2
rainbowcolors.txt main feoture
HEAD

## Page 27

Project directory rainbow
Working dretory Localrepostory (git)
Staging arez ( ndex) Commit istory (objects)
3
rainbowcolors.txt
v3
rainbowcolors.txt moin feature
HEAD

## Page 28

Three-way merge
Three-way merge is a type of merge that occurs when the development histories 
of the branches involved in the merge have diverged. Development histories have  
diverged when it is not possible to reach the target branch by following the commit 
history of the source branch. In this case when you merge the source branch into 
the target branch, Git performs a three-way merge, creating a merge commit to tie 
the two development histories together; it then moves the pointer of the target 
branch to the merge commit.

## Page 29

Three-way merge
If I merge the chapter_eight branch into the main branch, it can’t be a 
fast-forward merge  because there is no way to just move the branch pointer 
forward to combine these two development histories.

## Page 30

Three-way merge
Instead, a merge commit (represented 
by commit M) will be created to tie the 
two development histories together. A 
merge commit is a commit that has 
more than one parent. This is an 
example of a three-way merge.

## Page 31

Three-way merge
Three-way merges are a more complex type of merge where you may experience 
merge conflicts. These arise when you merge 2 branches where different changes 
have been made to the same parts of the same files.
In such cases, you can resolve the conflict by using a combination of rebase and 
forward merge instead.

## Page 32

Rebase
F G
H I
K L
J
chapter_eight
main
F G
H I
K L
J
chapter_eight
main
HEAD HEAD
git rebase main

