package programs;
//demonstrating ArrayList program
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class DemoArrayList {

	public static void main(String[] args) {
		List list=new ArrayList();
		//add elements
    list.add(10);
    list.add(3.14);
    list.add('a');
    list.add("Ammu");
    list.add(10);
    list.add(null);
    //print statement
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.set(1, 100));
    list.add(2, 25);
    System.out.println(list);
    list.remove(4);
    System.out.println(list.contains('b'));
    System.out.println(list.size());
    System.out.println(list);
    
         Iterator itr=list.iterator();
         while(itr.hasNext())
        	 System.out.println(itr.next());
         
	}

}
