package org.example.OOP;

public class OldMan extends Person{
    public OldMan(String name, String surname, short age) {
        super(name, surname, age);
    }
    static OldMan oldMan = new OldMan("Galina", " Ivanovna", (short)68);

    public static void main(String[] args) {
    oldMan.exist();
    }
    @Override
    public void exist() {
        System.out.println(toString() + " I'm an old woman -_- ");
    }
}
