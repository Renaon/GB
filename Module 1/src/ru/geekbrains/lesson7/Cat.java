package ru.geekbrains.lesson7;

public class Cat {
    private StringBuilder name = new StringBuilder();
    private int appetite;
    private boolean hungry = true;

    public Cat(String name, int appetite){
        this.name.append(name);
        this.appetite = appetite;
    }

    public void eat(Plate p){
        this.hungry = p.decreaseFood(appetite);
    }
    public void printinfo(){
        if(hungry) System.out.println(name + " Голоден");
        else System.out.println(name + " Сыт");
    }

    public void allInfo(){
        System.out.println(name + " " + appetite + " ");
        printinfo();
    }
    public boolean getHungry(){
        return this.hungry;
    }
}
