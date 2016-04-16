package hanbitex;

/**
 * 2016. 4. 16.
 * Sumif10.java 
 * cheonbora@naver.com
 * story :for-loop + if-branch 수열의 합
 */
public class Homework {
	public static void main(String[] args) {
		// 문제: for-loop과 syso를 한번만 써서 홀수합, 짝수합을 구하시오
		int oddsum=0, evensum=0;
		for (int i = 1; i <= 10; i++) {
			//이 부분만 코팅하시오.
			if (i%2==1) {
				oddsum +=i;
			} else {
				evensum +=i;
			}
			
			
		}
		System.out.println("홀수합=" + oddsum+"이고, 짝수합은" + evensum + "이다.");
}
}
//1 3 5 7 9 
//2 4 6 8 10