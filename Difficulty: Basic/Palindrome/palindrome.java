//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        String num=String.valueOf(n);
        int start=0;
        int end=num.length()-1;
        while(start<end){
            char ch1=num.charAt(start);
            char ch2=num.charAt(end);
            if(ch1!=ch2){
                return "No"; 
            }
            start++;
            end--;
        }
        return "Yes";
        
    }
}