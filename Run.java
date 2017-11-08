package lilo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run
{
    private static List list = new ArrayList();
    private static Set set = new HashSet();
    private static SingleLinkedList singlyLinkedList = new SingleLinkedList();

    public static void main(String[] args)
    {
        Chips chips1 = new Chips(1,"Lays");
        Chips chips2 = new Chips(2,"Simba");
        Chips chips3 = new Chips(3,"Jumping Jacks");
        Chips chips4 = new Chips(3,"Nik naks");

        list.add(chips1);
        list.add(chips2);
        list.add(chips3);
        list.add(chips4);

        System.out.println("Number of chips in the list: " + list.size());

        set.add(chips1);
        set.add(chips2);
        set.add(chips3);
        set.add(chips4);

        System.out.println("Number of chips in the set: " + set.size());

        singlyLinkedList.addAtHead(chips1);
        singlyLinkedList.addAtHead(chips2);
        singlyLinkedList.addAtHead(chips3);
        singlyLinkedList.addAtHead(chips4);

        singlyLinkedList.print();
    }
}

