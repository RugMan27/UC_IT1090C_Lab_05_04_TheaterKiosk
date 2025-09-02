package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";

        // input
        System.out.println("Enter your age: ");

        //safe input
        if(in.hasNextInt()){
            int age =  in.nextInt();
            in.nextLine();
            // age verification
            if(age >= 21){
                System.out.println("You get a wristband!");
            }
        }else {
            trash = in.nextLine();
            System.out.println("You said your age was: " + trash);
            System.out.println("Run the program again and enter a valid age!");

        }
    }
}