import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RunPhenyo
{
    private static List list = new ArrayList();
    private static Set set = new HashSet();
    private static SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    public static void main(String[] args)
    {
        Beer beer1 = new Beer(1,"Castle");
        Beer beer2 = new Beer(2, "Amstel");
        Beer beer3 = new Beer(3, "Black Label");
        Beer beer4 = new Beer(3, "Heineken");

        list.add(beer1);
        list.add(beer2);
        list.add(beer3);
        list.add(beer4);

        System.out.println("Number of beers in the list: " + list.size());

        set.add(beer1);
        set.add(beer2);
        set.add(beer3);
        set.add(beer4);

        System.out.println("Number of beers in the set: " + set.size());

        singlyLinkedList.addAtHead(beer1);
        singlyLinkedList.addAtHead(beer2);
        singlyLinkedList.addAtHead(beer3);
        singlyLinkedList.addAtHead(beer4);

        singlyLinkedList.print();
    }
}
