package chap18;
/*
 * Runnable 인터페이스를 이용하여 람다식으로 스레드 생성하기
 */
public class LambdaEx2 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Runnable r = ()->{
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			System.out.println("1부터100까지의 합1:" + sum);
		};
		Thread t = new Thread(r);
		Thread t2 = new Thread(()-> {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			System.out.println("1부터100까지의 합2:" + sum);
		});
		t.start();
		t2.start();
		System.out.println("main 종료");
	}
}
