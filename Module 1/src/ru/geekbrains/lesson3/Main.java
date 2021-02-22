package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private char guessed[] = new char[15];
    private static Main obj = new Main();

    public static void main(String[] args){

        obj.guess_init();
        String com = compWish();
        char tmp[] = new char[15];
        System.out.println("Попробуй угадать слово компьютера из длииинного списка: \n");
        for(String word: words){
            System.out.print(word + " ");
        }
        System.out.println("");
        String pl = obj.yourTurn();
        while(true) {
            if (!pl.equals(com)) {
                tmp = obj.hint(com, pl);
                for (char key : tmp) System.out.print(key + " ");
                System.out.println("");
                pl = new Main().yourTurn();
            } else{
                System.out.println("Поздравляю, кусок мяса, ты победил");
                break;
            }
        }

    }

    private void guess_init(){
        for(int i = 0; i<obj.guessed.length; i++){
            this.guessed[i] = '#';
        }
    }

    private static String compWish(){
        int index = (int) (Math.random() * 16);
        return words[index];
    }

    private String yourTurn(){
        Scanner scan = new Scanner(System.in);
        String wish = scan.nextLine();
        if(!search(wish)){
            System.out.println("Слова нет в массиве, попробуй еще");
            yourTurn();
        }
        return wish;
    }

    private boolean search(String word){
        for(String key: words){
            if(key.equals(word)) return true;
        }
        return false;
    }

    private char[] hint(String com, String hope){
        System.out.println("Я покажу тебе буквы, которые есть в слове и даже стоят на своих местах");

        int arr_size = compare(com, hope);
        for(int j = 0; j<arr_size; j++){
            char a = com.charAt(j);
            if(a == hope.charAt(j)) this.guessed[j] = hope.charAt(j);
            else obj.guessed[j] = '#';
        }
        System.out.println("");
        return obj.guessed;
    }

    private int compare(String com, String hope){
        if(com.length() > hope.length()) return hope.length();
        else return com.length();
    }
}
