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
public class LabPrograProyecto {
        static int A1, A2, A3, B1, B2, B3, C1, C2, C3;
    static String S1,S2;
    static Scanner in;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String prompt = "Ingresar Lugar: ";
        String humanMove = "";
        String computerMove = "";
        boolean gameIsWon = false;
        int contPlayer1 = 0, contPlayer2 = 0, contJuego = 0,contEmpate=0;
        String NamePlayer1 = "", NamePlayer2 = "";

        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese nombre Player 1: ");
        NamePlayer1 = read.next();

        System.out.print("\nIngrese simbolo de marca: ");
        S1 = read.next();

        System.out.print("\nIngrese nombre Player 2: ");
        NamePlayer2 = read.next();

        System.out.print("\nIngrese simbolo de marca: ");
        S2 = read.next();

        System.out.print("\n\nPlayer 1: " + NamePlayer1);
        System.out.print("\nSimolo Player 1: " + S1);
        System.out.print("\n\nPlayer 2: " + NamePlayer2);
        System.out.print("\nSimbolo Player 2: " + S2 + "\n");
        System.out.println("------------------");
        System.out.println("A1  |   A2  |   A3");
        System.out.println("------------------");
        System.out.println("B1  |   B2  |   B3");
        System.out.println("------------------");
        System.out.println("C1  |   C2  |   C3");
        System.out.println("------------------");
        contJuego++;
        do {
            for (int i = 1; i <= 13; i++) {

                humanMove = getMove(prompt);
                updateBoard(humanMove, 1);
                displayBoard();
                if (isGameWon()) {
                    System.out.println("Jugador " + NamePlayer1 + " Ha Ganado!");
                    gameIsWon = true;
                    contPlayer1++;
                    System.out.println("Desea Jugar De Nuevo? \nIngrese 0 Para Continuar o 1 Para Salir");
                    contJuego = read.nextInt();
                    A1 = 0;
                    A2 = 0;
                    A3 = 0;
                    B1 = 0;
                    B2 = 0;
                    B3 = 0;
                    C1 = 0;
                    C2 = 0;
                    C3 = 0;
                    break;
                }
                if (i < 13) {
                    computerMove = getMove(prompt);
                    updateBoard(computerMove, 2);
                    displayBoard();
                    if (isGameWon()) {
                        System.out.println("Jugador " + NamePlayer1 + " Ha Ganado!");
                        gameIsWon = true;
                        contPlayer2++;
                        System.out.println("Desea Jugar De Nuevo? \nIngrese 0 Para Continuar o 1 Para Salir");
                        contJuego = read.nextInt();
                        A1 = 0;
                        A2 = 0;
                        A3 = 0;
                        B1 = 0;
                        B2 = 0;
                        B3 = 0;
                        C1 = 0;
                        C2 = 0;
                        C3 = 0;
                        break;
                    }
                    i++;
                }
                if (!gameIsWon) {
                    if (i == 13) {
                        System.out.println("Es un Empate!");
                        System.out.println("Desea Jugar De Nuevo? \nIngrese 0 Para Continuar o 1 Para Salir");
                        contJuego = read.nextInt();
                        A1 = 0;
                        A2 = 0;
                        A3 = 0;
                        B1 = 0;
                        B2 = 0;
                        B3 = 0;
                        C1 = 0;
                        C2 = 0;
                        C3 = 0;
                        contEmpate++;
                        break;
                    }
                }
                i++;
            }
        } while (contJuego != 1);
        System.out.println("Jugador " + NamePlayer1 + " Ha Ganado " + contPlayer1);
        System.out.println("Jugador " + NamePlayer2 + " Ha Ganado " + contPlayer2);
        System.out.println("Ha Habido "+contEmpate+" Empates");
        System.out.println("Han Habido "+contJuego+" Juegos");
    }

    public static String getMove(String prompt) {
        String play;
        System.out.print(prompt);
        do {
            play = sc.nextLine();
            if (!isValidPlay(play)) {
                System.out.println("That is not a valid play.");
            }
        } while (!isValidPlay(play));
        return play;
    }

    public static boolean isValidPlay(String play) {
        if (play.equalsIgnoreCase("A1") & A1 == 0) {
            return true;
        }
        if (play.equalsIgnoreCase("A2") & A2 == 0) {
            return true;
        }
        if (play.equalsIgnoreCase("A3") & A3 == 0) {
            return true;
        }
        if (play.equalsIgnoreCase("B1") & B1 == 0) {
            return true;
        }
        if (play.equalsIgnoreCase("B2") & B2 == 0) {
            return true;
        }
        if (play.equalsIgnoreCase("B3") & B3 == 0) {
            return true;
        }
        if (play.equalsIgnoreCase("C1") & C1 == 0) {
            return true;
        }
        if (play.equalsIgnoreCase("C2") & C2 == 0) {
            return true;
        }
        if (play.equalsIgnoreCase("C3") & C3 == 0) {
            return true;
        }
        return false;
    }

    public static void updateBoard(String play, int player) {
        if (play.equalsIgnoreCase("A1")) {
            A1 = player;
        }
        if (play.equalsIgnoreCase("A2")) {
            A2 = player;
        }
        if (play.equalsIgnoreCase("A3")) {
            A3 = player;
        }
        if (play.equalsIgnoreCase("B1")) {
            B1 = player;
        }
        if (play.equalsIgnoreCase("B2")) {
            B2 = player;
        }
        if (play.equalsIgnoreCase("B3")) {
            B3 = player;
        }
        if (play.equalsIgnoreCase("C1")) {
            C1 = player;
        }
        if (play.equalsIgnoreCase("C2")) {
            C2 = player;
        }
        if (play.equalsIgnoreCase("C3")) {
            C3 = player;
        }
    }

    public static void displayBoard() {
        String line = "";
        System.out.println();
        line = " " + getXO(A1) + " | " + getXO(A2) + " | " + getXO(A3);
        System.out.println(line);
        System.out.println("-----------");
        line = " " + getXO(B1) + " | " + getXO(B2) + " | " + getXO(B3);
        System.out.println(line);
        System.out.println("-----------");
        line = " " + getXO(C1) + " | " + getXO(C2) + " | " + getXO(C3);
        System.out.println(line);
        System.out.println();
    }

    public static String getXO(int square) {
        if (square == 1) {
            return S1;
        }
        if (square == 2) {
            return S2;
        }
        return " ";
    }

    public static boolean isGameWon() {
        if (isRowWon(A1, A2, A3)) {
            return true;
        }
        if (isRowWon(B1, B2, B3)) {
            return true;
        }
        if (isRowWon(C1, C2, C3)) {
            return true;
        }
        if (isRowWon(A1, B1, C1)) {
            return true;
        }
        if (isRowWon(A2, B2, C2)) {
            return true;
        }
        if (isRowWon(A3, B3, C3)) {
            return true;
        }
        if (isRowWon(A1, B2, C3)) {
            return true;
        }
        if (isRowWon(A3, B2, C1)) {
            return true;
        }
        return false;
    }

    public static boolean isRowWon(int a, int b, int c) {
        return ((a == b) & (a == c) & (a != 0));
    }
}
