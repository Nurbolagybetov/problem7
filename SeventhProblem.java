package assignment1;

import java.util.Scanner;
public class SeventhProblem {
    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0 , arr.length - 1);
        printArray(arr);
        System.out.println("Time taken " + duration + " milliseconds");
    }
    /*
     *This method changes the numbers place inside of the array.
     *Time complexity: 0(n),where n is the number of elements in the input array.
     *Complexity class:  linear
     *@param arr The array that we used.
     *@param start and end The positions that we change.
     */
    public static void reverse(int[] arr , int start, int end){
        if(start >= end){
            return;
        }
        int a = arr[start];
        arr[start]= arr[end];
        arr[end] = a;
        reverse(arr,start+1,end-1);
    }
    /*
     *This method prints the new replaced array.
     *Time complexity: 0(n), where n is the number of elements in the input array.
     *Complexity class:  linear
     *@param arr The new array.
     */
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
