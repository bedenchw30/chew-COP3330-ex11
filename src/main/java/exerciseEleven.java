import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
public class exerciseEleven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euros = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();

        double currencyConverted = exchangeRate*euros;

        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is \n" + Math.round(currencyConverted*100)/100.0 + " U.S. dollars.");



    }
}
