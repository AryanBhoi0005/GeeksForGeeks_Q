//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        boolean arr[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr[ch-'a']){
               return String.valueOf(ch);
            }
            else{
                arr[ch-'a']=true;
            }
        }
        return "-1";
    }
} 