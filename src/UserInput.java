/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class UserInput {
    
        static Scanner scanner = new Scanner(System.in);


    public static int getInt (){
        System.out.print("Integer input: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getInt(int min, int max){
        boolean userValue = true; 
        int x;
        do {
            System.out.print("Enter an integer between " + min + " and " + max + ". ");
            x = getInt();
            if (x >= min && x <= max){
                userValue = true;
            }
            else {
                System.out.println ("Error. Input must be between " + min + " and " + " " + max + ". "); 
                userValue = false; 
            }
        } while (!userValue); 
        return x;
                 
    }

    public static char getChar(){
        System.out.print("Integer input: ");
        return scanner.nextLine().charAt(0);

    }
    
    public static char getChar(char min, char max) {
        min = Character.toUpperCase(min);
        max = Character.toUpperCase(max);
        boolean userValue = true;
        char ch;
        do{
            System.out.println("Please input a character between " + min + " and " + max + ". ");
            ch = getChar();
            char temp = ch;
            temp = Character.toUpperCase(temp);
            if (temp >= min && temp <= max){
                userValue = true; 
            }
            else {
                System.out.println ("Error. Input must be between " + min + " and " + max + ". ");
                userValue = false;
            }
        } while (!userValue);
        return ch;

    }
    
    public static double getDouble(){
        System.out.print ("Double input: ");
        return Double.parseDouble(scanner.nextLine());
    }
    
    public static double getDouble(double min, double max) {
        boolean userValue = true; 
        double d;
        do {
            System.out.print("Enter an double value between " + min + " and " + max + ". ");
            d = getDouble();
            if (d >= min && d <= max){
                userValue = true;
            }
            else {
                System.out.println ("Error. Input must be between " + min + " and " + " " + max + ". "); 
                userValue = false; 
            }
        } while (!userValue); 
        return d;
    }
    
    public static String getString(){
        return scanner.nextLine();

    }

    public static String getString(int min, int max){
        boolean userValue = true; 
        String s;
        do {
            System.out.print("Enter an String between " + min + " and " + max + " characters. ");
            s = getString();
            if (s.length() >= min && s.length() <= max){
                userValue = true;
            }
            else {
                System.out.println ("Error. Input must be between " + min + " and " + " " + max + " characters. "); 
                userValue = false; 
            }
        } while (!userValue); 
        return s;
         
    }
    
  public static void main(String args[]) {
    
      System.out.println(getInt(0, 30));
      
      System.out.println(getChar('a', 'z'));
      
      System.out.println(getDouble(0.0, 30.0));
      
      System.out.println(getString(0, 40));
  }
}