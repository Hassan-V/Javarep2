package Lab6_BSE_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Scanner;
class Node3 {
    int data;
    Node3 next;
    public Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static Node3 reverseLinkedList(Node3 head) {
        Node3 prev = null;
        Node3 current = head;
        Node3 nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public static void printList(Node3 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node3 head = null;

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            Node3 newNode = new Node3(element);
            newNode.next = head;
            head = newNode;
        }
        System.out.println("Original Linked List:");
        printList(head);

        head = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printList(head);

        scanner.close();
    }
}

