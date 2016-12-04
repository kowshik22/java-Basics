package com.Equalspkg;

public class Equal2 {

	String name;
	int rno;
	Equal2(String name,int rno){
		this.name=name;
		this.rno=rno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Equal2 e1=new Equal2("kowshik",435);
		Equal2 e2=new Equal2("satya",436);
		Equal2 e3=new Equal2("kowshik",435);
		Equal2 e4=e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
System.out.println(e4.equals("durga"));
	}

}
