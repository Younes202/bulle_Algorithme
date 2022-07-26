import java.util.Scanner;

import java.util.*;

class Main {

static int[] bulle(int t[])
  {
    int tmp=0;
   for(int i=t.length-1;i>=1;i--)
     {
       for(int j=0;j<i;j++)
         {
           if(t[j]>t[j+1])
           {
             tmp = t[j+1];
           t[j+1]=t[j];
           t[j]=tmp;
           }
           
         }
     }
    return t;
  }



  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int array_integer[] = { 5, 2, 1, 6, 0, 7 };
    System.out.println("Before Sorting ");
    for(int i=0;i<array_integer.length;i++)
      {
            System.out.println(array_integer[i]);
      }
  
   array_integer= bulle(array_integer);
        System.out.println("After Sorting ");
    for(int j=0;j<array_integer.length;j++)
      {
            System.out.println(array_integer[j]);
      }



  }

}
