package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/*1 문제 
		     스캐너로 "Gold" 를 넣으면 "금메달 입니다" 를 출력
		     스캐너로 "Silver" 를 넣으면 "은메달 입니다" 를 출력
		     스캐너로 "Bronze" 를 넣으면 "동메달 입니다" 를 출력
		     그외는 "메달이 없습니다." 
		     */
		Scanner sc = new Scanner (System.in);
		System.out.println("메달을 입력해 주세요? (Gold, Silver, Bronze)>>>");
		String medal = sc.next();
		
		switch (medal) {
		case "Gold": case "gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver": case "silver":
			System.out.println("은메달 입니다.");
			break;
		case "Bronze": case "bronze":
			System.out.println("동메달 입니다.");
			break;
		default: 
			System.out.println("메달이 없습니다. ");
		}		
		sc.close();
				
		
		
		
		
		  /*   
		  2. 문제 
		   	  스케너로 월을 인풋받아서 해당월의 총 날짜를 
		   	   "<월>은  <몇일> 일까지 있습니다."
		   	   
		   	   <<완료시간 12:00 까지 >>
		 */
	}
}
