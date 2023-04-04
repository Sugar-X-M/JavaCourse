package org.example.OOP;

public class Person {


    private String name;
    private String surname;
    private short age;


    public Person(String name, String surname, short age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    static Person person = new Person("Anton", " Romanov", (short)27);

    public static void main(String[] args) {
        person.exist();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getAge() {
        return age;
    }



    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return("My name is "+ name + surname +"and I'm "+ age +" years old");
    }

    public void exist(){
        System.out.println(toString() + " I am a person");
    }
}
