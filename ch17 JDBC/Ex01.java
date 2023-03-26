package ch17;

import java.util.Scanner;
// 입력,수정,삭제, 조회 요청을 받는 클래스
// ex) 주문을 받는 클래스 -> 나중에 web(html,jsp) 배우면 이걸로 변경할 예정
// 주문서 (웹)

public class Ex01 { // 데이터를 받는 역할
	private static CustomerServiceImpl cs = new CustomerServiceImpl();
	// 화면에서 받아오는게 정석인데 지금은 콘솔에서 받아오니까 scanner를 불러오는 것이다.
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while(true) {
			help();
			String command = sc.nextLine();
			if (command.equals("6")) break;
			else if (command.equals("1")) insert();
			else if (command.equals("2")) update();
		
		}
		System.out.println("프로그램 종료");
		sc.close();
		// 입력수정삭제는 성공한 개수를 반환해야하므로 정수 타입 반환, 조회는 객체 타입
	}
	private static void update() {
		System.out.println("수정할 아이디를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("암호를 입력하세요");
		String pass = sc.nextLine();
		
		System.out.println("암호확인을 입력하세요");
		String passConfirm = sc.nextLine();
		if (!pass.equals(passConfirm)) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		
		System.out.println("이메일을 입력하세요");
		String email = sc.nextLine();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
//		데이터를 묶어야 customer만 전달하면 id, pass, email, name이 같이 전달된다
		Customer customer = new Customer(id, pass, email, name);
		int result = cs.update(customer);
		if (result > 0) System.out.println("수정에 성공하였습니다");
		else System.out.println("수정에 실패하였습니다");
	
	}
	
	
	private static void insert() {
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("암호를 입력하세요");
		String pass = sc.nextLine();
		
		System.out.println("암호확인을 입력하세요");
		String passConfirm = sc.nextLine();
		if (!pass.equals(passConfirm)) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
		
		System.out.println("이메일을 입력하세요");
		String email = sc.nextLine();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
//		데이터를 묶어야 customer만 전달하면 id, pass, email, name이 같이 전달된다
		Customer customer = new Customer(id, pass, email, name);
		int result = cs.insert(customer);
		if (result > 0) System.out.println("입력에 성공하였습니다");
		else System.out.println("입력에 실패하였습니다");
	}
	
	private static void help() {
		System.out.println("다음 중에서 선택하시오");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 목록");
		System.out.println("6. 종료");
		System.out.print("명령번호 → ");
		
	}

}
