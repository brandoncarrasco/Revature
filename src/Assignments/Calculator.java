package Assignments;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Select Option");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int option = sc.nextInt();

        switch (option)
        {
            case 1:
                System.out.println(a + " + " + b + " = " + (a+b));
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;

            case 3:
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case 4:
                try {
                    System.out.println(a + " / " + b + " = " + ((float)a/(float)b));
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Cannot divide by 0");
                }
                break;

            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
