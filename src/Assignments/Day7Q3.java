package Assignments;

import java.util.Scanner;

class Average
{
    double a,b,c,average;

    public void askForInput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me 3 number and I'll average them...");
        System.out.println("First number: ");
        a = sc.nextInt();
        System.out.println("Second number: ");
        b = sc.nextInt();
        System.out.println("Third number: ");
        c = sc.nextInt();

        sc.close();
    }
    public void printAverage()
    {
        average = (a+b+c)/3;
        System.out.println("Average is " + average);
    }
}
public class Day7Q3
{
    public static void main(String[] args)
    {
        Average avg = new Average();
        avg.askForInput();
        avg.printAverage();
    }
}
