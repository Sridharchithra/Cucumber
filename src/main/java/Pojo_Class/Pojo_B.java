package Pojo_Class;

public class Pojo_B {

	public static void main(String[] args) {
		Pojo_A p=new Pojo_A();
		int a = p.getA();
		System.out.println("before set:"+a);
		
		
		p.setA(20);
		p.setA(40);

		int a2 = p.getA();
		System.out.println("after set:"+a2);
		
	}
	

}
