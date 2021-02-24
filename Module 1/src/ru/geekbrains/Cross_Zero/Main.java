package ru.geekbrains.Cross_Zero;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static char[][] map;
    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOT_EMPTY = '+';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    public static void main(String[] args){
        initMap();
        printMap();

        while (true){
            humanTurn();
            printMap();
            if(win(DOT_X)){
                System.out.println("Победил кусок мяса");
                break;
            }
            if (usMapFull()){
                System.out.println("Ничья");
                break;
            }
            comTurn();
            System.out.println("Game over");
            printMap();
            if (win(DOT_O)){
                System.out.println("Победил высший разум");
            }
            if (usMapFull()){
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Game over");
    }

    private static void initMap(){
        map = new char[SIZE][SIZE];
        for(int i = 0; i< SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap(){
        for(int i = 0; i< SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                 System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void humanTurn(){
        Scanner scan = new Scanner(System.in);
        int x; int y;

        System.out.println("Введите координату хода.");
        x = scan.nextInt() - 1;
        y = scan.nextInt() - 1;
        if(!isValid(x,y)){
            System.out.println("Поле занято или находится вне зоны определения. Попробуй еще");
            humanTurn();
        }
        map[x][y] = DOT_X;

    }

    private static boolean isValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    private static void comTurn(){
        int x = (int) (Math.random() * SIZE + 1);
        int y = (int) (Math.random() * SIZE + 1);
        if(!isValid(x,y)) comTurn();
        map[x][y] = DOT_O;
    }

    private static boolean win(char symb) {
        int dia_cout = 1;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb && map[i][4] == symb) {
                return true;
            } else if (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb && map[3][i] == symb && map[4][i] == symb) {
                return true;
            } else if (map[i][i] == symb) dia_cout++;

            if (dia_cout == 5) return true;
        }
        return false;
    }

    private static boolean usMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
