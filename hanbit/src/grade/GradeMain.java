package grade;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * GradeMain.java 
 * cheonbora@naver.com
 * story : 성적표 프로그램
 */
public class GradeMain {
	/**
	 [문제] 
	 과목별 점수를 입력받아 총점, 평균, 학점을 구하는 프로그램을 완성하시오.
	 (과목은 국, 영, 수)
	 **/
	public static void main(String[] args) {
	//----(1) 변수 선언 영역----
	Scanner scanner = new Scanner(System.in);
	Grade grade = new Grade();
	int total=0;
	String name="";
	//----(2) 파라미터 입력 영역----
	System.out.println("이름: [ ], 국어: [  ], 영어: [  ], 수학: [  ]");
	name = scanner.next();
	//----(3) 메소드호출----
	total=grade.getTotal(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
	//----(4) 리턴값 출력 영역----
	System.out.println(name + "의 총점은"+ total+"이고, 평균은 "+grade.getAvg(total)+"이다.");
			
}
}
