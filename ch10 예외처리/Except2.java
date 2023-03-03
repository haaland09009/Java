package ch10;
import java.util.Scanner;

public class Except2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		while(true) {
			System.out.println("첫번째 숫자를 입력하세요");
			String str = sc.nextLine();
			if (str.equals("x")) break;
			try { // 하나의 try에 catch 여러 개 사용 가능
				num1 = Integer.parseInt(str);
				System.out.println("두번째 숫자를 입력하세요");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			} catch(ArithmeticException e) { // 0으로 나누는 경우
				System.out.println("0으로 나눌 수 없습니다.");
			} catch(NumberFormatException e) { // 문자열을 숫자로 바꾸려 할 때
				System.out.println("숫자가 아닙니다.");
			} catch (Exception e) { // 혹시 다른 에러가? , 범위가 넓은 것은 뒤에 배치를 권장한다.
				System.out.println(e.getMessage());
			} finally {  // 예외 여부와 관계없이 무조건 실행하는 명령어
				System.out.println("무조건 실행됩니다.");
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

}
