//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1, String str2) {
        // Your code here
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(!map.containsKey(ch1)){
               if(map.containsValue(ch2)){
                   return false;
               }else{
                  map.put(ch1,ch2);
               }
            }
            else{
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }
        }
        return true;
    }
}