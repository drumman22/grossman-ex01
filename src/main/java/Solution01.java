/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create input scanner
ask for name
use scanner to get input
print name
 */


import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        // Setuper scanner and get input
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.nextLine();

        // Output name
        System.out.printf("Hello, %s, nice to meet you!%n", name);
    }
}
