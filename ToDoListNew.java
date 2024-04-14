import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListNew {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();

        System.out.println("                                                                                            ");


        System.out.println("                    TO DO LIST                          ");
        System.out.println("--------------------------------------------------------");

        System.out.println("                                                         ");
       

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                
                case 1:
                    System.out.print("Enter the task to add: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added: " + task);
                    break;

                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("To-Do List is empty.");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                        System.out.print("Enter the item number to remove: ");
                        int itemNumber = scanner.nextInt();
                        if (itemNumber >= 1 && itemNumber <= toDoList.size()) {
                            String removedTask = toDoList.remove(itemNumber - 1);
                            System.out.println("Task removed: " + removedTask);
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    }
                    break;

                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("To-Do List is empty.");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ".                " + toDoList.get(i))       ;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the To-Do List program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
