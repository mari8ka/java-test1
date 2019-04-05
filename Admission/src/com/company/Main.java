package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people are in the room?");
        int room = sc.nextInt();
        System.out.println("How many people are in a queue?");
        int queue = sc.nextInt();

        int (room+queue) = sc.nextInt();
        if (room+queue <= 100){
            System.out.println("Fit");

        }

    }
}
