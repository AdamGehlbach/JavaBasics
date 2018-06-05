package com.company.example;

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean hasADog = true;
        char letter = 'c';
        //String hello = "hello world";
        int number = 1232;
        double decimaNumber = 3.14;


        boolean hasAcar = false;
        char firstletterOfMyGameName = 'S';
        String mycar = "I have a ";
        int numberOfCountrysOnEarth = 195;
        double peoplelovegamesaroundtheworld = 088.9;
        boolean IloveVideogames = true;
        String TypesOfGames = "FPS TPS RPG";
        // System.out.println((double) numberOfCountrysOnEarth / peoplelovegamesaroundtheworld + (5 * 3));

        int addition = numberOfCountrysOnEarth + 12 + number + 2456 - 356 + 789;

         // System.out.println(addition);

        int add = 5 + 4;
        int subtract = 5 - 4;
        int multiply = 5 * 4;
        int divide = 4 / 5;

     //   System.out.println("hello life is great" + (5 - 2));

      //  System.out.println(divide);

        // System.out.println(" This is the modulo " + (4 % 5));

        // This is an example of concatenation

        // Scanner input = new Scanner(System.in);

         String hello = "Hello";
         String name = "adam";

        // System.out.println(hello + " " + name);



        //System.out.println("how is your life");

        //name = input.nextLine();

        //System.out.println(hello + " " + name);

        System.out.println("WHat is your age?");
        int age = input.nextInt();
        input.nextLine();


        System.out.println("What would you like for me to call you?");

        name = input.nextLine();

        System.out.println(hello + " " + name + "! " + "You are " + age);
    }
}
