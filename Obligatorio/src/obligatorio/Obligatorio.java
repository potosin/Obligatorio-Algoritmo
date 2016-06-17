/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Bruno Silva y Diego Ferrand
 */
public class Obligatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        boolean QuieroSalir = false;
        while(!QuieroSalir){
            QuieroSalir = mainMenu(sc);
        }
    }
    
    private static boolean mainMenu(Scanner sc){
        
        String input = sc.nextLine();
        switch(input){
            case "1": print("Testing page 1");
            break;
            case "9": return true; 
            default: print("No matching case.");
        }
        return false;
    }
    private static void print(String text){
        System.out.println(text);
    }
}
