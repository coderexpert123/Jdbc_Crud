package class_and_obj;

import java.util.ArrayList;

public class TreeNoedes<T> {

	
	public T data;
	public ArrayList<TreeNoedes<T>> children;
	
	
	public TreeNoedes(T data) {
		
		this.data=data;
		children=new ArrayList<>();
		
		
	}
	
}
