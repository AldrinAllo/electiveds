package za.ac.cput.ExtremeCoders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run
{
    private List list = new ArrayList();
    private Set set = new HashSet();
    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    public void runSmartPhones()
    {
        SmartPhone smartPhone1 = new SmartPhone(146545484,"Samsung", "A3");
        SmartPhone smartPhone2 = new SmartPhone(284713214,"iPhone", "8");
        SmartPhone smartPhone3 = new SmartPhone(389878997,"Huawei", "P10");
        SmartPhone smartPhone4 = new SmartPhone(389878997,"LG", "G6");

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

    public static void main(String[] args)
    {
        Run run = new Run();
        run.runSmartPhones();
    }
}
