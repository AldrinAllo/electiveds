import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Zibele on 2017-11-07.
 */
public class Main {



    public static void main(String[] args) {

        LinkedList linkedlist=new LinkedList();

        ArrayList arrayList=new ArrayList();

        HashSet hashSet=new HashSet();

        Home a=new Home("Owner_A","Address_A");

        Home b=new Home("Owner_B","Address_B");

        Home c=new Home("Owner_C","Address_C");

        Home d=new Home("Owner_C","Address_C");

        linkedlist.add(a);

        arrayList.add(b);

        hashSet.add(c);

        hashSet.add(d);

        
    }
}
