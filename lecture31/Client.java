package lecture31;

import lecture29.LinkedList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
////		ll.addLast(9);
		ll.display();
//		
//		ll.reverse_k(3);
		ll.fold();
		ll.display();
		
//		ll.DummyListCycle();
		

	}

}
