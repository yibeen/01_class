package class_;

public class Variable {
	static int b;
	static double c;
	int d;
	
	public static void main(String[] args) {
		//지역변수 (local variable)

		short a =65; //0100 0001
		int b = 65;
		
		System.out.println("지역변수 a = "+ a);
		System.out.println("지역변수 b = "+ b);
		
		System.out.println("필드 b = " + Variable.b);
		System.out.println("필드 c = " + c);
		//System.out.println("필드 c = " + new Variable().d);
		
		Variable v = new Variable(); // 생성
		System.out.println("객체 v = " + v);
		System.out.println("필드 c = " + v.d);
	}
}