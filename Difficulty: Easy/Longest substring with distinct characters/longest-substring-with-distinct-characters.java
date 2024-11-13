//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestSubstrDistinctChars(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int len=0;
        int max=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>=l){
                l=map.get(ch)+1;
            }
               map.put(ch,r);
               len=r-l+1;   
            max=Math.max(len,max);
            r++;
        }
        return max;
    }
}