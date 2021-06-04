package lecture34;

public class BSTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bt = new BST();
		bt.create(new int[] {10,20,30,32,35,37,40,50,60,70});
		bt.display();
		System.out.println(bt.search(70));
		System.out.println(bt.max());
		
//		bt.add2(35);
//		bt.display();
//		System.out.println();
//		bt.remove(40);
//		bt.display();
		
//		bt.inorder();
//		System.out.println();
//		bt.printDecreasing();
		
//		bt.replaceWithlarger();
//		bt.display();
		
		bt.printInRange2(30, 60);
		System.out.println();
		System.out.println(bt.isBST3());
		

	}

}
