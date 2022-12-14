package chapter10.EX04;

//업 캐스팅 : 자동으로 변환됨 (컴파일러가 자동으로 할당) 
	// 기본 자료형 : 좁은(int) ==> 넓은 범위(double)  
	// 상속      : 자식 타입  == 부모 타입 
//다운 캐스팅 : 수동으로 직접 해야한다. , 
	// 기본 자료형 : 넓은 범위 (double) => 좁은 (int)  , (자료가 소실) 
	// 상속 : 부모 타입 ==> 자식 타입 , ( 실행시 오류가 발생 될수 있다. )

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Using_TypeCasting {
	public static void main(String[] args) {
		//1. 업캐스팅 (자동으로 변환 ) : 생략시 컴파일러가 자동으로 추가. 
		A ac = (A) new C();  // C --> A 업캐스팅 
		B bc = (B) new C();  // C --> B 업캐스팅 
		
		//bb는 A, B 포함하고 있고, B 타입으로 지정 (A, B 모두 사용됨) 
		B bb = new B(); 
		A a = (A) bb; 			// B --> A 업캐스팅  (A 필드, 메소드) 
		
		//2. 다운 캐스팅 (수동으로 직접 할당) : 캐스팅이 불가능한 경우 실행시 오류
				//다운 캐스팅이 불가한 경우 
		A aa = new A();  //aa는 A 타입만 내포하고 있다. 
//		B b = (B)aa;   	 //aa는 B 타입을 내포하고 있지 않으므로 다운 캐스팅을 할 수 없다. 
						// 구문에는 문제가 없고, 실행시 문제(예외) 발생 , 
//		C c = (C)aa; 	//aa는 C 타입을 내포하고 있지 않아서 다운 캐스팅이 불가함. 
						// 구문에는 문제가 없다, 실행시 오류 발생 
		
		//3. 다운 캐스팅 가능한 경우 
		A ab = new B();   //ab는 A, B 을 내포하고 있다, A 타입으로 지정됨 
		B b = (B)ab ; 	  // A(부모) --> B(자식)
//		C c = (C)ab; 	  //ab는 C 타입을 내포하고 있지 않음. 캐스팅이 불가능 
						  // 구문은 문제없다, 실행시 오류 발생
		
		B bd = new D(); //bd는 A,B,D를 내포하고 있고, B타입으로 지정 
						//bd는 A,B 의 필드와 메소드를 접귽 
		D d = (D)bd;    //bd는 D를 내포하므로 B->D  //다운캐스팅 
						//d는 A, B, D 의 모든 필드와 메소드를 사용가능 
//		C c = (C)bd;    //bd는 C를 내포하고 있지 않는다. 캐스팅이 불가능 
						// 구문에는 문제가 없고, 실행시 오류 
		
		A ad = new D();   //ad는 A,B,D를 포함하고 있다. A타입으로 지정됨 
		B b1 = (B) ad; 	  // A - > B 타입으로 다운 캐스팅 
		D d1 = (D) ad; 	  // A - > D 타입으로 다운 캐스팅 
//		C c5 = (C) ad;    // ad는 c 타입을 내포하고 있지 않으므로 캐스팅 불가
						//구문에는 문제가 없고 실행시 오류 발생 . 
		
				
		

	}

}
