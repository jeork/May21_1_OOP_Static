// 생성자 (Constructor)
//		객체가 만들어질때 뭔가 작업을 해야하는데
//		=> 생성자 만들기!
//		리턴이 아예 없고, 메소드명이 클래스명과 같은 메소드
// 		생성자를 만들지 않으면 
//		=> 자바 컴파일러가 기본생성자를 만들어버림
//		생성자를 건드리면 
//		=> 자바 컴파일러가 기본 생성자를 안만들어줌
//		=> 시스템이 자동으로 객체를 만들때가 있는데
// 		=> 기본 생성자를 씀 => 에러!

public class Shoes {

	String name;
	static int size = 295;
	int price;
	static String brand = "nike";

	// 기본 생성자 (Ctrl + Space)
	public Shoes() {

	}
	
	// 생성자 오버로딩
	public Shoes(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}




	public void print_info() {
		System.out.printf("제품명\t: %s\n", name);
		System.out.printf("사이즈\t: %d\n", size);
		System.out.printf("가격\t: %,d원\n", price);
		System.out.printf("브랜드\t: %s\n", brand);
	}
}
