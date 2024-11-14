//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        // code here
        
        int l=0;
        int r=0;
        int count=0;
        StringBuilder sb=new StringBuilder();
        while(r<s.length()){
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(ch1==ch2){
                count++;
                r++;
            }
            else{
                sb.append(ch1);
                sb.append(count);
                l=r;      
                count=0;
            }
        }
        sb.append(s.charAt(l));
        sb.append(count);
        return sb.toString();
    }
}
    