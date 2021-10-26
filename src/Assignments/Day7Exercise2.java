package Assignments;

import java.util.Scanner;

public class Day7Exercise2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me your name, roll number, and field of interest");
        String name = sc.nextLine();
        int rollNum = sc.nextInt();
        sc.nextLine();
        String fieldOfInterest = sc.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " +
                rollNum + ". My field of interest is " + fieldOfInterest + ".");

        sc.close();

    }
}
