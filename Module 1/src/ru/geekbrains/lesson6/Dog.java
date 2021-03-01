package ru.geekbrains.lesson6;

public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
        setMax(500, 10);
    }


    @Override
    public void swim(int way) {
        if(way <= this.max_Swim) System.out.println(this.name +  " проплыл " + way + " метров.");
        else System.out.println(this.name + " не может так далеко плыть.");
    }
}
