package chapter10.EX06;

class Animal {
	//자식 클래스에서 2개의 메소드를 오버 라이딩 
	// Animal 타입으로 정의, 배열에 저장후, 오버라이딩된 메소드 출력 (for, Enhanced For) 
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다. ");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이는 달립니다. ");
	}
	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다. ");
	}
	
}
class Egle extends Animal{
	@Override
	void run() {
		System.out.println("독수리는 하늘을 나릅니다. ");
	}
	@Override
	void eat() {
		System.out.println("독수리는 고기를 먹습니다. ");
	}
}
class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기는 헤엄을 칩니다 ");
	}
	@Override
	void eat() {
		System.out.println("물고기는 해초를 먹습니다.");
	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("개는 껑충껑충 뜁니다. ");
	}
	@Override
	void eat() {
		System.out.println("개는 고기를 먹습니다. ");
	}
}


public class Using_Method_Overriding03 {
	public static void main(String[] args) {
		// 1. 객체 생성 (Animal 타입으로 생성 )
		Animal a1 = new Animal(); 
		Animal a2 = new Tiger(); 
		Animal a3 = new Egle(); 
		Animal a4 = new Fish(); 
		Animal a5 = new Dog(); 
		
		//Animal 의 메소드 호출 
		a1.eat();
		a1.run();
		a2.eat();
		a2.run();
		a3.eat();
		a3.run();
		a4.eat();
		a4.run();
		a5.eat();
		a5.run();
		
		//배열에 객체를 저장 : Animal객체를 배열에 저장 
		Animal[] arr1 = new Animal[] {a1,a2,a3,a4,a5};
		
		//For 문을 사용해서 배열의 내용을 출력 
		System.out.println("==For 문을 사용해서 출력 == ");
		for (int i=0 ; i<arr1.length; i++) {
			Animal aa1 = arr1[i]; 
			aa1.run();			//Animal 의 메소드 호출 
			aa1.eat();			//Animal 의 메소드 호출 
		}
		
		//Enhanced For 문을 사용해서 출력 
		System.out.println("==Enhanced For를 사용해서 출력 ==");
		for ( Animal k : arr1) {
			k.eat();		//Animal의 메소드 : 오버라이딩된 메소드가 출력
			k.run();		////Animal의 메소드 : 오버라이딩된 메소드가 출력
		}
		
		

	}

}
