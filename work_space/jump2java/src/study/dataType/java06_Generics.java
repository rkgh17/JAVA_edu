package study.dataType;

import java.util.ArrayList;

public class java06_Generics {
    public static void main(String[] args) {

        // Generics
        // 명확한 타입체크가 가능해진다.
        ArrayList<String> pitches = new ArrayList<>();
        // pitches라는 ArrayList안에 담을 수 있는 자료형은 String뿐이다.


        // 제네릭스를 사용하지 않은 경우
        ArrayList arr = new ArrayList();
        arr.add("0");
        arr.add("1");

        String zero = (String) arr.get(0);
        String one = (String) arr.get(1);
        // 형변환이 반드시 필요...

        // 제네릭스를 사용하는 경우
        ArrayList<String> arrGnr = new ArrayList<>();
        arrGnr.add("0");
        arrGnr.add("1");

        String gnrZero = arrGnr.get(0);
        String gnrOne = arrGnr.get(1);
        // 형변환 불필요
        // 잘못된 형변환에 의한 런타임 오류를 방지할 수 있다.
    }
}
