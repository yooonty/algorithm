package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자Iterator2 {

	public static void main(String[] args) {
		HashSet<Integer> wallet = new HashSet<Integer>();
		// 일주일간 받았던 용돈
		// 1000, 2000, 3000, 2000, 4000, 2000, 3000
		int[] won = { 1000, 2000, 3000, 2000, 4000, 2000, 3000 };
		for (int w : won) {
			wallet.add(w);
		}

		// 일주일간 받았던 용돈 중에서
		// 얼마씩 받았는지 전체 프린트
		// 1000, 2000, 3000, 4000
		Iterator<Integer> it = wallet.iterator();
		for (int i = 0; i < wallet.size(); i++) {
			System.out.println(it.next());
		}
		System.out.println("--------------------");
		Object[] list = wallet.toArray();
		for (Object o : list) {
			System.out.println(o);
		}
	
	}

}
