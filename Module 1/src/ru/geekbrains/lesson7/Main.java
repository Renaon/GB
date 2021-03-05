package ru.geekbrains.lesson7;

public class Main {

    public static void main(String[] args){
        Cat[] scp = new Cat[10];
        Plate plate = new Plate(100);
        plate.info();
        for(int i = 0; i< scp.length; i++){
            int index = (int) (Math.random() * (10000-200 + 1) + 100);
            String name = "SCP " + index;
            int apetite = (int) (Math.random() * (50-10+1) + 10);
            scp[i] = new Cat(name, apetite);
            scp[i].eat(plate);
        }

        for(Cat key: scp) {
            key.printinfo();
        }
    }
}
