package org.example.collection;
import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(88);
        number.add(0,79);

        System.out.println(number);

        ArrayList<Integer>number2= new ArrayList<Integer>();
        number2 = (ArrayList) number.clone();

        System.out.println(number2);
        number.remove(2);
        System.out.println(number);
        number.clear();

        System.out.println(number);

        System.out.println(number2.contains(88));
        System.out.println(number.indexOf(55));

        int elemToFind;
        elemToFind = 88;

        for(int i=0; i<number2.size(); i++){
            if(elemToFind == number2.get(i)){
                System.out.println("Element " + elemToFind+" fount -> position "+ i );
            }
        }
    }
}
