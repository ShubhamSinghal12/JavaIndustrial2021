package lecture29;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		OuterClass out = new OuterClass();
//		out.value();
//		
//		OuterClass.InnerClass in = out.new InnerClass();
//		in.Innervalue();
		
		
		LinkedList ll = new LinkedList();
		System.out.println(ll.size());
		ll.addFirst(3);
		ll.display();
//		ll.addFirst(2);
//		ll.addFirst(1);
////		ll.addLast(4);
//		ll.addLast(5);
//		ll.addAt(4, 3);
//		ll.display();
//		System.out.println(ll.size());
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getAt(2));
//		System.out.println("----------------");
		
//		System.out.println(ll.removeFirst());
//		System.out.println(ll.removeLast());
//		ll.display();
		System.out.println(ll.size());
		System.out.println(ll.removeAt(0));
		
		ll.display();
		
		
		
	}

}
