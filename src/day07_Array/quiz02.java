package day07_Array;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even =null;
		System.out.println("¦��, Ȧ�� �Է� : ");
		odd_even = input.next();
		
		//���ڴ� equals�� ������Ѵ�
		if(odd_even.equals("¦��")) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					System.out.println(odd_even+":"+arr[i]);
				}
			}
		}else {
			for(int i =1;i<arr.length;i++) {
				if(arr[i]%2==1) {
				System.out.println(odd_even+":"+arr[i]);
			}
		}

		
			}
		
		
		
		System.out.println("===============");
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]%2 == 0 && odd_even.equals("¦��")) {
				System.out.println(odd_even+":"+arr[i]);
			}else if(arr[i]%2 == 1 && odd_even.equals("Ȧ��")){
				System.out.println(odd_even+":"+arr[i]);
			}
		}
	
		
}
}

