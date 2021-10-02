package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruitList = new ArrayList<String>();

		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Pineapple");
		Iterator<String> itr = fruitList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		List<String> fruitList1 = Collections.synchronizedList(new ArrayList<String>());

		fruitList1.add("Mango");
		fruitList1.add("Banana");
		fruitList1.add("Apple");
		fruitList1.add("Strawberry");
		fruitList1.add("Pineapple");

		synchronized (fruitList1) {
			Iterator<String> itr1 = fruitList1.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
			}
		}
	}

}
