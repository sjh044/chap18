package chap18;
/* �翵��
 * LambdaInterface3�� �̿��Ͽ� �Էµ� ���ڱ����� ���� ���ϱ�. ���ٽ� ���
 */
public class Exam1 {
	public static void main(String[] args) {
		LambdaInterface3 f3;
		f3 = x->{
			int sum =0;
			for(int i=1; i<=x; i++) {
				sum += i;
			}
			System.out.println(sum);
		};
		f3.method(10); //55
		f3.method(100); //5050
	}
}
