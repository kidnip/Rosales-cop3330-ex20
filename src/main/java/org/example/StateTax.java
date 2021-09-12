package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class StateTax
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        float order, tax = 0, total;
        String state, county;

        System.out.print("What is the order amount? ");
        order = input.nextFloat();
        System.out.print("What state do you live in? ");
        state = input.next();
        state = state.toLowerCase();

        if(state.equals("wisconsin")){
            tax = 0.05f;

            System.out.print("What county do you live in? ");
            county = input.next();
            county = county.toLowerCase();

            if(county.equals("eau claire")) {
                tax += 0.005;
            }
            else if(county.equals("dunn")){
                tax += 0.004;
            }

            tax = tax * order;
            System.out.printf("The tax is $%.2f\n", tax);
        }
        else if(state.equals("illinois")){
            tax = 0.08f;
            tax = tax * order;
            System.out.printf("The tax is $%.2f\n", tax);
        }

        total = order + tax;
        System.out.printf("The total is $%.2f", total);

    }
}
