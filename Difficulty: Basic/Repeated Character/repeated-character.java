//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        // your code here
        HashMap<Character,Integer> map=new HashMap<>();
            int idx=S.length();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            // char ans='';
            if(map.containsKey(ch)){
              idx=Math.min(map.get(ch),idx);
            }else{
                map.put(ch,i);
            }
        }
        if(idx<S.length()){
            return S.charAt(idx);
        }
        return '#';
    }
}