package study.dataType;

import java.util.Arrays;
import java.util.HashSet;

public class java09_Set {
    public static void main(String[] args) {

        // Set
        // collection 인터페이스를 상속받은 자료형.
        // 특징
        //  중복을 허용하지 않음.
        //  순서가 없다.
        //  집합을 구하는데 유용함. (교집합, 합집합, 차집합)

        HashSet<String> set = new HashSet<>(Arrays.asList("H","E","L","L","O"));
        System.out.println("HashSet 출력 :"+ set); // E, H, L, O
        System.out.println();

        // 이외의 Set 자료형
        // 1. TreeSet
        //      오름차순으로 값을 정렬하여 저장하는 특징이 있다.
        //
        // 2. LinkedHashSet
        //      입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.

        // 교집합 - retainAll
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1); // s1 복사
        intersection.retainAll(s2); // 교집합 수행
        System.out.println("HashSet 교집합 출력 :"+ intersection);
        System.out.println();

        // 합집합 - addAll
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2); // 합집합 수행
        System.out.println("HashSet 합집합 출력 :"+ union);
        System.out.println();

        // 차집합 - removeAll
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2); // 차집합 수행
        System.out.println("HashSet 차집합 출력 :"+ substract);
        System.out.println();

        // add : 자료 추가
        HashSet<String> addSet = new HashSet<>();
        addSet.add("Jump");
        addSet.add("To");
        addSet.add("Java");
        System.out.println("HashSet add 출력 :"+ addSet);
        System.out.println();

        // addAll : 자료 여러개 추가
        HashSet<String> addAllSet = new HashSet<>();
        addAllSet.addAll(Arrays.asList("To", "Java", "133"));
        System.out.println("HashSet addAll 출력 :"+ addAllSet);
        System.out.println();

        // remove : 특정 값 제거
        HashSet<String> setRemove = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        setRemove.remove("To");
        System.out.println("HashSet remove 출력 :"+ setRemove);
        System.out.println();

    }
}
