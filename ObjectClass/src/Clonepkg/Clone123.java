package Clonepkg;

public class Clone123 implements Cloneable {
String name;
int rno;
Clone123(String name,int rno) {
	this.name=name;
	this.rno=rno;
}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
public String toString() {
	return name+" "+rno;
}
}
