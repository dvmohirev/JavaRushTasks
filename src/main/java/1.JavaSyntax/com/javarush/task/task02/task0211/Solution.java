package com.javarush.task.task02.task0211;

/* 
Самое нужное число
*/

public class Solution
{
  public static void main (String[] args)
  {
    int m = 5;
    int n = 6;

    System.out.println("M=" +m+ " N=" + n);
    swap(m, n);
    System.out.println("M=" +m+ " N=" + n);
  }

  private static void swap(int a, int b)
  {
    int c = a;
    a = b;
    b = c;
  }
}
