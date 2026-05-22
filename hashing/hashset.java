import java.util.HashSet;
import java.util.Iterator;

public class hashset{
    public static void main(String[] args){
HashSet<Integer> set=new HashSet<>();


set.add(1);
set.add(2);
set.add(3);
set.add(4);
set.add(5);
set.add(6);
set.add(7);


// System.out.println(set);
// set.remove(1);

// if(set.contains(1)){
//     System.out.println("yes");
// }
// else{
//     System.out.println("no");
// }

// System.out.println(set.size());



// iterator

Iterator it=set.iterator();

while (it.hasNext()) {
   System.out.println(it.next());
    
}







    }
}