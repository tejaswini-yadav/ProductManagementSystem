package com.yash.pms.test;

public class RemoveDuplicateArray {
	public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 7, 2, 2, 1,3,7 };
        int n = a.length;
 
        n = removeduplicates(a, n);
 
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
