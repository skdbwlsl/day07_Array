package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		ArrayList food = new ArrayList();
		food.add("����");
		food.add("�ұ�");
		food.add("���");
		food.add("���");
		System.out.println(food);
		System.out.println("ã�� �� �Է� : ");
		String n = input.next();
		System.out.println(n+"��ġ : " + food.indexOf(n));
		//indexOF : �ش��ϴ� ���� ������ ��ġǥ��, ������ -1ǥ�ð��ȴ�
		
		//set
		System.out.println("������ ��ġ �Է� : ");
		int num = input.nextInt();
		System.out.println("������ �� �Է�");
		n = input.next();
		System.out.println("������\n" + food);
		food.set(num, n);
		System.out.println("���� ��\n" +food);
	}

}
