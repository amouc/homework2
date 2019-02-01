package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (total != -1) {
            System.out.print("Please enter number of tickets:");
            total = scanner.nextInt();
            if(total == -1)
                break;
            System.out.print("How many round-trip tickets:");
            int round = scanner.nextInt();
            Ticket ticket = new Ticket(total, round);
            ticket.print();
        }
    }
}

