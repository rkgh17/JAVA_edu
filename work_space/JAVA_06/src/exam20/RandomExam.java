package exam20;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		//선택 번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		// 컴퓨터에서 난수를 발생시키는 기준인 seed라는 것이 있음.
		// 3은 seed를 의미함
		System.out.print("선택 번호: ");
		for(int i = 0 ; i<selectNumber.length ; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			// nextint는 1부터 45까지의 난수를 뽑는것
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		for(int i = 0 ; i<winningNumber.length ; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부: ");
		if(result)
			System.out.println("1등 당첨");
		else
			System.out.println("당첨되지 않았습니다");
	}

}
