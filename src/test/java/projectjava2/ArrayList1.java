package projectjava2;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//ArratList<data type>	variable name = new ArratList<data type>();
		
		
		ArrayList<String>Fruits = new ArrayList<String>();
		    Fruits.add("Mango");
		    Fruits.add("Apple");
		    Fruits.add("Orange");
		    Fruits.add("Jackfruit");
		    Fruits.add("Banana");
		    
		   System.out.println(Fruits);
		    
 //Access an item: To access an item we use get() keyword and we refer to the index number
		    
	//Access Example
		    Fruits.get(1);
		   System.out.println(Fruits.get(1));
		    
	//Change an item: if we want to change an item in arrayList we have to use set() keyword
		 //   and we refer to the index number
		    Fruits.set(0, "Greaps");
		    System.out.println(Fruits.set(0, "Greaps"));
	
		//in ArrayList we also can remove our item.To remove our item we use remove keyword 
		    // and also refer to the index number.like as 
		    Fruits.remove(2);
		 System.out.println(Fruits.remove(2));
		    
		  Fruits.size();
		    System.out.println(Fruits.size());
		    
		    Fruits.clear();
		    System.out.println(Fruits);
		    
		    
		    
	}

}
