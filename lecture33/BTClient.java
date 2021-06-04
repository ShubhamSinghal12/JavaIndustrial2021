package lecture33;

public class BTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 true 20 true 40 false true 60 false false true 50 false false true 30 false true 70 false false
		//10 true 20 true 40 false true 60 false false true 50 false false false
		//10 true 20 true 40 false true 60 false false true 50 false true 70 false false false
		BinaryTree bt = new BinaryTree();
//		bt.createTree();
		bt.createTreeUsingPreandIn(new int[] {10,20,40,50,60,30,70}, new int[] {40,50,20,60,10,30,70});
		bt.display();
		System.out.println("------------");
//		System.out.println(bt.size());
//		System.out.println(bt.max());
//		System.out.println(bt.ht());
//		System.out.println(bt.search(500));
		
//		bt.preorder();
//		System.out.println();
//		bt.postorder();
//		System.out.println();
//		bt.inorder();
		
		System.out.println(bt.diameter3());
		
		

	}

}
