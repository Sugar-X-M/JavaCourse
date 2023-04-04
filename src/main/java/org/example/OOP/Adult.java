package org.example.OOP;

public class Adult extends Person {
    public Adult(String name, String surname, short age) {
        super(name, surname, age);
    }
    static Adult adult = new Adult("Irina", " Antoci ", (short) 27);

    public static void main(String[] args) {
    adult.exist();
    }

    @Override
    public void exist() {
        System.out.println(toString() + " I would like to play games, but I have no time ");
    }
}
