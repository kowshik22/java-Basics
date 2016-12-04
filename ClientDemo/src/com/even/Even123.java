package com.even;

	public class Even123 {
		void even(int a) {
			if(a%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}

		public static void main(String[] args) {
			Even123 obj=new Even123();
			obj.even(11);

		}

	}


