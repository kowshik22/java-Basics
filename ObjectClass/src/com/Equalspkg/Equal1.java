package com.Equalspkg;

public class Equal1 {
	String name;
	int rno;
	Equal1(String name,int rno){
		this.name=name;
		this.rno=rno;
	}
	public boolean equals(Object obj) {
		try {
		String name1=this.name;
		int rno1=this.rno;
		Equal1 e=(Equal1)obj;
		String name2=e.name;
		int rno2=e.rno;
		if(name1.equals(name2)&& rno1==rno2) {
			return true;
		}
		else {
			return false;
		}
		}
		catch(ClassCastException e) {
			return false;
		}
	}
	public static void main(String[] args) {
		Equal1 e1=new Equal1("kowshik",435);
		Equal1 e2=new Equal1("satya",436);
		Equal1 e3=new Equal1("kowshik",435);
		Equal1 e4=e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}
	
}
