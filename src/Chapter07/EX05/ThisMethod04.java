package Chapter07.EX05;

class Car {
	
	// this 키워드 : 필드나 메서드 선언시 사용 불가. 
	//             - 생성자, 메서드 내부에서 필드나 메서드를 사용할때 자신의 객체 필드나 메서드를 지칭
	//			   - 자신의 객체의 필드, 메서드를 가르킨다. 기본적으로 생략해서 많이 사용. 
	//             - 반드시 사용해야 할 경우 : 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일할 경우
	// this ()     - 생성자 내부에서만 사용 , 반드시 첫 라인에 위치 
	//			   - 자신의 객체의 다른 생성자를 호출 
	//			   - 생성를 오버라이딩 할 때, 코드를 간략 하게 사용
	
	String companyName; 	//현대자동차 
	String color; 			//검은색 
	double maxSpeed; 		//200.0 km/h
	
	//생성자
	Car() {	// 리턴 타입이 없다 , 클래스이름과 동일
		this.companyName = "현대자동차"; 	//this 키를 생략시 자동으로 컴파일러가 할당
		this.color  = "검은색"; 
		this.maxSpeed = 200.0; 
	}
	Car(String companyName){	// 매개변수 이름 , 필드이름이 같을때
		this(); 			// this() 메소드 , 기본 생성자 호출 
		this.companyName  = companyName; 	
	}
	Car(String companyName, String color){
		this(companyName); 
		this.color = color; 
	}
	Car (String companyName, String color, double maxSpeed){
		this(companyName, color); 
		this.maxSpeed = maxSpeed; 	
	}
			
	//필드의 모든 값을 출력 메소드 (print())
	void print () {
		System.out.println(companyName + "," + color + "," + maxSpeed); 
	}
	
}

public class ThisMethod04 {
	public static void main(String[] args) {
		//this keyword , this Method 를 사용해서 처리. 
		
		// 1. 매개 변수 0개일때 , 기본 필드의 값출력
		Car car0 = new Car(); 	
		car0.print();
		
		// 2. 매개변수 1개일때, companyName만 출력, 나머지는 기본값 출력 
		Car car1 = new Car("쌍용자동차"); 
		car1.print();
		
		// 3. 매개변수 2개일때 
		Car car2 = new Car("기아자동차", "푸른색"); 
		car2.print();
		
		// 4. 매개변수 3개일때. 
		Car car3 = new Car("삼성자동차", "빨간색", 300.0); 
		car3.print();

	}

}
