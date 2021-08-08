package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		/*
		List
		 -ArratList
		 -LinkedList
		 -Stack...등이 있다
		 ArrayList
		 -데이터에 대한 순서가 있다. index로 접근 가능하다
		 -중복된 데이터를 저장 할 수 있다
		 -배열과는 다르게 서로 다른 자료형도 넣을 수 있다
		 -가변의 크기를 갖는다
		  
		  int [] a = new int[10] ,기본은 이거
		 */
		
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		
		System.out.println(arr.get(0));//index상으로 0번째 위치 즉, 첫 번쨰 위치
		System.out.println(arr.get(1));//index상으로 1번째 위치 즉, 두 번째 위치
		
		System.out.println(arr.size());//현재 저장된 개수를 알려줌
		
		//해당위치에 123이 있냐고 물어보는 것 true/false로 출력
		System.out.println(arr.contains("1231"));

		//remove
		//System.out.println(arr.remove("123"));
		System.out.println(arr.remove(1));
		System.out.println(arr);
		System.out.println(arr.get(0));
	
		//clear
		arr.clear();
		System.out.println("삭제 후 arr : " + arr);
	}

}
