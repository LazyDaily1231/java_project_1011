package 배열응용;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		int [] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		final int CASH = 10000;//항상 똑같은 수가 들어가는 변수(상수)
		//final은 상수를 나타냄, 변경 불가능! 변수명은 모두 대문자
		
		while (true) {
			System.out.println("-------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("원하는 좌석을 입력하세요(종료는 -1)>>>");
			int num = sc.nextInt();// 0번 입력
			if (num == -1) {
				System.out.println("예약 시스템을 종료합니다");
				int total = count * CASH;
				System.out.println("당신의 지불 금액은" + total + "원입니다");
				System.exit(0);
				break;
			} 
			//예약처리 하기 전에 이미 그 자리가 예약된 자리인지 확인 해야함
			//확인 방법을 정해보자
			//0번을 입력했으면 배열의 인덱스 0번자리를 1로 변경해서
			//예약되었다라는 것을 저장해두자.
			if(seat[num] != 1) {
			seat[num] = 1;
			System.out.println(num + "번 예약 완료");
			count++;
			}else {
				System.out.println("이미 예약된 자리입니다");
				System.out.println("다른 좌석을 선택하세요");
			}
			System.out.println();
		}
		sc.close();
		//예약된 자리를 배열에 1이 들어간 개수를 세어도 구할 수 있음
		//1.지금까지 배열에 저장된 값 들중 1이 몇개인지 세어보자
		//{1,1,1,0,0,0...}
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			}
		}
		System.out.println(count2 + "자리 예약됨");
		//2. 1로 예약된 자리가 어딘지 프린트
		String sum = " ";
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				//System.out.println(i + "번 자리");
				sum = sum + i + "번" ;
			}
		}
	}

}
