//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int l=0;
        int h=arr.length-1;
        int m=0;
        
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                m++;
                l++;
            }
            else if(arr[m]==2){
                int temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            }
            else{
                m++;
            }
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends