/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
package org.example;
import java.util.Scanner;

public class areaRect {

    public static void main(String[] args){
Scanner number = new Scanner(System.in);
         final double CON = 0.09290304;
        double length=0;
        double width=0;


        System.out.print("What is the length of the room in feet?: ");
length = number.nextDouble();
        System.out.print("What is the width of the room in feet?: ");
        width = number.nextDouble();

        double feet2= length * width;
        double meters2 = feet2 * CON;

        System.out.print("The area is:\n"+feet2+" square feet\n"+meters2+" square meters");
    }


}
