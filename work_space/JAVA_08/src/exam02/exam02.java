package exam02;

import java.util.ArrayList;
import java.util.List;

public class exam02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("휴먼");
		list.add("교육");
		list.add("센터");
		list.add("휴먼");
		//add는 가장 뒤에 배열을 늘려서 추가
		System.out.println(list);
		
		String str1 = list.get(2);
		// get은 특정위치의 값을 얻어옴
		System.out.println(str1);
		
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(1));
		

	}

}
