package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Class that reverse the array elements 
 * so that the first element becomes the last element, the second element.
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class ReverseArray {
    
    /**
     * Main method to drive the program. 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Array before reversing: ");
        printArray(array);
        reverseArray(array);
        System.out.print("Array after reversing: ");
        printArray(array);
        input.close();
    }
    
    /**
     *  reverse the array elements 
     *  so that the first element becomes the last element, the second element.
     * @param array as random
     */
    public static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            swap(array, i, length - i - 1);
        }
    }
    
    /**
     * Create method to reverse the array. 
     * @param array as integer type
     * @param i as an index
     * @param j as an index
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /**
     * Create method to print the reversed Array. 
     * @param array to print
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
  
}
