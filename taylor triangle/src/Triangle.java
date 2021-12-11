//5/10/21
//Sami Chiang 
//CIS 22C 

import java.lang.*;

import java.util.*;

public class Triangle{ 
	
   static int a; //static variable
   
   public static void createTriangle(char c,int n){
	   
       if(n<=0) 
           return;
       for(int i=0;i<a-n+1;i++){ 
    	   
           System.out.print(c);   
       }
       System.out.println();
       
       createTriangle(c,n-1); 
      
   }
   public static void main(String args[]){
	   
       Scanner sc=new Scanner(System.in);

       System.out.println("enter no of times"); 
       
   int n=sc.nextInt();

       a=n; 
       System.out.print("enter character in between single quotations('')");
       
       char c=sc.next().charAt(1); 
       
       createTriangle(c,n); 
   }
}