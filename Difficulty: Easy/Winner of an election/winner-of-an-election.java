//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        
System.out.println("~");
}
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String s[]=new String[2];
        int max=0;
        Arrays.sort(arr);
        String str=arr[0];
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(String key:map.keySet()){
            int result=key.compareTo(str);
            if( (map.get(key)>max) || (map.get(key)==max && result<0)){
               max=map.get(key);
               str=key;
            }
        }
        s[0]=str;
        s[1]=String.valueOf(max);
        return s;
    }
}

