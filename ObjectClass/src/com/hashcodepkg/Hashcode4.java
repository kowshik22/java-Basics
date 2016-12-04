package com.hashcodepkg;

class Hashcode4 {
int i;
Hashcode4(int i) {
	this.i=i;
}
/*public String toString() {
	return i+" ";
}*/
public int hashCode() {
	return i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashcode4 o1=new Hashcode4(10);
Hashcode4 o2=new Hashcode4(11);
Hashcode4 o3=new Hashcode4(12);
System.out.println(o1);
System.out.println(o2);
System.out.println(o3);
	}

}
