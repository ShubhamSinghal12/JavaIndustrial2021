package lecture32;

public class GenericClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 3 20 2 50 0 60 0 30 0 40 1 70 0
		GenericTrees gt = new GenericTrees();
		
		gt.createTree();
		gt.display();
		System.out.println("------------");
		System.out.println(gt.size());
		System.out.println(gt.max());
		System.out.println(gt.ht());
		
		gt.postorder();

	}

}
