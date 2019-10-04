/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.calculator;

/**
 *
 * @author mlarrubia
 */

import java.util.Scanner;

public class BMICalculator {
   
   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the Body Mass Index calculator \n"
                        +"Please print out your information and press enter \n"
                        +"Thank you \n");
        System.out.print("Your height in inches ");
        double heightIn = input.nextDouble();
        System.out.println("");
        System.out.print("Your height in feet ");
        double heightFt = input.nextDouble();
        System.out.println("");
        System.out.print("Your weight in pounds ");
        double weightLbs = input.nextDouble();
        System.out.println("");
        double bmi = (703*weightLbs/(heightIn*heightIn));
        System.out.print("Your BMI is " +bmi);
       
        /*Formula in pounds and inches=
        *703 x weight (lbs) / [height (in)]270
        
        */        
    }
   
   
}

