//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    public boolean isValid(String s) {
        String[] arr = s.split("\\.");
        // Ensure there are exactly 4 parts
        if (arr.length != 4) {
            return false;
        }

        for (String part : arr) {
            try {
                // Each part must be a valid integer between 0 and 255
                int val = Integer.parseInt(part);
                if (val < 0 || val > 255) {
                    return false;
                }
                // Avoid "01", "001", etc. by checking if the string representation is unchanged
                if (!part.equals(String.valueOf(val))) {
                    return false;
                }
            } catch (NumberFormatException e) {
                // If part is not a valid integer, return false
                return false;
            }
        }

        return true; // All parts are valid
    }
}
