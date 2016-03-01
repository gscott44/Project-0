/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class UserInput {
    
        static Scanner input = new Scanner(System.in);


    public static int getInt (){
        System.out.print("Integer input: ");
        return scanner.nextInt();
    }

    public static int getInt(int min, int max){
        boolean userValue = true; 
        int x;
        do {
            System.out.println("Please input an integer between " + min " and " + max);
            x = getInt();
            if (x >= min && x <= max){
                userValue = true;
            }
            else {
                System.out.println ("Error. Input must be between " + min " and " + " " + max); 
                userValue = false; 
            }
        } while (!userValue); 
        return x;
                 
    }

    public static char getChar(){
        System.out.print("Integer input: ");
        return scanner.next().charAt(0);
    }
    
    public static char getChar(char min, char max) {
        min = Character.toUpperCase(min);
        max = Character.toUpperCase(max);
        boolean userValue = true;
        char x;
        do
    }
    
    public static double getDouble(){
        
    }
    
    public static double getDouble(double min, double max) {
        
        return min; 
    }
    
    public static String getString(){
        
    }

    public static String getString(String min, String max){
        
         
    }


}