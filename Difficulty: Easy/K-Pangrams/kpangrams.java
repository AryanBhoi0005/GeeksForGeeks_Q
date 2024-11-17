//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if (obj.kPangram(str, k))
                System.out.println("true");
            else
                System.out.println("false");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        // code here
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' ')continue;
            count++;
            set.add(ch);
        }
        if(count<26){
            return false;
        }
        int miss=26-set.size();
        if(miss==0){
            return true;
        }
        if(miss>k){
            return false;
        }
        return true;
    }
}