package lecture27;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		StackUsingQueue st = new StackUsingQueue();
//		
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		
//		st.display();
//		
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.peek());
//		
//		st.display();
		
		QueueUsingStack qt = new QueueUsingStack();
		
		qt.enqueue(1);
		qt.enqueue(2);
		qt.enqueue(3);
		qt.enqueue(4);
		qt.enqueue(5);
		
		qt.display();
		System.out.println();
		
		System.out.println(qt.dequeue());
		System.out.println(qt.dequeue());
		System.out.println(qt.getFront());
		
		qt.enqueue(6);
		qt.enqueue(7);
		
		qt.display();

	}

}
