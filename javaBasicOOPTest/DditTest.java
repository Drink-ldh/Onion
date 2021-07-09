package javaBasicOOPTest;

public class DditTest {

	public static void main(String[] args) {
		// === 자바프로그래밍 초급 객체지향 성취평가 ===
		//
		// ++ 평가 방법 ++
		// 1. https://github.com/tablet7823/ddit/tree/main/JAVA_homework/JAVABasicOOPTest 에 접속합니다.
		// 2. 업로드되어있는 파일을 다운로드 혹은 내용을 복사해 동일한 패키지 내에 class로 작성합니다.
		// [DditTest.java, Ddit.java, ClassRoom.java, Student.java, Teacher.java, Human.java, NotTeacherException.java, NotConfirmException.java]
		// 3. 업로드되어있는 클래스를 모두 이용해야합니다.
		// 4. DditTest.java 내 main메서드를 제외한 메서드의 내용을 작성합니다.
		// 5. DditTest.java 파일을 실행하여 README.text 와 동일한 출력 결과를 확인합니다. (주석제외)
		//
		// ++ 제출 방법 ++
		// 1. 패키지내의 파일 모두를 담임 메일로 보냅니다.
		//  -> java 파일이 첨부되지 않을때는 압축하여 첨부합니다.
		// 메일 주소 : tablet7823@daum.net
		// 메일 제목 : [초프 레벨테스트] 성함
		// 본문 내용 : 파일로 제출하므로 작성하지 않아도 무방하나, 담임에게 하고싶은 말이나 프로젝트 조 편성에 고려해주었으면 하는 내용을 작성합니다.
		//  -> 약식 상담에서 말했더라도 담임은 까먹었을 확률이 높으니 꼭 작성해줍니다.
		//
		// ++ 평가 결과 ++
		// 1. 초급프로젝트 조 편성에 이용됩니다.
		// 2. 대덕인재개발원 주관으로 진행하는 것이 아닌 담임 주관 성취평가입니다.
		// 3. 앞선 두 평가(혹은 셋)를 포함한 합계점수를 고려하여 조 편성을 진행합니다.
		
		Teacher[] teachers = new Teacher[5];
		teachers[0] = new Teacher("송중호", "남");
		teachers[1] = new Teacher("김승섭", "남");
		teachers[2] = new Teacher("김형민", "남");
		teachers[3] = new Teacher("배미숙", "여");
		teachers[4] = new Teacher("박성룡", "남");
		
		ClassRoom[] classRooms = new ClassRoom[5];
		classRooms[0] = new ClassRoom(401, teachers[0]);
		classRooms[1] = new ClassRoom(402, teachers[1]);
		classRooms[2] = new ClassRoom(403, teachers[2]);
		classRooms[3] = new ClassRoom(404, teachers[3]);
		classRooms[4] = new ClassRoom(406, teachers[4]);
		
		Ddit ddit = new Ddit();
		for(int i = 0; i < classRooms.length; i++) {
			ddit.addClassRoom(classRooms[i]);
		}
		ddit.showClassRoomList();
		System.out.println();
		
		Student[] students = new Student[25];
		students[0] = new Student("강주희", "여", 32);
		students[1] = new Student("구현수", "남", 29);
		students[2] = new Student("권영채", "남", 31);
		students[3] = new Student("김다윤", "여", 27);
		students[4] = new Student("김주현", "여", 25);
		students[5] = new Student("박수정", "여", 27);
		students[6] = new Student("박해성", "남", 28);
		students[7] = new Student("봉현민", "남", 33);
		students[8] = new Student("서유리", "여", 28);
		students[9] = new Student("서혜란", "여", 28);
		students[10] = new Student("안대근", "남", 27);
		students[11] = new Student("유영진", "남", 27);
		students[12] = new Student("유재면", "남", 34);
		students[13] = new Student("유제이", "남", 26);
		students[14] = new Student("윤주원", "남", 29);
		students[15] = new Student("윤효주", "여", 32);
		students[16] = new Student("이나영", "여", 27);
		students[17] = new Student("이인환", "남", 27);
		students[18] = new Student("이준석", "남", 27);
		students[19] = new Student("이희열", "여", 27);
		students[20] = new Student("임창균", "남", 26);
		students[21] = new Student("임태희", "남", 31);
		students[22] = new Student("조원혜", "여", 25);
		students[23] = new Student("최가현", "여", 21);
		students[24] = new Student("한주연", "여", 24);
		
		int cnt = 0;
		for(int i = 0; i < ddit.getTotalClassRoom(); i++) {
			System.out.println(ddit.getClassRoom(i).getClassNumber() + "호에 학생 배치...");
			while(cnt < 25) {
				if(!ddit.getClassRoom(i).addStudent(students[cnt])) break;
				else cnt++;
			}
			System.out.println();
			ddit.getClassRoom(i).showClassInfo();
			System.out.println();
		}
		
		ddit.getClassRoom(0).showStudentInfo(teachers[4], 0);
		System.out.println();
		
		ddit.getClassRoom(4).showStudentInfo(teachers[4], 0);
		System.out.println();
		
		ddit.getClassRoom(4).showStudentInfo(students[4], 0);
		System.out.println();
		
		ddit.getClassRoom(4).showStudentInfo(students[24], 0);
		System.out.println();
		
		ddit.getClassRoom(4).showStudentInfo(students[24], 10);
		System.out.println();
		
		ddit.getClassRoom(4).showStudentInfo(students[24], 4);
	}
}
