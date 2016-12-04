package com.hashcodepkg;

public class Hashcode5 {
	int i;
	Hashcode5(int i) {
		this.i=i;
	}
	public String toString() {
		return i+" ";
	}
	public int hashCode() {
		return i;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Hashcode5 o1=new Hashcode5(10);
	Hashcode5 o2=new Hashcode5(11);
	Hashcode5 o3=new Hashcode5(12);
	System.out.println(o1);
	System.out.println(o2);
	System.out.println(o3);
		}

	}

