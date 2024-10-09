//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            String s1 = str.split(" ")[0];
            String s2 = str.split(" ")[1];

            Solution obj = new Solution();

            if (obj.isAnagram(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String str1, String str2) {

        // Your code here
        
        // Your code here
        HashMap<Character,Integer> map=new HashMap<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(!map.containsKey(ch)){
               return false;  
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)<0){
                return false;
            }
        }
        for(char num:map.keySet()){
            if(map.get(num)!=0){
                return false;
            }
        }
        return true;
    }
}