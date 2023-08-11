package IsPrime;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                
            }
        }
        if(count==2){
            System.out.print("Prime");
        }else{
            System.out.print("Not Prime");
        }
                  
            
        
    
    
    }
}