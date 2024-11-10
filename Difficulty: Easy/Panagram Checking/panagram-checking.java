//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        if(s.length()<26){
            return false;
        }
        s=s.toLowerCase();
        boolean arr[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
               arr[ch-'a']=true;    
            }
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }
    
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  
System.out.println("~");
}
	  
	 }
}
// } Driver Code Ends