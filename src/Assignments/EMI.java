package Assignments;

import java.util.Scanner;

public class EMI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loan amount: ");
        double amount = sc.nextInt();

        System.out.println("Enter Rate of Interest: ");
        double interest = sc.nextInt();
        interest = interest/(12*100);
        System.out.println("Enter tenure: ");
        double tenure = sc.nextInt();
        tenure = tenure * 12;
        double emi = (amount * interest * Math.pow(1+interest,tenure))/(Math.pow(1+interest,tenure) -1);
        System.out.println("EMI: " + emi);

    }
}
