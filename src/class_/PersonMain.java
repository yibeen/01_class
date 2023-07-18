package class_;

class Person {
	private String name;
	private int age;
	
	public void setName(String n){
		name = n; // 중간자 - 문이빈이 name에 들어가지 못하니까 문이빈을 n에게 n이 name에게 준다.
	}
	public void setAge(int a) { // return 값없으면 public void
		age = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	public void setData() {}
}

//--------------------------
public class PersonMain {

	public static void main(String[] args) {
		Person aa = new Person();  // aa = 객체
		aa.setName("문이빈");
		aa.setAge(28);
		System.out.println("객체 aa = " + aa);
		System.out.println(aa.getName() +"\t"+aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		bb.setName("문우빈");
		bb.setAge(21);
		System.out.println("객체 bb = " + bb);
		System.out.println(bb.getName() +"\t"+bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("코난", 35);
		System.out.println("객체 cc = " + cc);
		System.out.println(cc.getName() +"\t"+cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setData();
		System.out.println("객체 dd = " + dd);
		System.out.println(dd.getName() +"\t"+dd.getAge());
		System.out.println();
		
	}
}
