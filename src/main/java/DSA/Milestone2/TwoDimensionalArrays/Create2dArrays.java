package DSA.Milestone2.TwoDimensionalArrays;

import java.util.Scanner;

public class Create2dArrays {
    public static void main(String[] args) {
        System.out.println("----- Creating 2D Array-----");
        //create scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        //create array to store data
        int[][] array = new int[rows][columns];
        System.out.println("Enter the elements of array: ");

        for(int i = 0; i< rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.println("Enter the " + i + j + " element: ");
                array[i][j] = sc.nextInt();
            }
        }
        //print the array
        System.out.println("The entered array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
