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
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        int max=0;
        int smax=0;
        String maxStr="";
        String smaxStr="";
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(String key:map.keySet()){
            if(map.get(key)>max){
                smax=max;
                smaxStr=maxStr;
                max=map.get(key);
                maxStr=key;
            }
            else if(map.get(key)>smax && map.get(key)<max){
                smax=map.get(key);
                smaxStr=key;
            }
        }
        return smaxStr;
        
    }
}