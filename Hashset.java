package programs;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
			
			HashSet<Integer> hset= new HashSet<Integer>();
			//Adding Integer Elements into the Hashset
			hset.add(22);
			hset.add(12);
			hset.add(97);
			hset.add(3);
			//Printing out the Hashset
			System.out.println(hset);
			System.out.println(hset.contains(9));
			System.out.println(hset.contains(97));
			System.out.println(hset.isEmpty());
			System.out.println(hset.remove(3));
			System.out.println(hset);
			System.out.println(hset.size());
			System.out.println(hset.isEmpty());
			System.out.println(hset);
			//Clearing out all the Elements Present in the Hashset  
			hset.clear();
			System.out.println(hset);
			
	}

}
