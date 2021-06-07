/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int num = in.nextInt();
        String output = month.convert(num);
        System.out.printf("The month is %s.", output);
    }
}
