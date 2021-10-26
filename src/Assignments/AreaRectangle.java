package Assignments;

import java.util.Scanner;

public class AreaRectangle
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Give me the length and width of rectangle and I will finds it's area!");

        System.out.println("Length: ");
        double length = sc.nextDouble();

        System.out.println("Width: ");
        double width = sc.nextDouble();

        System.out.println("Area of rectangle is: " + (int)(length*width));
    }
}
