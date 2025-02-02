import java.util.ArrayList; //Import the ArrayList for storing tasks
import java.util.Scanner; //Import the Scanner for user input

public class ToDoList {
    //Make a static ArrayList to hold tasks
    private static ArrayList<String> tasks = new ArrayList<>();
    //Make a Scanner object for reading the user's input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Infinite loop to keep the program running until the user wants to exit
        while (true) {
            displayMenu(); //Show the menu options to the user
            int choice = scanner.nextInt(); //Read the user's choice
            scanner.nextLine();  //Take the newline left by nextInt()
            
            //Switch statement to for the user's choice
            switch (choice) {
                case 1: //If the user wants to add a task
                    addTask();
                    break;
                case 2: //If the user wants to delete a task
                    deleteTask();
                    break;
                case 3: //If the user wants to view tasks
                    viewTasks();
                    break;
                case 4: //If the user wants to exit the program
                    System.out.println("Exiting TaskList. Feel free to use me next time you need to organize your activities!");
                    return; //Exit the main method and terminate the program
                default: //If the user puts in an invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    //Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nTo-Do List Menu:");
        System.out.println("1. Add a Task");
        System.out.println("2. Delete a Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    //Method to add a new task to the list
    public static void addTask() {
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine(); //Read the task from user input
        tasks.add(task); //Add the task to the ArrayList
        System.out.println("Task added!"); //Confirming that the task was added
    }

    //Method to delete a task from the list
    public static void deleteTask() {
        //Check if there are tasks to delete
        if (tasks.isEmpty()) {
            System.out.println("No tasks to delete.");
            return; //Exit if there are no tasks
        }
        viewTasks(); //Show the tasks that are on the list to the user
        System.out.print("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt(); //Read the task number to delete
        scanner.nextLine();

        //Validate the task number and delete the task if valid
        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number."); //Tell the user if the number is invalid
        } else {
            tasks.remove(taskNumber - 1); //Take out the task from the ArrayList
            System.out.println("Task deleted!"); //Confirm that the task was deleted
        }
    }

    //Method to see all tasks in the list
    public static void viewTasks() {
        //Check if there are any tasks to display
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return; //Exit if there are no tasks
        }
        System.out.println("\nYour To-Do List:"); //Title for the task list
        //Loop through the tasks and display each one with its own number
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i)); //Show task number and task
        }
    }
}
