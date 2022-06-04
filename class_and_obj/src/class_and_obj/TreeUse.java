package class_and_obj;

public class TreeUse {

	
	//main method
	
	public static void main(String[] args) {
		TreeNoedes<Integer> root=new TreeNoedes<Integer>(5);
		
		TreeNoedes<Integer> node1=new TreeNoedes<Integer>(2);

		TreeNoedes<Integer> node2=new TreeNoedes<Integer>(3);

		TreeNoedes<Integer> node3=new TreeNoedes<Integer>(5);

		TreeNoedes<Integer> node4=new TreeNoedes<Integer>(6);
	
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		root.children.add(node4);
		
		System.out.println(root);
		
}}
