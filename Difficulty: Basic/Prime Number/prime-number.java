//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int isPrime(int N) {
        // Handle small cases
        if (N <= 1) {
            return 0; // 0 and 1 are not prime
        }
        if (N == 2 || N == 3) {
            return 1; // 2 and 3 are prime
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return 0; // Any even number or multiple of 3 > 3 is not prime
        }
        
        // Check divisibility for numbers from 5 up to √N
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return 0; // N is divisible by i or i + 2
            }
        }
        return 1; // N is prime
    }
}
