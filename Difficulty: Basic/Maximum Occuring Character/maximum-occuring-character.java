//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 
System.out.println("~");
}
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
     public static char getMaxOccuringChar(String line) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Populate the map with character counts.
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }
        
        char ch = 'a'; // Initialize with a default character.
        
        // Find the character with the maximum frequency.
        for (char key : map.keySet()) {
            if (map.get(key) > count ||(map.get(key)==count && key<ch)) {
                count = map.get(key);  // Update count to the maximum frequency found.
                ch = key;               // Update ch to the current key with max frequency.
            }
        }
        
        return ch;
    }
    
}