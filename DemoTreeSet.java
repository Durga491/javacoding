package programs;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		//Creating Object for TreeSet
				TreeSet<String> tset= new TreeSet<String>();
				//Adding Elements into TreeSet
				tset.add("Hyderabad");
				tset.add("Adilabad");
				tset.add("nalagonda");
				tset.add("Khammam");
				tset.add("Medak");
				//Printing TreeSet elements
				System.out.println(tset);
				System.out.println(tset.contains("Khammam"));
				System.out.println(tset.descendingSet());
				System.out.println(tset.first());
				System.out.println(tset.floor("Adilabad"));
				System.out.println(tset.higher("Medak"));
				System.out.println(tset.pollLast());
				System.out.println(tset.isEmpty());
				System.out.println(tset.last());
				System.out.println(tset.lower("Khammam"));
				System.out.println(tset.pollFirst());
				System.out.println(tset.pollLast());
				System.out.println(tset.remove("nalagonda"));
				System.out.println(tset);
				System.out.println(tset.size());
				tset.clear();
				System.out.println(tset);
				 

			}

		


	}


