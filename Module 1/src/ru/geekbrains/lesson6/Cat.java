package ru.geekbrains.lesson6;

public class Cat extends Animal {

    public Cat(String name){
        this.name = name;
        setMax(200, 0);
    }

    @Override
    public void swim(int way){
        System.out.println(this.name + " не может плавать.");
    }

}
