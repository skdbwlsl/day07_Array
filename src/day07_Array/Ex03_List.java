package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		/*
		List
		 -ArratList
		 -LinkedList
		 -Stack...���� �ִ�
		 ArrayList
		 -�����Ϳ� ���� ������ �ִ�. index�� ���� �����ϴ�
		 -�ߺ��� �����͸� ���� �� �� �ִ�
		 -�迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�
		 -������ ũ�⸦ ���´�
		  
		  int [] a = new int[10] ,�⺻�� �̰�
		 */
		
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		
		System.out.println(arr.get(0));//index������ 0��° ��ġ ��, ù ���� ��ġ
		System.out.println(arr.get(1));//index������ 1��° ��ġ ��, �� ��° ��ġ
		
		System.out.println(arr.size());//���� ����� ������ �˷���
		
		//�ش���ġ�� 123�� �ֳİ� ����� �� true/false�� ���
		System.out.println(arr.contains("1231"));

		//remove
		//System.out.println(arr.remove("123"));
		System.out.println(arr.remove(1));
		System.out.println(arr);
		System.out.println(arr.get(0));
	
		//clear
		arr.clear();
		System.out.println("���� �� arr : " + arr);
	}

}
