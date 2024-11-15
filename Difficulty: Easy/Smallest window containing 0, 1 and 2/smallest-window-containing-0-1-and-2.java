//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
       int x=0;
       int y=0;
       int z=0;
     int total = Integer.MAX_VALUE;
       int l=0;
       int r=0;
       while(r<S.length()){
           int ch=S.charAt(r)-'0';
           if(ch==0){
              x++; 
           }
           else if(ch==1){
               y++;
           }else{
               z++;
           }
           while(x>0 &&y>0 &&z>0){
                total = Math.min(total, r - l + 1);
               int newChar=S.charAt(l)-'0';
               if(newChar==0){
                  x--;
               }else  if(newChar==1){
                   y--;
               }else{
                   z--;
               }
               l++;
           }
           r++;
    }
       return total == Integer.MAX_VALUE ? -1 : total;
}
}
