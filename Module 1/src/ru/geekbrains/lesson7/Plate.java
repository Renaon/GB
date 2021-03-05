package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int n){
        if(n>food){
            System.out.println("Нельзя скушать больше, чем есть в миске");
            return true;
        }
        else{
            food -= n;
            return false;
        }
    }

    public void putFood(int quan){
        food += quan;
    }
}
