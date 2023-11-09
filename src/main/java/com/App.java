package com;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int x = userInput.nextInt();
        System.out.println("Hello World! " + x);
        userInput.close();
    }
}
