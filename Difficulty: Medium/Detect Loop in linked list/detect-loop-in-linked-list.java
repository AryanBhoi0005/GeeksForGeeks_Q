//{ Driver Code Starts
// Initial template code for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GFG {
    public static void makeLoop(Node head, Node tail, int x) {
        if (x == 0) return;

        Node curr = head;
        for (int i = 1; i < x; i++) curr = curr.next;

        tail.next = curr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            if (!input.isEmpty()) {
                String[] numbers = input.split("\\s+");
                for (String num : numbers) {
                    if (!num.isEmpty()) {
                        arr.add(Integer.parseInt(num));
                    }
                }
            }

            int pos = Integer.parseInt(br.readLine().trim());

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); ++i) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
                makeLoop(head, tail, pos);
            }

            Solution x = new Solution();
            if (x.detectLoop(head))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}

// } Driver Code Ends


// User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

class Solution {
    // Function to check if the linked list has a loop.
       public static boolean detectLoop(Node head) {
        // Edge case: if the list is empty
        if (head == null) {
            return false;
        }
        
        Node slow = head; // Tortoise
        Node fast = head; // Hare
        
        while (fast != null && fast.next != null) { // Ensure fast and fast.next are not null
            slow = slow.next;          // Move slow pointer by 1
            fast = fast.next.next;    // Move fast pointer by 2
            
            if (slow == fast) {        // If they meet, there is a loop
                return true;
            }
        }
        return false; // If fast pointer reaches the end, no loop
    }
}