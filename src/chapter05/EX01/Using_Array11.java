package chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//탁구, 야구, 축구, 농구, 씨름   
		// 각 운동 종목의 구성원 수의 합과 평균 
		// <완료시간 17: 50분 >> 
		
		
		String s ; 
		do {
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요>>>");
			System.out.println("예) 입력 >>>  탁구  2  야구  9  축구  11 농구  6  씨름  2  >>>");
			s = sc.nextLine(); 
			if (s.equals("그만")) {break; }
			String [] arr; 
			arr = s.split(" "); 
			int b ; 	//각 종목의 구성원을 담는 변수 
			int sum =0 ; 	//각 종목의 구성원의 합을 담는 변수 
			int count =0; //각 종목을 카운트 하는 변수 
			for (int i =0 ; i < arr.length; i++) {
				if ( i % 2 != 0) {
					b = Integer.parseInt(arr[i]); 
					sum += b; 
					count++; 		
				}
			}
			System.out.println("종목의 갯수 : " + count);
			System.out.println("구성원의 합 : " + sum );
			System.out.println("구성원의 평균: " + sum / (double) count);
			System.out.println("=======================================");
			System.out.println();
		}while (true);
		System.out.println("프그램을 종료합니다. ");
	}

}
