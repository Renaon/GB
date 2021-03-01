package ru.geekbrains.lesson6;

public class Main {
    private static Animal[] strong;

    public static void main(String[] args){
        strong = new Animal[]{
                new Cat("Meowzilla"),
                new Cat("SCP-795"),
                new Cat("SCP-529"),
                new Cat("SCP-3487"),
                new Dog("SCP-2420"),
                new Dog("SCP-939"),
                new Dog("SCP-367")
        };

        strong[0].run(100);
        strong[6].run(1000);
        strong[3].swim(5);
        strong[5].swim(10);

        print_Counting();
    }

    private static void print_Counting(){
        int cats = 0;
        int dogs = 0;
        for(Animal key: strong){
            if(key instanceof Cat) cats++;
            else dogs++;
        }
        System.out.println("Котов: " + cats + "\nСобак: " + dogs);
    }
}
