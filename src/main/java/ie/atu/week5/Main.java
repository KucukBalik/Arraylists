package ie.atu.week5;
import java.util.ArrayList;

import java.sql.Array;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    ArrayList<Integer> numlist = new ArrayList<Integer>();

        System.out.println("Please enter a value to add it on ArrayList: ");

        numlist.add(100);
        numlist.add(200);
        numlist.add(300);
        numlist.add(400);
        numlist.add(500);

        Scanner sc = new Scanner(System.in);

        numlist.add(sc.nextInt());

        int i = 0;

        for (Integer name1 : numlist)
        {
            System.out.println("The number at index " + name1);
            i++;
        }




    }
}