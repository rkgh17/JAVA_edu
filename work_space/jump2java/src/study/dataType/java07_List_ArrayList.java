package study.dataType;

import java.util.ArrayList;
import java.util.Arrays;

public class java07_List_ArrayList {
    public static void main(String[] args) {

        // ArrayList를 만드는 다양한 방법들

        // Arrays.asList() : 이미 존재하는 배열을 통해 만들기
        String[] data = {"0", "1", "2"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches); // [0, 1, 2]

        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList("2","1","0"));
        System.out.println(pitches2); // [2, 1, 0]

        // String.join : 배열 요소를 뽑아서 하나의 문자열로
        String stJoin = String.join(",", pitches);
        System.out.println(stJoin); // 0,1,2


    }
}
