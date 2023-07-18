package class_;

public class SungJuk {
	필드 : name, kor, eng, math, tot, avg, grade
	메소드 : setData(이름, 국어, 영어, 수학)
	      calcTot()
	      calcAvg()
	      calcGrade()
	      getName()
	      getKor()
	      getEng()
	      getMath()
	      getTot()
	      getAvg()
	      getGrade()
	      평균은 소수 이하 둘째 자리까지
	
public class SungJukMain {
	
	public static void main(String[] args) {
		
	}
}

}
[실행 결과]
이름 국어 영어 수학 총점 평균 학점
홍길동 95 84 78

총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
학점 평균이 90이상이면 A
학점 평균이 80이상이면 B
학점 평균이 70이상이면 V
학점 평균이 60이상이면 D
그 외는 F

