package arrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

//        Utwórz listę tablicową składającą się z 3 elementów
//+ wyświetl środkowy element
//+ usuń środkowy element
//+ wyświetl listę

        List list1 = new ArrayList<>();
        list1.add("raz");
        list1.add("dwa");
        list1.add("trzy");

        System.out.println("Rozmiar Listy" + list1.size());

        int listSize = list1.size();
        int middleItem = listSize / 2;
        System.out.println("Środkowy wyraz listy to: " + list1.get(middleItem));
        list1.remove(middleItem);
        System.out.println("Lista: " + list1);


// Utwórz listę wskaźnikową i dodaj do niej 100 losowych elementów z przedziału <0, 10>

        List myLinkedList = new LinkedList();

        for (int i = 0; i<100; i++){


        myLinkedList.add((int)( Math.random()*11));
    }
        System.out.println("Rozmiar listy: " + myLinkedList.size());
        System.out.println(myLinkedList);
    }
}
