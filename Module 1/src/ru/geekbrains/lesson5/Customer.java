package ru.geekbrains.lesson5;

public class Customer {
    private  String name;
    private  String vacancy;
    private  String email;
    private  String phone;
    private  int salary;
    private int age;

    public Customer(String name, String vacancy, String email, String phone, int salary, int age){
        this.name = name;
        this.vacancy = vacancy;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public  void printInfo(){
        System.out.println("Имя: " + this.name +
                "\n Должность: " + this.vacancy + "\n Email: " + this.email +
                "\n Телефон: " + this.phone + "\n Оплата: " + this.salary +
                "\n Возраст: " + this.age);
    }

    public int getAge(){
        return this.age;
    }
}
