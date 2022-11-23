package javabasics;

public class oloading {
	public void add(int a) {
		System.out.println(a*a);
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oloading o=new oloading();
		o.add(6);
		o.add(6,8);
		
	}

}
