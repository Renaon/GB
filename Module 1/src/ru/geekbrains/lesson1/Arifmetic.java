package ru.geekbrains.lesson1;

public class Arifmetic {
    public static void main(String[] args){
        byte b = 127;
        short sh = 32767;
        int in = 1000;
        long l = 1000854L;
        float f = 13.13f;
        double d = 66.6;
        char ch = (char) in;
        String name = "Андрюша";

        float answer = calc(b,in,f,sh); //все переменные преобразуются, так что, думаю, отлично выходит
        System.out.println(answer);
        System.out.println(isInterval(sh,b));
        nonNegative(in);
        hello(name);
        System.out.println(highYear(2020));
    }

    private static float calc(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    private static boolean isInterval(int a, int b){

        if(a+b>=10 && a+b<=20) return true;
        else return false;
    }

    private static void nonNegative(int a){
        if (a<0) System.out.println("Number is negative.");
        else System.out.println("Number is positive.");
    }

    private static void hello(String name){
        System.out.println("Привет, " + name);
    }

    private static boolean highYear(int year){
        if(year%4==0 && year%100!=0 && year%400!=0) return true;
        else if(year%400==0) return true;
        else return false;
    }
}
