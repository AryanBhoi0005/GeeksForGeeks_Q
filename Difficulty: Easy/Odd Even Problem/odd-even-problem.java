//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int c1=0;
        int c2=0;
        for(Character key:map.keySet()){
            
            int pos=(key-'a')+1;
            int freq=map.get(key);
            if(pos%2!=0 && freq%2!=0){
               c1++;
            }
            else if(pos%2==0 && freq%2==0){
                c2++;
            }
        }
        int tot=c1+c2;
        if(tot%2==0){
            return "EVEN";
        }
        return "ODD";
    }
}
