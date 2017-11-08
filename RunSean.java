package za.ac.cput.ExtremeCoders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RunSean
{
    private List list = new ArrayList();
    private Set set = new HashSet();
    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    public void runSmartPhones()
    {
        TelevisionSets TelevisionSet1 = new TelevisionSets(146545484,"Sony", "Bravia 3");
        TelevisionSets TelevisionSet2 = new TelevisionSets(284713214,"Hisense", "Hi 5");
        TelevisionSets TelevisionSet3 = new TelevisionSets(389878997,"Samsung", "Panama");
        TelevisionSets TelevisionSet4 = new TelevisionSets(389878997,"LG", "Gerilla");

        list.add(TelevisionSet1);
        list.add(TelevisionSet2);
        list.add(TelevisionSet3);
        list.add(TelevisionSet4);

        System.out.println("Number of smartphones in the list: " + list.size());

        set.add(TelevisionSet1);
        set.add(TelevisionSet2);
        set.add(TelevisionSet3);
        set.add(TelevisionSet4);

        System.out.println("Number of smartphones in the set: " + set.size());

        singlyLinkedList.addAtHead(TelevisionSet1);
        singlyLinkedList.addAtHead(TelevisionSet2);
        singlyLinkedList.addAtHead(TelevisionSet3);
        singlyLinkedList.addAtHead(TelevisionSet4);

        singlyLinkedList.print();
    }

    public static void main(String[] args)
    {
        RunSean run = new RunSean();
        run.runSmartPhones();
    }
}
