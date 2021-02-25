package ru.geekbrains.lesson5;

public class Main {


    public static void main(String[] args){
        Customer[] persArray = new Customer[5];
        persArray[0] = new Customer("Мистер Смтт", "Spy", "smith@secretmail.bu", "95671334561",
                80000, 41);
        persArray[1] = new Customer("Миссис Смит", "Spy", "ladysmith@secretmail.bu", "7435621287",
                81000, 39);
        persArray[2] = new Customer("Gomes", "buisnessman", "Gomes@addams.bu", "6668741313",
                180000, 36);
        persArray[3] = new Customer("Morticia Addams", "Florist", "Morticia@addams.bu", "1317465612",
                78000, 43);
        persArray[4] = new Customer("Fester", "Grenadeer", "kaboom@addams.bu", "9912354672",
                90500, 44);

        for(int i =0; i < persArray.length; i++){
            if(persArray[i].getAge() > 40) persArray[i].printInfo();
        }
    }
}
