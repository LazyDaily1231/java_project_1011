package 문제풀이;

public class 깊은복사는언제쓰는가 {

	public static void main(String[] args) {
		String[]sub = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] term1 = { 44, 66, 22, 99, 100 };
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;
		
		for (int x : term1) {
			System.out.println(x);	
		}
		System.out.println("===========================");
		for (int y : term2) {
			System.out.println(y);
		}
		System.out.println("===========================");
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count++;
			}
		}
		System.out.println("동일한 과목수는 " + count + "개 입니다");
		System.out.println("===========================");
		
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
		if(term1[i] < term2[i]) {
			count1++;
		}
	}
	System.out.println("향상된 과목수는 " + count1 + "개 입니다");
	System.out.println("===========================");
	for (int i = 0; i < term2.length; i++) {
		if(term1[i] < term2[i]) {
			System.out.println("향상된 과목명은 " + sub[i] + "입니다");
		}	
	}
}		
}
