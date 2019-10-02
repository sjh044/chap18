package chap18;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * Function �迭 �Լ� �������̽� : applyXXX  �߻�޼��带 ����� ������.
 * �Ű������� �ְ�, ���ϰ��� ����.
 */
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	//getter
	public String getName() {		return name;	}
	public int getEng() {		return eng;	}
	public int getMath() {		return math;	}
	public String getMajor() {		return major;	}	
}
public class LambdaEx8 {
	private static Student[] list = {
		new Student("ȫ�浿",90,80,"�濵"),new Student("���",95,70,"�İ�")};
	public static void main(String[] args) {
		System.out.print("�л��� �̸�:");
		printString(t->t.getName());
		System.out.print("���� �̸�:");
		printString(t->t.getMajor());
		System.out.print("���� ����:");
		printInt(t->t.getEng());
		System.out.print("���� ����:");
		printInt(t->t.getMath());
		System.out.print("���� ���� �հ�:");
		printTot(t->t.getEng());
		System.out.print("���� ���� �հ�:");
		printTot(t->t.getMath());
		System.out.print("���� ���� ���:");
		printAvg(t->t.getEng());
		System.out.print("���� ���� ���:");
		printAvg(t->t.getMath());
	}
	private static void printAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for (Student s : list) {
			sum += f.applyAsDouble(s);
		}
		System.out.printf("%.2f\n",sum/list.length);
	}
	private static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for (Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	private static void printInt(ToIntFunction<Student> f) {
		for (Student s : list) {
			System.out.print(f.applyAsInt(s)+",");
		}
		System.out.println();
	}
	//Function<Student,String> : �Ű����� : Student, ����Ÿ�� : String
	private static void printString(Function<Student,String> f) {
		for (Student s : list) {
			System.out.print(f.apply(s)+",");
		}
		System.out.println();
	}
}
