//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java



class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> map = new HashMap<>();
        
        // Fill the map with counts of elements from a1
        for (int i = 0; i < a1.length; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], 0) + 1);
        }

        // Check if all elements of a2 are in the map
        for (int i = 0; i < a2.length; i++) {
            if (map.containsKey(a2[i])) {
                int count = map.get(a2[i]);
                if (count == 1) {
                    map.remove(a2[i]); // Remove the element when count reaches 0
                } else {
                    map.put(a2[i], count - 1); // Decrement the count
                }
            } else {
                return "No"; // If any element of a2 is not found, return "No"
            }
        }
        return "Yes"; // All elements of a2 were found in a1
    }
}
