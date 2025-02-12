import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) { 
        List<ToDo> toDoList= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean exit = true;
        int option;

        while(exit){
            System.out.println("\nTASK ORGANIZER");
            System.out.println("1. Add a task");
            System.out.println("2. See my tasks list");
            System.out.println("3. Mark a task done");
            System.out.println("4. Mark a task as undone");
            System.out.println("0. Exit");
            System.out.print("Select your option: ");
            option = scan.nextInt();
            scan.nextLine();

            switch(option){
                case 1: 
                    System.out.println("\n==ADD A TASK==");
                    System.out.print("Write your new task: ");
                    String newTask = scan.nextLine();
                    ToDo task = new ToDo(newTask);
                    System.out.println(task.toString());
                    toDoList.add(task);
                    break;

                case 2:
                    System.out.println("\n==SEE MY TASKS LIST==");
                    for(int i = 0; i < toDoList.size() ; i++){
                        System.out.println((i+1) + ". " + toDoList.get(i));
                    }
                    break;

                case 3: 
                    System.out.println("\n==MARK A TASK DONE==");
                    System.out.println("MY TASKS LIST");
                    for(int i = 0; i < toDoList.size() ; i++){
                        System.out.println((i+1) + ". " + toDoList.get(i).getTask());
                    }
                    System.out.print("\nSelect your done task: ");
                    int done = scan.nextInt();
                    scan.nextLine();
                    toDoList.get(done-1).markDoneStatus();
                    System.out.println((done) + ". " + toDoList.get((done-1)));
                    break;

                case 4: 
                    System.out.println("\n==MARK A TASK UNDONE==");
                    System.out.println("MY TASKS LIST");
                    for(int i = 0; i < toDoList.size() ; i++){
                        System.out.println((i+1) + ". " + toDoList.get(i).getTask());
                    }
                    System.out.print("\nSelect your undone task: ");
                    int undone = scan.nextInt();
                    scan.nextLine();
                    toDoList.get(undone-1).markUndoneStatus();
                    System.out.println((undone) + ". " + toDoList.get((undone-1)));
                    break;

                case 0: 
                    System.out.println("\nGOODBYE!");
                    break;
                
                default: System.out.println("\nInvalid input, enter a valid option");
                
            }
        }
        scan.close();
    }
    
}

