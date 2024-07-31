import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Task found;

        ll.addNode(new Task("Do HomeWork", "Pending"));
        ll.addNode(new Task("Do Assignments", "Pending"));
        ll.addNode(new Task("Cook Food", "Complete"));
        ll.addNode(new Task("Eat Well", "Pending"));

        System.out.println("\nAvailable Tasks\n");
        ll.traverseList();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Task Id to Search: ");
        found = ll.searchTask(sc.nextLine());
        System.out.println(found);


        System.out.print("\nEnter Task Id to Delete: ");
        ll.deleteTask(ll, sc.nextLine());
        ll.traverseList();

        sc.close();

    }
}
