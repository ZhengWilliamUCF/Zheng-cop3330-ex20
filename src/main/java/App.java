/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    double Amount;
    String State;
    String County;
    double Tax;
    double Total;

    public static void main(String[] args) {
        App myApp = new App();
        myApp.readUserInput();
    }

    public void readUserInput(){
        System.out.print("What is the order amount? ");
        Amount = Double.parseDouble(in.nextLine());
        System.out.print("What state do you live in? ");
        State = in.nextLine().toLowerCase();
        if (State.equals("wisconsin")){
            Tax = 0.05;
            CheckCounty();
        }
        else if (State.equals("illinois")){
            Tax = 0.08;
        }
        CalcTax();
    }

    public void CheckCounty(){
        System.out.print("What county do you live in? ");
        County = in.nextLine().toLowerCase();
        if (County.equals("eau claire")){
            Tax = Tax + 0.005;
        }
        else if (County.equals("dunn")){
            Tax = Tax + 0.004;
        }
    }

    public void CalcTax(){
        double taxAmount = Tax * Amount;
        Total = taxAmount + Amount;
        System.out.printf("The tax is $%.2f\nThe total is $%.2f.", taxAmount, Total);
    }
}

