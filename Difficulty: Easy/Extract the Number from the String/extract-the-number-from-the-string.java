//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long temp=0;
        boolean indi=false;
        long ans=0;
        for(int i=0;i<=sentence.length();i++){
            char ch = (i < sentence.length()) ? sentence.charAt(i) : ' ';
            if(ch>='0' && ch<='9'){
               if(ch=='9'){
                  indi=true;
               }    
               temp=temp*10+(ch-'0');       
            }
            else if(ch==' '){
                if(!indi){
               ans=Math.max(ans,temp);
               }
                temp=0;
                indi=false;
            }
        }
        return ans==0?-1:ans;
    }
}