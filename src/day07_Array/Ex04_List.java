package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_List {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num;
		
		//�ҹ����ΰ�� num.�ϸ� ������ �ʰ�, (�����������)
		//�빮���ΰ�� addNum.�ϸ� ���� ���´�(�����������)
		String addNum, printNum;
		System.out.println("���� ������ ���� �Է�");
		num = input.nextInt();
		for(int i = 0;i<num;i++) {
			System.out.println("�߰��� �� �Է�");
			addNum = input.next();
			arr.add(addNum);
		}
		System.out.println("-----���� �� ��� -----");
		for(int i =0;i<arr.size();i++) {
			Object obj =arr.get(i);
			String s = (String)obj;
			
			String ss = (String)arr.get(i);
			System.out.println(s);
		}
	}

}
