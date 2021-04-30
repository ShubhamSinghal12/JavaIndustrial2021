package lecture26;

public class Dynamic_Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
//		DynamicStack st = new DynamicStack();
//		
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		st.push(5);
//		st.push(6);
//		
//		st.display();
		
		
		DynamicQueue qu = new DynamicQueue();
		
		for(int i = 1; i <= 30; i++)
			qu.enqueue(i);
		
		
		qu.display();
		System.out.println(qu.dequeue());

	}

}
