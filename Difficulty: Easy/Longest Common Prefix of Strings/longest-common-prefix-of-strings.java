//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java




class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuilder str=new StringBuilder();
        Arrays.sort(arr);
        // String val="";.
        for(int i=0;i<arr[0].length() && i<arr[arr.length-1].length();i++){
            if(arr[0].charAt(i)!=arr[arr.length-1].charAt(i)){
                break;
            }
            str.append(arr[0].charAt(i));
        }
        String val=str.toString();
        return val.length()>0 ? val:"-1";
    }
}