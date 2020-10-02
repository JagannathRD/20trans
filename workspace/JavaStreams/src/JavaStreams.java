import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		Iterator<Integer> itr=numbers.iterator();
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		}
		
		List<Integer> res= numbers.stream().map(n->n*n).collect(Collectors.toList());

	}

}
