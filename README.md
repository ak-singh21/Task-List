# Task List Application

## Overview
This is a simple  Task List application built using Java. It allows users to manage tasks by adding, deleting, and viewing them. The tasks are stored in an `ArrayList` and can be changed through a simple menu interface.

## Features
- **Add a Task**: Users can input new tasks to add to their to-do list.
- **Delete a Task**: Users can delete tasks by selecting the task number from the list.
- **View Tasks**: Users can view all the tasks currently in the to-do list.
- **Exit**: Exits the program.

## Requirements
- Java Development Kit (JDK) 8 or later.
- Command-line interface for running the Java program.

## How to Run the Program

1. Clone the repository or copy the Java code to your local machine.
2. Open a terminal or command prompt.
3. Navigate to the directory where the Java file is saved in.
4. Compile the Java file:
    ```bash
    javac ToDoList.java
    ```
5. Run the compiled Java program:
    ```bash
    java ToDoList
    ```
6. Follow the instructions in the console to add, delete, or view tasks.

## Code Description

- **ArrayList `tasks`**: This is where all the tasks are stored.
- **Scanner**: Used to capture user input from the console.
- **Menu Options**:
  - Option 1: Allows the user to add a new task.
  - Option 2: Allows the user to delete an existing task by selecting its number.
  - Option 3: Displays the list of tasks.
  - Option 4: Exits the program.
