//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    int reverse(int num){
        
       
         int val=0;
        int ans=num;
        int temp=0;
        while(num!=0){
            val=num%10;
            num=num/10;
            if(val==0){
               val=5;
            temp=temp*10+val;
            }else{
            temp=temp*10+val;
            }
        }
        return temp;
    }
    int convertfive(int num) {
        // Your code here
         if(num==0){
            return 5;
        }
        int val=reverse(num);
        int ans=reverse(val);
         return ans;
    }
}