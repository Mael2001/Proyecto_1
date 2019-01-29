/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoLabProgra;
import java.util.Scanner;

/**
 *
 * @author lopez
 */
public class ProyectoLabProgra {
    
    public static void main(String[] args) {
        
        String NamePlayer1 = "", NamePlayer2 = "";
        
        
       Scanner read = new Scanner(System.in);
       
       
        System.out.print("Ingrese nombre Player 1: ");
        NamePlayer1 = read.next();
        
        System.out.print("\nIngrese simbolo de marca: ");
        char SimboloPlayer1 = read.next().charAt(0);
        
        System.out.print("\nIngrese nombre Player 2: ");
        NamePlayer2 = read.next();
        
        System.out.print("\nIngrese simbolo de marca: ");
        char SimboloPlayer2 = read.next().charAt(0);
        
        
        System.out.print("\n\nPlayer 1: " + NamePlayer1);
        System.out.print("\nSimolo Player 1: " + SimboloPlayer1);
        System.out.print("\n\nPlayer 2: " + NamePlayer2);
        System.out.print("\nSimbolo Player 2: " + SimboloPlayer2 + "\n");
        
        
        
    }
    
}
