//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        boolean arr[]=new boolean[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=false;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr[ch-'a']==false){
                arr[ch-'a']=true;
                str.append(ch);
            }else{
                continue;
            }
        }
        String newStr=str.toString();
        return newStr;
    }
}