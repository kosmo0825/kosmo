package Chapter07.EX01;

public class Using_Method06_1 {
	static int add (int[] a ) {
		//들어온 배열의 모든 값을 더해서 더한 값을 리턴 
		int sum = 0 ; 
		for (int i = 0 ; i <a.length; i++) {
			sum += a[i];  
		}
		return sum; 
	}
	
	static int div (int[] a ) {
		//들어온 배열의 모든 값을 빼서을 뺀값을 리턴 
		int diff =7 ;
		for (int i = 0 ; i <a.length; i++) {
			if (i ==0) {continue;}
			diff -= a[i]; 
		}
		return diff; 
	}
	static long mul (int[] a ) {
		//들어온 배열의 모든 값을 곱해서 곱한값을 리턴 
		long mul = 1 ; 
		for (int i = 0 ; i <a.length; i++) {
			mul *= a[i]; 
		}
		return mul; 
	}
	
	static double avg (int[] a ) {
		//들어온 배열의 모든 값을 평균값을 리턴 
		int sum = 0 ; 
		for (int i = 0 ; i <a.length; i++) {
			sum += a[i];  
		}
		double avg = sum/a.length ; 
		return avg; 
	}
	
	public static void main(String[] args) {
		//1 ~ 100까지 7의 배수만 저장후 각 메소드 호출 
		
				//완료시간 : 13: 20분까지 
				
				//배열의 값을 입력 
				int[] arr1 = new int[100/7]; 
				for (int i =0, j=7 ; i < arr1.length;i++, j+=7) {
					arr1[i] =j; 			
				}
				System.out.println("======1~ 100 까지 7의 배수 출력 ======");
				
				//배열의 값을 출력 
				for (int i=0 ; i <arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.println();
				
				System.out.println("===============");
				
				System.out.println("더한값 : " + add (arr1) );
				div (arr1); 	// 배열의 모든값 빼기
				System.out.println("뺀값 : " + div(arr1));
				mul (arr1); 	// 배열의 모든값 곱하기
				System.out.println("곱한값 : " + mul(arr1));
				avg (arr1); 	// 배열의 모든값 평균
				System.out.println("평균갑 : " + avg(arr1));
				

	}

}
