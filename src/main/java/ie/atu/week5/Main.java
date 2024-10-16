package ie.atu.week5;


import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            int[] anArray;

            anArray = new int[10];

            anArray[0] = 100;
            anArray[1] = 200;
            anArray[2] = 300;
            anArray[3] = 400;
            anArray[4] = 500;
            anArray[5] = 600;
            anArray[6] = 700;
            anArray[7] = 800;
            anArray[8] = 900;

        System.out.println("Please enter a number for index 10:  \n");

        Scanner sc = new Scanner(System.in);

        anArray[9] = sc.nextInt();

            for(int i = 0; i < anArray.length; i++)
            {
                System.out.println("Element at index " + i + " " + anArray[i]);
            }


    }
}