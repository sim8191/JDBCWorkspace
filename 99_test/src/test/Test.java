package test;

public class Test {
	public static void main(String[] args) {
		new Test().test1();
	}
	
	public void test1() {
		System.out.println("1");
		new Test().test2();
	}
	
	public void test2() {
		System.out.println("2");
		new Test().test3();
	}
	
	public void test3() {
		int i = 0;
		System.out.println("3");
		i++;
		if(i == 3) {
			return;
		}
	}
}
