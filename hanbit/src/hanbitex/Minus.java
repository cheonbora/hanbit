package hanbitex;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Minus.java 
 * cheonbora@naver.com
 * story : 정수 뺄셈
 */
public class Minus {
	public static void main(String[] args) {
		System.out.println("==두 수의 뺄셈 프로그래밍==");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int a = scanner.nextInt();
		System.out.println("두번째 정수 입력");
		int b = scanner.nextInt();
		int c = a-b;
		System.out.println(a + "-" + b + "=" + c );
			
		
	}
}
