package ArrayList.comparatorinterface;

import java.util.Comparator;

import ArrayList.Books;

public class CusImplementationComparator implements Comparator<Books> {

	@Override
	public int compare(Books o1, Books o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
