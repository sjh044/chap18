package chap18;
/*
 * 람다식의 객체는 내부객체로 표현된다.
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
			//iv = 50; //상수화 필요
			System.out.println("Outer.this.iv=" + Outer.this.iv);
			System.out.println("this.iv=" + this.iv); //Outer 클래스의 iv 멤버
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
