package Exam_02;

import java.util.Scanner;

public class Human14Input99_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("숫자를 입력하시오 : ");
		a = sc.nextInt();

		for (int i = a-1 ; i > 1; i--) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d \n", i, j, i * j);
			}
			System.out.println("------------------------------------------");
		}

	}

}
