package chap18;

import java.util.function.IntBinaryOperator;

/* 김정은
 * IntBinaryOperator 인터페이스를 이용하여 배열에 저장된 최대 숫자와 최소 숫자를 출력하기
 * 10개의 정수값을 1부터100까지 중 임의의 수로 채워 그중 가장 큰값과 가장 작은 값을 출력하기
 */
public class Exam3 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100)+1;
		}
		for(int a : arr) {
		   System.out.print(a+",");
		}
		System.out.println();
		System.out.println("최대값:"+maxOrMin((a,b)->(a>=b)?a:b));
		System.out.println("최소값:"+maxOrMin((a,b)->(a<=b)?a:b));
	}
	private static int maxOrMin(IntBinaryOperator op) {
		int result = arr[0];
		for(int a : arr) {
			result = op.applyAsInt(result, a);
		}
		return result;
	}
}
