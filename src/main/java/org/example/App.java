/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary variables
        Scanner input = new Scanner(System.in);
        double euros,dollars,rate;

        //Query
        System.out.println("How many euros are you exchanging?");
        euros = input.nextDouble();

        System.out.println("What is the exchange rate?");
        rate = input.nextDouble();

        //Calculation
        dollars = euros * rate;

        //Final output
        System.out.println(euros + " euros at an exchange rate of " + rate + " is");
        System.out.format("%.2f U.S. dollars.", dollars);
    }
}
