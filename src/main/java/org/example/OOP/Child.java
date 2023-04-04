package org.example.OOP;

public class Child extends Person{
    public Child(String name, String surname, short age) {
        super(name, surname, age);
    }

    public static void main(String[] args) {

        Child child = new Child("Anjela", " Ivanova", (short) 5);

        child.exist();
    }


    @Override
    public void exist() {
        System.out.println(toString() + " I like to play games");
    }


}
