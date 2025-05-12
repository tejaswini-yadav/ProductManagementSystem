package com.yash.pms.test;

import java.util.Arrays;

public class ShiftLeft {
	public static void reorder(int[] A)
    {
        int writeIndex = A.length - 1;
        int readIndex = A.length - 1;

        while(readIndex >= 0) {
          if(A[readIndex] != 0) {
            A[writeIndex] = A[readIndex];
            writeIndex--;
          }

          readIndex--;
        }

        while(writeIndex >= 0) {
          A[writeIndex] = 0;
          writeIndex--;
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
 
        reorder(A);
        System.out.println(Arrays.toString(A));
    }
}
