package lecture25;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		Stack st = new Stack(4);
//		
//		st.push(1);
//		st.push(2);
//		st.display();
////		System.out.println();
//		
//		System.out.println(st.peek());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
////		System.out.println(st.pop());
//		
//		st.push(3);
//		st.push(4);
////		st.push(5);
//		
//		st.display();
		
		
		Queue qt = new Queue(4);
		
		qt.enqueue(1);
		qt.enqueue(2);
		qt.enqueue(3);
		qt.enqueue(4);
		
		qt.display();
		System.out.println(qt.getFront());
		System.out.println(qt.dequeue());
		System.out.println(qt.dequeue());
		System.out.println(qt.dequeue());
//		System.out.println(qt.dequeue());
		
		qt.enqueue(3);
		qt.enqueue(4);
		
		qt.enqueue(5);
//		qt.enqueue(6);
		
		qt.display();
		
		
	}

}
