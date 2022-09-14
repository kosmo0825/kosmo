package Chapter07.EX01;

class Circle{
	int radius; 
	String name; 
	
	Circle (int radius, String name){
		this.radius = radius; 
		this.name = name; 
	}
	
	void call() {
		double area = 3.14 * radius * radius; 
		System.out.println(name + "의 넓이는 "+ area + " 입니다. ");
	}
}

public class Using_Method02 {
	public static void main(String[] args) {

		Circle pizza = new Circle(10, "피자"); 
		pizza.call();
		
		Circle donut = new Circle(5, "도넛"); 
		donut.call();

		// 원의 지름을 넣었을때 전체 넓이를 구하는 객체를 생성후 출력해 보세요. 
		//    피자 : 10 (반지름)
		//    도넛 : 5  (반지름)
		
		//  <피자>의 넓이는 <00> 입니다.  
		//  <도넛>의 넓이는 <00> 입니다. 
		
		//객체 생성 
	}

}
