
package za.ac.cput.ExtremeCoders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run
{
    public void runSmartPhones()
    {
        List list = new ArrayList();
        Set set = new HashSet();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Car smartPhone1 = new Car(146545484,"Samsung", "A3");
        Car smartPhone2 = new Car(284713214,"iPhone", "8");
        Car smartPhone3 = new Car(389878997,"Huawei", "P10");
        Car smartPhone4 = new Car(389878997,"LG", "G6");

        list.add(smartPhone1);
        list.add(smartPhone2);
        list.add(smartPhone3);
        list.add(smartPhone4);

        System.out.println("Number of smartphones in the list: " + list.size());

        set.add(smartPhone1);
        set.add(smartPhone2);
        set.add(smartPhone3);
        set.add(smartPhone4);

        System.out.println("Number of smartphones in the set: " + set.size());

        singlyLinkedList.addAtHead(smartPhone1);
        singlyLinkedList.addAtHead(smartPhone2);
        singlyLinkedList.addAtHead(smartPhone3);
        singlyLinkedList.addAtHead(smartPhone4);

        singlyLinkedList.print();
    }

    public void runCar(){
        List list = new ArrayList();
        Set set = new HashSet();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        Car car1 = new Car(146545484,"BMW", "A3");
        Car car2 = new Car(284713214,"Toyota", "8");
        Car car3 = new Car(389878997,"Tata", "P10");
        Car car4 = new Car(389878997,"Mercedes Benz", "G6");

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);

        System.out.println("Number of cars in the list: " + list.size());

        set.add(car1);
        set.add(car2);
        set.add(car3);
        set.add(car4);

        System.out.println("Number of cars in the set: " + set.size());

        singlyLinkedList.addAtHead(car1);
        singlyLinkedList.addAtHead(car2);
        singlyLinkedList.addAtHead(car3);
        singlyLinkedList.addAtHead(car4);

        singlyLinkedList.print();

    }
  
  public runChips
    {
        List list = new ArrayList();
        Set set = new HashSet();
        SingleLinkedList singlyLinkedList = new SingleLinkedList();
  
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

    public static void main(String[] args)
    {
        Run run = new Run();
        run.runSmartPhones();
        run.runCar();
        run.runChips();
    }

}
}
