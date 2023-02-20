package ch04;

public class ArrCopy1 {
	public static void main(String[] args) {
		int[] arr1 = {34, 77, 55};
		int[] arr2 = arr1; // 주소를 복사하여 전달한 것임.	
		
		int[] arr3 = new int[arr1.length]; // 데이터를 하나씩 복사하여 전달
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		arr1[1] = 150;
		
		for(int a1 : arr1) {
			System.out.print(a1 + " ");
		}
		System.out.println("\n----------");
		for(int a2 : arr2) { // arr1의 주소에 있는 값을 출력하므로 똑같다.
			System.out.print(a2 + " ");
		}
		System.out.println("\n----------");
		for(int a3 : arr3) { // 값을 전달받았으므로 서로 다른 데이터
			System.out.print(a3 + " ");
		}
	}

}
