import java.util.*;
import java.lang.*;
import java.io.*;
class main
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int test=sc.nextInt();
	 while(test-- > 0)
	 {
	     String s1=sc.next();
	     String s2=sc.next();
	     char x[]=s1.toCharArray();
	     char y[]=s2.toCharArray();
	     int n=x.length;
	     int m=y.length;
	     int t[][]=new int[n+1][m+1];
	     for(int i=0;i<n+1;i++)
	     {
	         for(int j=0;j<m+1;j++)
	         {
	             if(i==0 || j==0)
	             t[i][j]=0;
	             else if(x[i-1]==y[j-1])
	             t[i][j]=1+t[i-1][j-1];
	             else
	             t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
	             
	         }
	     }
	     System.out.println(m+n-(t[n][m]));
	 }
	 }
}