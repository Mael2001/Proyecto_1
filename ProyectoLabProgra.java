
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author lopez
 */
public class ProyectoLabProgra {
static Scanner in;
static String[] board;
    
        public static void main(String[] args) {
            board = new String[9];
            
        
        
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
        populateEmptyBoard();
        printBoard();
    }
        static void printBoard() {
		System.out.println("--------------");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("--------------");
}
        static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
}
}
