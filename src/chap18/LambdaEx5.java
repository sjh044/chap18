package chap18;
/*
 * ���ٽ��� ��ü�� ���ΰ�ü�� ǥ���ȴ�.
 */
interface LambdaInterface5 {
	void method();
}
class Outer {
	public int iv = 10;
	void method() {
		final int iv = 40;
		LambdaInterface5 f5 = ()->{
			//int iv = 50; //error
			//iv = 50; //���ȭ �ʿ�
			System.out.println("Outer.this.iv=" + Outer.this.iv);
			System.out.println("this.iv=" + this.iv); //Outer Ŭ������ iv ���
			System.out.println("iv=" + iv);
		};
		f5.method();
	}
}
public class LambdaEx5 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
