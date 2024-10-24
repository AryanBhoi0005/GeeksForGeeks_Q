//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int newArr[]=new int[2];
        int high=Integer.MAX_VALUE;
        int low=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x){
               high=Math.min(arr[i],high);
            }
            if(arr[i]<=x){
                low=Math.max(arr[i],low);
            }
        }
        if(high==Integer.MAX_VALUE){
            newArr[0]=low;
            newArr[1]=-1;
            return newArr;
        }
        else if(low==Integer.MIN_VALUE){
            newArr[0]=-1;
            newArr[1]=high;
            return newArr;
        }
        newArr[0]=low;
        newArr[1]=high;
        return newArr;
    }
}
