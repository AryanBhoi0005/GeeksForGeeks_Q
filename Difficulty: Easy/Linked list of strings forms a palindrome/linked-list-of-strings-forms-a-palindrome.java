//{ Driver Code Starts
import java.util.*;

class Node {
    String data;
    Node next;

    Node(String x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() { head = null; }

    void addNode(String str) {
        if (head == null) {
            head = new Node(str);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(str);
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int K = sc.nextInt();
            LinkedList list = new LinkedList();

            for (int i = 0; i < K; i++) {
                String str = sc.next();
                list.addNode(str);
            }

            Solution ob = new Solution();
            boolean ans = ob.compute(list.head);
            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public boolean compute(Node root) {
        if(root==null){
            return false;
        }
        StringBuilder sb=new StringBuilder();
        Node temp=root;
        while(temp!=null){
            sb.append(temp.data);  
            temp=temp.next;
        }
        int start=0;
        int end=sb.length()-1;
        while(start<end){
           char ch1=sb.charAt(start);
           char ch2=sb.charAt(end);
           if(ch1!=ch2){
               return false;
           }
           start++;
           end--;
        }
        return true;
    }
}