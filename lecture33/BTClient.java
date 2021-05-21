package lecture33;

public class BTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 true 20 true 40 false true 60 false false true 50 false false true 30 false true 70 false false
		BinaryTree bt = new BinaryTree();
		bt.createTree();
		bt.display();
		System.out.println("------------");
//		System.out.println(bt.size());
//		System.out.println(bt.max());
//		System.out.println(bt.ht());
//		System.out.println(bt.search(500));
		
		bt.preorder();
		System.out.println();
		bt.postorder();
		System.out.println();
		bt.inorder();
		

	}

}
