package rps;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * RPS.java 
 * cheonbora@naver.com
 * story : 가위바위보 게임
 */
public class GameRPS2 {
	/**
	 컴퓨터와 사용자간의 가위바위보 게임을 완성하시오.
	 Math.random()*E+S
	 S는 시작값
	 E는 마지막값
	 **/
	public static void main(String[] args) {
		
		System.out.println("==가위바위보 게임===");
		System.out.println("가위:1, 바위:2, 보:3");
		Scanner scanner = new Scanner(System.in);
		//----------------------[가공해야할 데이터를 입력하는 부분]syso는 로직(사용자)에 보이면 안됨-------------------------
		int sccisors=1, rock=2, paper=3, rpsValue=0, comValue=0;
		rpsValue = scanner.nextInt();
		comValue = (int) (Math.random()*3+1);
		String result = "";
		switch (rpsValue) {
		case 1:
			if (comValue==1) {
				result="사용자: "+ "가위" + " vs " + "컴퓨터: "+ "가위" + " =비김";
			}else if(comValue==2){
				result="사용자: "+"가위"+ " vs " + "컴퓨터: "+ "바위" + " =패배";
			}else{
				result="사용자: "+"가위"+ " vs " + "컴퓨터: "+ "보자기" + " =승리";	
			}
			break;
		case 2:
			if (comValue==1) {
				result="사용자: "+"바위"+ " vs " + "컴퓨터: "+ "가위" + " =승리";
			}else if(comValue==2){
				result="사용자: "+"바위"+ " vs " + "컴퓨터: "+ "바위" + " =비김";
			}else{
				result="사용자: "+"바위"+ " vs " + "컴퓨터: "+ "보자기" + " =패배";	
			}
			break;
		
		
		case 3:
			if (comValue==1) {
				result="사용자: "+"보자기"+ " vs " + "컴퓨터: "+ "가위" + " =패배";
			}else if(comValue==2){
				result="사용자: "+"보자기"+ " vs " + "컴퓨터: "+ "바위" + " =승리";
			}else{
				result="사용자: "+"보자기"+ " vs " + "컴퓨터: "+ "보자기" + " =비김";	
			}
			break;
		default: result="1~3까지 숫자만 입력바랍니다.";
			break;
		}
		//-----------------[결과가 보여지는 부분]--------------------------
		System.out.println(result);
	}
}
