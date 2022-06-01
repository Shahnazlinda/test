package projectjava2;

public class AccessmodifiersPre {

	
	//Syntax of accessmodifiers
	//Accessmodifier return type methodname() {}
	
	public void fblogin () {
		
	}
	
	private void methodB () {
		
	}
	
	void methodC () {
		
	}
	
	int A =10;
	
	String car = "BMW";
	
	
	public static void main(String[] args) {
		
		AccessmodifiersPre	obj = new AccessmodifiersPre();
		 System.out.println(obj.A);
	    System.out.println(obj.car);
	
	    obj.fblogin();
	    obj.methodB();
	    obj.methodC();
		
	}

}
