package ru.geekbrains.lesson6;

public abstract class Animal {
    protected int max_Run;
    protected int max_Swim;
    protected String name;


    public void run(int way){
        if(way<= this.max_Run) System.out.println(this.name + " пробежал " + way + " метров.");
        else System.out.println(this.name + " не может так далеко бежать.");
    };
    public abstract void swim(int way);

    protected void setMax(int max_Run, int max_Swim){
        this.max_Run = max_Run;
        this.max_Swim = max_Swim;
    }

}
