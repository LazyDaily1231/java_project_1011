package 배열응용;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		//String에 포함되어있는 공백을 제거할 때는 trim을 사용
		String s1 = "     감자   ";
		System.out.println(s1.length());
		
		String s2 = s1.trim();
		System.out.println(s2.length());
		
		
		String s3 = s1.replace("    ", "");
		System.out.println(s3.length());
		
		
		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파  ";
		System.out.println(data.length());
		String data2 = data.trim();
		System.out.println(data2);
		System.out.println(data2.length());
		//replace 비파괴 함수 
		String data3 = data2.replace(" ", "");
		System.out.println(data3);
		
		int[] num = {1, 2, 5 ,10, 4, 20};
		//파괴 함수
		Arrays.sort(num);
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
