package chap18;
/*
 * Runnable �������̽��� �̿��Ͽ� ���ٽ����� ������ �����ϱ�
 */
public class LambdaEx2 {
	public static void main(String[] args) {
		System.out.println("main ����");
		Runnable r = ()->{
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			System.out.println("1����100������ ��1:" + sum);
		};
		Thread t = new Thread(r);
		Thread t2 = new Thread(()-> {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			System.out.println("1����100������ ��2:" + sum);
		});
		t.start();
		t2.start();
		System.out.println("main ����");
	}
}
