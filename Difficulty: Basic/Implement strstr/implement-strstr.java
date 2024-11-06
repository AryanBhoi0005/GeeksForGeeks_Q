//{ Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       if(x.length()>s.length()){
           return -1;
       }
       if(x.length()==0){
           return 0;
       }
       for(int i=0;i<=s.length()-x.length();i++){
           int j=0;
           while(j<x.length() && s.charAt(i+j)==x.charAt(j)){
               j++;
           }
           if(j==x.length()){
              return i; 
           }
       }
       return -1;
    }
}
