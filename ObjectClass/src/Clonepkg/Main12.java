package Clonepkg;

public class Main12 {
	public static void main(String[] args) {
		
	Clone123 c=new Clone123("kowshik",413);
	Clone123 c1;
	
	try {
		c1 = (Clone123)c.clone();
		System.out.println(c1);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}