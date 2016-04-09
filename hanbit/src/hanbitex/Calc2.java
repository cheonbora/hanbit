package hanbitex;

import java.util.Scanner;

/**
 * 2016. 4. 9. 
 * Calc.java 
 * cheonbora@naver.com 
 * story : branch2 예제(계산기 프로그램)
 */
public class Calc2 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, op = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산자 종류를 입력(1: +, 2: -, 3: *, 4: / 입니다)");
		op = scanner.nextInt();

		if (op == 1) {

			System.out.println("===두 수의 더하기 프로그램===");
			System.out.println("첫번째 정수 입력:");
			a = scanner.nextInt();
			System.out.println("두번째 정수 입력:");
			b = scanner.nextInt();
			c = a + b;
			System.out.println(a + "+" + b + "=" + c);

		} else if (op == 2) {
			System.out.println("==두 수의 뺄셈 프로그래밍==");
			System.out.println("첫번째 정수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 정수 입력");
			b = scanner.nextInt();
			c = a - b;
			System.out.println(a + "-" + b + "=" + c);

		} else if (op == 3) {
			System.out.println("==곱셈문법==");
			System.out.println("첫번째 수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 수 입력");
			b = scanner.nextInt();
			c = a * b;
			System.out.println(a + "*" + b + "=" + c);

		} else if (op == 4) {
			System.out.println("==나눗셈 프로그래밍==");
			System.out.println("첫번째 수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 수 입력");
			b = scanner.nextInt();
			c = a / b;
			d = a % b;
			System.out.println(a + "/" + b + "=" + c + "..." + d);

		} else {
			System.out.println("연산기호를 잘못 입력했습니다.");
		}

	}
}
