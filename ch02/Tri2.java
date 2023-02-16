package ch02;

public class Tri2 {
	public static void main(String[] args) {
		int num = 243; // 게시판에 저장된 글 수 num이 270개
		
		int noOfPage = 10; // 한 페이지에 글을 10개씩 게시
		int page = (num % noOfPage == 0) ? num / noOfPage  : num / noOfPage + 1;   // 몇 페이지가 필요할까?
		System.out.printf("글 개수가 %d인 경우 %d페이지 필요해", num, page);
		
	
	}

}
