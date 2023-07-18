package class_;

public class Method01 {
	
	public static void disp() { // 구현
		System.out.println("static method...");
	}

	public void output() { // 구현
		System.out.println("non-static method...");
		
	}

	public static void main(String[] args) {
		Method01.disp();             // Method01 클래스 안에 있는 disp( )함수 호출
		Method01 m = new Method01(); // static이 아닌 output()함수의 호출
		m.output();
	}
}
