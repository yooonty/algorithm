package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자Iterator {

	public static void main(String[] args) {
		HashSet<String> bag = new HashSet<String>();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("볼펜");
		bag.add("책");
		bag.add("책");
		System.out.println(bag.size());
		System.out.println(bag);

		// set에서 꺼내올 때는 iterator를 만들어주어야 한다.
		Iterator<String> it = bag.iterator();
		System.out.println(it.hasNext());
		for (int i = 0; i < bag.size(); i++) {
			String x = it.next();
			System.out.println(x);
			System.out.println(it.hasNext());
		}
		System.out.println("-----------------");
		Object[] list = bag.toArray();
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
